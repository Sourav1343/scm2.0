package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    // This method handles requests to the "/home" URL
    @RequestMapping(value = "/home")
    public String home(Model model) {
        // Log a message indicating the handler has been invoked
        System.out.println("Home Page Handler");

        // Add a name attribute to the model, which can be accessed in the Thymeleaf template
        model.addAttribute("name", "SubString");

        // Add a YouTube channel name to the model
        model.addAttribute("YoutubeChannel", "Learning Coding");

        // Add a GitHub repository link to the model
        model.addAttribute("GitHubRepo", "Link of Repo");

        // Add a new attribute for a brief description about the website
        model.addAttribute("description", "This website is a platform to share coding knowledge.");

        // Add an attribute for the current year to display in the footer
        model.addAttribute("currentYear", 2024);

        // Return the name of the Thymeleaf template to render
        return "home"; // This refers to home.html in the templates directory
    }

    //about
    @RequestMapping(value = "/about")
    public String aboutpage(){
        return "about";
    }

    //service

    @RequestMapping(value = "/services")
    public String servicepage(){
        return "services";
    }

}
