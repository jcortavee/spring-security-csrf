package com.josecarlos.webappwithcsrf.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Logger;

@Controller
@RequestMapping("/product")
public class ProductController {

    private Logger logger = Logger.getLogger(ProductController.class.getName());


    @PostMapping("/add")
    public String add(@RequestParam String name) {
        logger.info("Adding product %s".formatted(name));

        return "main.html";
    }

}
