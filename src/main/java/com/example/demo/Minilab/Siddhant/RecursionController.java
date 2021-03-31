package com.example.demo.Minilab.Siddhant;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
public class RecursionController {
    @GetMapping("/siddhantrecursion")
    public String nonrecursion(@RequestParam(name="num1", required=false, defaultValue="10") Integer num1,
                               @RequestParam(name="num2", required=false, defaultValue="10") Integer num2,
                               @RequestParam(name="num3", required=false, defaultValue="10") Integer num3,
                               @RequestParam(name="num4", required=false, defaultValue="10") Integer num4, Model model) throws IOException {

        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("gcf", Nonrecursion.normal(num1, num2));

        model.addAttribute("num3", num3);
        model.addAttribute("num4", num4);
        model.addAttribute("gcf1", Recursion.gcf(num3, num4));
        return "SiddhantMinilab/nonrecursion";
    }





}


