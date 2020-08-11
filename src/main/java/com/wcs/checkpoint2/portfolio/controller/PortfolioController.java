package com.wcs.checkpoint2.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PortfolioController {

    @GetMapping("/portfolioBootstrap")
    public String getPortfolioBootstrap() {
        return "/profile-master/index";
    }

    @GetMapping("/portfolio")
    public String getPortfolio() {
        return "portfolio";
    }
}
