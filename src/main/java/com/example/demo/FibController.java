package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FibController {

//Note to self: create multiple controllers for the different Thymeleaf inputs of each recursion statement.
    @GetMapping("/recursiveTests") //for the parameters name, need fibInput
    public String recursiveTests(@RequestParam(name="fibinputter", required=false, defaultValue= "0") String fibInput, @RequestParam(name="baseinputter", required=false, defaultValue= "0") String baseInput, @RequestParam(name="exponentinputter", required=false, defaultValue= "0") String exponentInput, @RequestParam(name="firstinputter", required=false, defaultValue= "0") String firstFactor, @RequestParam(name="secondinputter", required=false, defaultValue= "0") String secondFactor,  @RequestParam(name="palinputter", required=false, defaultValue= "uwu") String paliString, Model model) {
        //NOTE: HTML only passes strings, not integers. We have to convert to string
        //We need "Model model" to show we are connecting to an html page (our model)

        if (fibInput.equals(null)){ //These control statements are extremely important because they prevent whitelabel errors
            fibInput = "0";
        }
        if (firstFactor.equals(null)){
            firstFactor = "0";
        }
        if (secondFactor.equals(null)){
            secondFactor = "0";
        }
        if (baseInput.equals(null)){
            baseInput = "0";
        }
        if (exponentInput.equals(null)){
            exponentInput = "0";
        }
        if (paliString.equals(null)){
            paliString = "uwu";
        }


        int iterations = Integer.parseInt(fibInput);

        model.addAttribute("fibIterations", iterations); //the iterations of Fibonacci sequence. To be sent to HTML
        //Idea for future: have the paragraph tags appear if the value isn't OR initially is 0.

        FibonacciSequence fibMachine = new FibonacciSequence();

        model.addAttribute("fibValue", fibMachine.fibonacci(iterations,0,0));

        int powerBase = Integer.parseInt(baseInput);
        int powerExponent = Integer.parseInt(exponentInput);

        RepeatedMath mathMachine = new RepeatedMath(); //only need one for the multiplication

        model.addAttribute("baseValue", powerBase);
        model.addAttribute("exponentValue", powerExponent);
        model.addAttribute("exponentiatedValue", mathMachine.exponentiation(powerExponent, powerBase, powerBase));


        int factorOne = Integer.parseInt(firstFactor);
        int factorTwo = Integer.parseInt(secondFactor);
        model.addAttribute("factor_one", factorOne);
        model.addAttribute("factor_two", factorTwo);
        model.addAttribute("product", mathMachine.multiplication(factorOne,factorTwo, factorTwo));

        PalindromePractice paliChecker = new PalindromePractice();
        model.addAttribute("inputtedString", paliString); //Run a test if the parameter up at the top of the method counts as a Thymeleaf attribute
        model.addAttribute("paliQuality", paliChecker.stringInput(paliString));

        return "/recursiveTests";
    }

}
