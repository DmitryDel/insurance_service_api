package com.shendyuk.insurance_service_api.service;

import com.shendyuk.insurance_service_api.model.InternationalPassport;

public interface InternationalPassportService {
    void createInternationalPassport(Long id);

    InternationalPassport saveInternationalPassport(InternationalPassport internationalPassport);
}
