package com.tenpo.calculatorservice.service.impl;

import com.tenpo.calculatorservice.service.CalculatorService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Double getPercentage(int firstValue, int secondValue) {
        Double addValues = Double.valueOf(firstValue + secondValue);
        return addValues + calculatePercentage(addValues, randomNumber());
    }

    private int randomNumber() {
        Random randI = new Random();
        return randI.nextInt(100) + 1;
    }

    private double calculatePercentage(double obtained, double total) {
        return obtained * 100 / total;
    }
}
