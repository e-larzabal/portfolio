package com.wcs.checkpoint2.portfolio.service;


import com.wcs.checkpoint2.portfolio.model.MyUserDetails;
import com.wcs.checkpoint2.portfolio.model.Role;
import com.wcs.checkpoint2.portfolio.model.User;
import com.wcs.checkpoint2.portfolio.repository.RoleRepository;
import com.wcs.checkpoint2.portfolio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


@Service
@Transactional
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);

        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }

        List<Role> roles = new ArrayList<>();
        Method method = getMethod(user, "getRoles", new Class[]{});
        if (method != null) {
            try {
                roles = (List<Role>) method.invoke(user);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }
        }

        user.setRoles(roles);

        return new MyUserDetails(user);
    }

    public Method getMethod(Object obj, String methodName, Class[] args) {
        Method method;
        try {
            method = obj.getClass().getDeclaredMethod(methodName, args);
            return method;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return null;
    }
}
