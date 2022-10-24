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
public class BlogController {

    @GetMapping("/blog")
    public String blogMain(Model model) {
        return "blog-main";
    }
}
