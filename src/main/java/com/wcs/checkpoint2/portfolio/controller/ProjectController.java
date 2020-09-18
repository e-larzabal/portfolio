package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Project;;
import com.wcs.checkpoint2.portfolio.service.ProjectService;
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
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/admin/projects")
    public String getAll(Model model) {
        // find all projects
        model.addAttribute("projects", projectService.list());
        return "projects";
    }

    @GetMapping("/admin/project")
    public String getProject(Model model, @RequestParam(required = false) UUID uuid) {
        // find one project by uuid
        Project project = new Project();
        if (uuid != null) {
            Optional<Project> optionalProject = projectService.find(uuid);
            if (optionalProject.isPresent()) {
                project = optionalProject.get();
            }
        }
        model.addAttribute("project", project);
        return "project";
    }

    @PostMapping("/admin/project")
    public String postProject(@ModelAttribute Project project) {

        if (project.getUuid() == null) {
            // create a project
            projectService.create(project);
        } else {
            // update a project
            projectService.update(project);
        }

        return "redirect:/admin/projects";
    }

    @GetMapping("/admin/project/delete")
    public String deleteProject(@RequestParam UUID uuid) {
        // delete a project
        projectService.delete(uuid);
        return "redirect:/admin/projects";
    }
}
