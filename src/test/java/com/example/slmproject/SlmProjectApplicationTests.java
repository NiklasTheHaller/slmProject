package com.example.slmproject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SlmProjectApplicationTests {

    @Test
    void setmsgTest(){
        MessageScreen calculatorController = new MessageScreen();

        String msg = "Test Message";

        String result = calculatorController.setMsg(msg);

        assertEquals("Test Message", result);
    }

    @Test
    void displaymsgTest(){
        MessageScreen calculatorController = new MessageScreen();

        String msg = calculatorController.message;

        String result = calculatorController.setMsg(msg);

        assertEquals( msg, result);
    }


}
