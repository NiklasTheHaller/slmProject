package com.example.slmproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmProjectApplicationTests {

    @Test
    void msgTest(){
        MessageScreen calculatorController = new MessageScreen();

        String msg = "Test Message";


        String result = calculatorController.msg(msg);

        assertEquals("Test Message", result);
    }

}
