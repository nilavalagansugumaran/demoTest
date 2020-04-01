package com.example.demoTest;

import static org.junit.jupiter.api.Assertions.*;


import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.mockito.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import  org.hamcrest.Matcher.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MyComponentTest {

    @Autowired MyComponent component;

    @MockBean MyService service;

    @Test
    public void testMock(){
        Mockito.when(service.add(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(200);
        assertTrue(component.callService());
        Mockito.when(service.add(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt())).thenReturn(5);
        assertFalse(component.callService());

    }
}