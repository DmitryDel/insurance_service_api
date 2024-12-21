package com.shendyuk.insurance_service_api.service;

import com.shendyuk.insurance_service_api.repository.InternationalPassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class InternationalPassportServiceImpl implements InternationalPassportService {
    private final InternationalPassportRepository internationalPassportRepository;
    private RestTemplate restTemplate;

    public String createPassport(Long id) {
//        Person person = restTemplate.getForObject("http://localhost:8081/persons/" + passport.getPersonId(), Person.class);

        //TODO запрос на проверку id person в БД
        return "";
    }
}
