package de.lebk.dazapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class DaZController {

    @GetMapping
    @ResponseBody
    public String index() {
        return "Moin";
    }
}
