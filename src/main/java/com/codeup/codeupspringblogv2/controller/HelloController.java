package com.codeup.codeupspringblogv2.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {
    @RequestMapping(path = "/increment/{number}", method = RequestMethod.GET)
    @ResponseBody
    public String addOne(@PathVariable int number) {
        return number + " plus one is " + (number + 1) + "!";
    }



}
