package com.capstone.project.services;


import com.capstone.project.dtos.CalculatorDto;

import javax.transaction.Transactional;

public interface CalculatorService {

    @Transactional
     void addCalculator(CalculatorDto calculatorDto);
}
