package com.example.demoTest;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyServiceTest {

    @Autowired MyService service;

    @Test
    public void test(){
        int result = service.add(3, 4);
        assertTrue(result != 0);
    }
}