package pl.damianbugalski.ExercisesOneSpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.damianbugalski.ExercisesOneSpringMVC.model.Person;

import java.util.Map;

/**
 * Created by Damian on 16.11.2017.
 */
@Controller
public class PersonController {

    @GetMapping("/person/add")
    public String add(Map personAdd){
        return "/person/add";
    }

    @PostMapping("/person/show")
    public String create(@ModelAttribute Person person, ModelMap modelMap){
        modelMap.addAttribute("person", person);
        return "/person/show";
    }

}
