package com.shendyuk.insurance_service_api.controller;

import com.shendyuk.insurance_service_api.dto.PassportRequestDTO;
import com.shendyuk.insurance_service_api.service.InternationalPassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/get-passport")
@RequiredArgsConstructor
public class InternationalPassportController {
    private final InternationalPassportService internationalPassportService;
    private RestTemplate restTemplate;

    @GetMapping("/person/{personId}")
    public ResponseEntity<String> getPersonById(@PathVariable Long personId) {
        String url = "http://localhost:5432/people/" + personId;
//        Person person = restTemplate.getForObject(url, Person.class);
        return ResponseEntity.ok("");
    }

    public ResponseEntity<String> createPassport(@RequestBody PassportRequestDTO passportRequestDTO) {
        return ResponseEntity.ok("");
    }
}
