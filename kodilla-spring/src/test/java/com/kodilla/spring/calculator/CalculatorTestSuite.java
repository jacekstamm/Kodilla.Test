package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testShouldCheckAddCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.add(9.25, 5.95);
        //Then
        Assert.assertEquals(result, 15.2, 0.01);
    }

    @Test
    public void testShouldCheckSubCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.sub(95.47, 62.57);
        //Then
        Assert.assertEquals(result, 32.9, 0.01);
    }

    @Test
    public void testShouldCheckMulCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.mul(5.27, 9.27);
        //Then
        Assert.assertEquals(result, 48.85, 0.01);
    }

    @Test
    public void testShouldCheckDivCalculation() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double result = calculator.div(267.27, 29.73);
        //Then
        Assert.assertEquals(result, 8.98, 0.01);
    }
}
