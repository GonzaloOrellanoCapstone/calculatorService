package com.tenpo.calculatorservice.service;

import com.tenpo.calculatorservice.model.CalculatorServiceResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class CalculatorServiceImpl {

    private final static int FIRST_VALUE = 5;
    private final static int SECOND_VALUE = 5;
    @InjectMocks
    private CalculatorService service;

    @Test
    public void testGetPercantage() {
        CalculatorServiceResponse response = service.getPercentage(FIRST_VALUE, SECOND_VALUE);
        assertNotNull(response);
    }
}
