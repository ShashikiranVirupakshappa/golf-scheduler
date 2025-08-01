package com.javabro.client_application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.web.client.RequestAttributeClientRegistrationIdResolver;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class GolfLessonClientController {

    @Autowired
    private RestClient restClient;

    @GetMapping("/lessons")
    public String fetchLessons() {
        return restClient
                .get()
                .uri("http://localhost:8081/lessons")
                .attributes(RequestAttributeClientRegistrationIdResolver.clientRegistrationId("golf-client"))
                .retrieve().body(String.class);
    }
}
