package com.sapient.training.ui;

import com.sapient.training.service.Calculator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculator mycalclulator = new Calculator();
        System.out.println(mycalclulator.addition(2.0,3.0));
        System.out.println(mycalclulator.substraction(2, 3));
    }
}
