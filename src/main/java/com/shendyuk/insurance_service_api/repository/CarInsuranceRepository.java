package com.shendyuk.insurance_service_api.repository;

import com.shendyuk.insurance_service_api.model.CarInsurance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarInsuranceRepository extends JpaRepository<CarInsurance, Long> {
}
