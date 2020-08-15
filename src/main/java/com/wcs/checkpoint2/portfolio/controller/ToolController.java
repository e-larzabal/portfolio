package com.wcs.checkpoint2.portfolio.controller;

import com.wcs.checkpoint2.portfolio.model.Tool;
import com.wcs.checkpoint2.portfolio.service.ToolService;
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
public class ToolController {
    @Autowired
    private ToolService toolService;

    @GetMapping("/tools")
    public String getAll(Model model) {
        // find all tools
        model.addAttribute("tools", toolService.list());
        return "tools";
    }

    @GetMapping("/tool")
    public String getTool(Model model, @RequestParam(required = false) UUID uuid) {
        // find one tool by uuid
        Tool tool = new Tool();
        if (uuid != null) {
            Optional<Tool> optionalTool = toolService.find(uuid);
            if (optionalTool.isPresent()) {
                tool = optionalTool.get();
            }
        }
        model.addAttribute("tool", tool);
        return "tool";
    }

    @PostMapping("/tool")
    public String postTool(@ModelAttribute Tool tool) {

        if (tool.getUuid() == null) {
            // create a tool
            toolService.create(tool);
        } else {
            // update a tool
            toolService.update(tool);
        }

        return "redirect:/tools";
    }

    @GetMapping("/tool/delete")
    public String deleteTool(@RequestParam UUID uuid) {
        // delete a tool
        toolService.delete(uuid);
        return "redirect:/tools";
    }
}
