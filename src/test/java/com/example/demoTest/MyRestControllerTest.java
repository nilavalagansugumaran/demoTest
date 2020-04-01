package com.example.demoTest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
class MyRestControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;


    @Test
    public void test() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept", "application/json");
        headers.add("Content-Type", "application/json");
        HttpEntity entity = new HttpEntity("", headers);
       ResponseEntity<String> RESPONSE =  restTemplate.exchange("/hello", HttpMethod.GET, entity, String.class);

        assertTrue(RESPONSE.getStatusCode() != HttpStatus.OK);
    }

}