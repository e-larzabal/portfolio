package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Role;
import com.wcs.checkpoint2.portfolio.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.UUID;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/admin/roles")
    public String getAll(Model model) {
        // find all roles
        model.addAttribute("roles", roleService.list());
        return "roles";
    }

    @GetMapping("/admin/role")
    public String getRole(Model model, @RequestParam(required = false) UUID uuid) {
        // find one role by uuid
        Role role = new Role();
        if (uuid != null) {
            Optional<Role> optionalRole = roleService.find(uuid);
            if (optionalRole.isPresent()) {
                role = optionalRole.get();
            }
        }
        model.addAttribute("role", role);
        return "role";
    }

    @PostMapping("/admin/role")
    public String postRole(@ModelAttribute Role role) {

        if (role.getUuid() == null) {
            // create a role
            roleService.create(role);
        } else {
            // update a role
            roleService.update(role);
        }

        return "redirect:/admin/roles";
    }

    @GetMapping("/admin/role/delete")
    public String deleteRole(@RequestParam UUID uuid) {
        // delete a role
        roleService.delete(uuid);
        return "redirect:/admin/roles";
    }
}
