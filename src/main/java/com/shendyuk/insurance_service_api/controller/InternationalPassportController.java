package com.shendyuk.insurance_service_api.controller;

import com.citymanagement.api.dto.PersonResponseDTO;
import com.shendyuk.insurance_service_api.service.InternationalPassportService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/get-passport")
@RequiredArgsConstructor
public class InternationalPassportController {
    private final InternationalPassportService internationalPassportService;
    private final RestTemplate restTemplate;

    @GetMapping("/person/{Id}")
    public ResponseEntity<String> getPersonById(@PathVariable Long Id) {
        String peopleUrl = "http://localhost:8080/people/" + Id;
        PersonResponseDTO response = restTemplate.getForObject(peopleUrl, PersonResponseDTO.class);

        if (response != null) {
            internationalPassportService.createInternationalPassport(Id);
            return ResponseEntity.ok("Загранпаспорт успешно создан для человека с ID: " + Id);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Человек с ID: " + Id + " не найден.");
        }
    }
}
