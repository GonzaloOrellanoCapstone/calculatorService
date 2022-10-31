package com.tenpo.calculatorservice.service;

import com.tenpo.calculatorservice.model.CalculatorServiceResponse;

public interface CalculatorService {

    CalculatorServiceResponse getPercentage(int firstValue, int secondValue);
}
