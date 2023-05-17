package com.example.slmproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageScreen {

    @RequestMapping("/message")
    public String msg(@RequestParam String msg) {

        return msg;
    }


}
