package com.wcs.checkpoint2.portfolio.service;

import com.wcs.checkpoint2.portfolio.model.Privilege;
import com.wcs.checkpoint2.portfolio.model.Role;
import com.wcs.checkpoint2.portfolio.model.User;
import com.wcs.checkpoint2.portfolio.repository.PrivilegeRepository;
import com.wcs.checkpoint2.portfolio.repository.RoleRepository;
import com.wcs.checkpoint2.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
public class SetupDataLoader implements ApplicationListener<ContextRefreshedEvent> {

    boolean alreadySetup = false;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PrivilegeRepository privilegeRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PrivilegeService privilegeService;

    @Autowired
    private UserService userService;

    @Override
    @Transactional
    public void onApplicationEvent(ContextRefreshedEvent event) {

        if (alreadySetup) return;

        // creating the privileges
        Privilege readPrivilege = createPrivilegeIfNotFound("READ_PRIVILEGE");
        Privilege writePrivilege = createPrivilegeIfNotFound("WRITE_PRIVILEGE");
        List<Privilege> adminPrivileges = Arrays.asList(readPrivilege, writePrivilege);

        // creating the roles and assigning the privileges to them
        createRoleIfNotFound("ROLE_ADMIN", adminPrivileges);
        createRoleIfNotFound("ROLE_USER", Arrays.asList(readPrivilege));

        // creating a user and assigning a role to it
        Role adminRole = roleRepository.findByName("ROLE_ADMIN");
        if (adminRole.getUuid() == null) {
            User user = new User();
            user.setUsername("Test");
            user.setFirstName("Test");
            user.setLastName("Test");
            user.setPassword(passwordEncoder.encode("test"));
            user.setEmail("test@test.com");
            user.setRoles(Arrays.asList(adminRole));
            user.setEnabled(true);
            user = userService.create(user); // TO VALID
            userRepository.save(user);
        }

        alreadySetup = true;
    }

    @Transactional
    Privilege createPrivilegeIfNotFound(String name) {

        Privilege privilege = privilegeRepository.findByName(name);
        if (privilege == null) {
            privilege = new Privilege(name);
            privilege = privilegeService.create(privilege); // TO VALID
            privilegeRepository.save(privilege);
        }
        return privilege;
    }

    @Transactional
    Role createRoleIfNotFound(String name, List<Privilege> privileges) {

        Role role = roleRepository.findByName(name);
        if (role == null) {
            role = new Role(name);
            role.setPrivileges(privileges);
            role = roleService.create(role); // TO VALID
            roleRepository.save(role);
        }
        return role;
    }
}
