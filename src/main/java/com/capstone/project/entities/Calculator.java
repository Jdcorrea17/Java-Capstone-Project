package com.capstone.project.entities;

import com.capstone.project.dtos.CalculatorDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Mortgages")
public class Calculator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private double principal;

    @Column
    private double interest;

    @Column
    private double mortgage;

    @Column
    private double total;

    Calculator(double principal, double interest, double mortgage, double total){
        this.principal = principal;
        this.interest = interest;
        this.mortgage = mortgage;
        this.total = total;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getMortgage() {
        return mortgage;
    }

    public void setMortgage(double mortgage) {
        this.mortgage = mortgage;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    public Calculator(CalculatorDto calculatorDto){
        this.principal = calculatorDto.getPrincipal();
        this.mortgage = calculatorDto.getMortgage();
        this.interest = calculatorDto.getInterest();
        this.total = 0;
    }

}
