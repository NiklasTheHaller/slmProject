package com.example.slmproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageScreen {

    public String message;

    @RequestMapping("/message/edit")
    public String setMsg(@RequestParam String msg) {

       message = msg;
       return message;
    }

    @RequestMapping("/message")
    public String displayMsg() {

        return message;
    }




}
