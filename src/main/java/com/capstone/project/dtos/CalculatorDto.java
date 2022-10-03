package com.capstone.project.dtos;

import com.capstone.project.entities.Calculator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorDto implements Serializable {
    private Long id;
    private double principal;
    private double interest;
    private double mortgage;
    private double total;

    public CalculatorDto(Calculator calculator){
        if(calculator.getId() != null){
            this.id = calculator.getId();
        }
            this.principal = calculator.getPrincipal();
            this.interest = calculator.getInterest();
            this.mortgage = calculator.getMortgage();
            this.total = calculator.getTotal();
    }
}
