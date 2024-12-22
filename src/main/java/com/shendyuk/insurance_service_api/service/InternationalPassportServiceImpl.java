package com.shendyuk.insurance_service_api.service;

import com.shendyuk.insurance_service_api.model.InternationalPassport;
import com.shendyuk.insurance_service_api.repository.InternationalPassportRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@RequiredArgsConstructor
public class InternationalPassportServiceImpl implements InternationalPassportService {
    private final InternationalPassportRepository internationalPassportRepository;

    @Override
    public void createInternationalPassport(Long id) {
        InternationalPassport internationalPassport = new InternationalPassport();

        internationalPassport.setSeries(generatedRandomSeriesAndNumber());
        internationalPassport.setPersonId(id);
        saveInternationalPassport(internationalPassport);
    }

    @Override
    public InternationalPassport saveInternationalPassport(InternationalPassport internationalPassport) {
//        return internationalPassportRepository.save(internationalPassport);
        return null;
    }


    public String generatedRandomSeriesAndNumber() {
        Random random = new Random();
        char firstLetter = (char) ('A' + random.nextInt(26));
        char secondLetter = (char) ('A' + random.nextInt(26));
        int number = random.nextInt(1000000);

        return String.valueOf(firstLetter) + secondLetter + number;
    }
}
