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
    public String covid(@RequestParam(name="num1", required=false,  defaultValue="10") String days, Model model) throws IOException {
        int nth = Integer.parseInt(days);

        model.addAttribute("num1", Nonrecursion.driver());
        return "minilab/nonrecursion";
    }

}
