package com.codeup.codeupspringblogv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class DiceRollerController {
    @GetMapping("/roll-dice")
    public String rollDice(){
        return "/dice/dice-selector";
    }

    @GetMapping("/roll-dice/{n}")
    public String diceRevealer(@PathVariable int n  , Model model){
        Random random = new Random();
        int rando = random.nextInt(6) + 1;

        model.addAttribute("guess", n);
        model.addAttribute("randomNum", rando);
        return "/dice/dice-revealer";
    }
}
