package com.capstone.project.controller;

import com.capstone.project.dtos.CalculatorDto;
import com.capstone.project.services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    @Autowired
    CalculatorService calculatorService;

    @PostMapping("/mortgage")
    public void addCalculator(@RequestBody CalculatorDto calculatorDto){
        calculatorService.addCalculator(calculatorDto);
    }
}
