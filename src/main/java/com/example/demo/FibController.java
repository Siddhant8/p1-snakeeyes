package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class FibController {

    @RequestMapping("/fibsequence")
    public String fibbingsequence() {
        return "/fibbingsequence";
    }

}
