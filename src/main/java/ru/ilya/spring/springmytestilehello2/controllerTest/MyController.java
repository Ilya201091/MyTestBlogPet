package ru.ilya.spring.springmytestilehello2.controllerTest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: Ilya Shaporto
 * created : 24.09.2022
 * description:
 */

@Controller
public class MyController {
    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("name", "Илья");
        return "home";
    }

    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("name", "Илья");
        return "about";
    }
}
