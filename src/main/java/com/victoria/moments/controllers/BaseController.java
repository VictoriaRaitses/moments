package com.victoria.moments.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

        @GetMapping("/")
        public String handle(Model model) {
            return "momentview";
        }
    }