package com.tenpo.calculatorservice.service;

import com.tenpo.calculatorservice.model.CalculatorServiceResponse;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    @Cacheable(cacheNames = "percentage", key = "#request.percentage")
    public CalculatorServiceResponse getPercentage(int firstValue, int secondValue) {
        Double addValues = Double.valueOf(firstValue + secondValue);
        return new CalculatorServiceResponse(addValues + ((addValues * addValues) / 100));
    }
}
