package com.example.demoTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {


    @Autowired MyService service;

    public boolean callService() {
       int result = service.add(1,2);

       if(result > 10) {
           return  true;
       } else {
           return false;
       }

    }

}
