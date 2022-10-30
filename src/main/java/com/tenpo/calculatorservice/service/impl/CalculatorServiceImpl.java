package com.tenpo.calculatorservice.service.impl;

import com.tenpo.calculatorservice.service.CalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public Double getPercentage(int firstValue, int secondValue) {
        Double addValues = Double.valueOf(firstValue + secondValue);
        return addValues + ( (addValues * addValues) / 100);
    }
}
