package com.main;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class RetrieveCredentialsController {
    @GetMapping
    public ResponseEntity<Map<String, String> >fetchData() {
        Map<String, String> response = new HashMap<>();
        response.put("email", "nevisadhiambo71@gmail.com");
        response.put("current_datetime", Instant.now().toString());
        response.put("github_url", "https://github.com/nevisadhiambo/hng-fetch-credentials");

        return ResponseEntity.ok(response);
    }
}