package com.tenpo.calculatorservice.controller;

import com.tenpo.calculatorservice.service.CalculatorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(classes = CalculatorController.class)
@RunWith(SpringRunner.class)
public class CalculatorControllerTest extends AbstractTest {

    private final static String URI = "/calculator";
    private final static String FIRST_VALUE = "5";
    private final static String SECOND_VALUE = "5";
    @MockBean
    private CalculatorService calculatorService;

    @Test
    public void getPercentage() throws Exception {
        final ResultActions resultActions = givenController().perform(MockMvcRequestBuilders
                        .get(URI.concat("/percentage/" + FIRST_VALUE + "/" + SECOND_VALUE))
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
