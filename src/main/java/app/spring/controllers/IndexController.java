package app.spring.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

    @GetMapping("/{id}")
    public String index(Model m, @PathVariable("id") String id) {
        m.addAttribute("someAttribute", id);
        return id + " " + "hello";
    }
}