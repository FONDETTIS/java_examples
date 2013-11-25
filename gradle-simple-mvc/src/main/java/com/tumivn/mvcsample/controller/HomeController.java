/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tumivn.mvcsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String loadIndexPage(Model model) {
        model.addAttribute("title", "Hello Spring MVC!");
        return "index";
    }
}