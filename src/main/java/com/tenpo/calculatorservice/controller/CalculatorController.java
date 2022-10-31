package com.tenpo.calculatorservice.controller;

import com.tenpo.calculatorservice.model.CalculatorServiceResponse;
import com.tenpo.calculatorservice.service.CalculatorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
@Slf4j
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/percentage/{firstValue}/{secondValue}")
    public CalculatorServiceResponse getPercentage(@PathVariable("firstValue") int firstValue,
                                                   @PathVariable("secondValue") int secondValue) {
        return calculatorService.getPercentage(firstValue, secondValue);
    }
}
