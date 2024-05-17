/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.automatedunittesting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sajan
 */
public class UnitTestingIT {
    
    public UnitTestingIT() {
    }

    @Test
    public void testAddition() {
        // create an instance of the class
        UnitTesting u = new UnitTesting();
        int expected =4; 
        int actual=u.addition(2, 2);
        assertEquals(expected,actual);
        
    }
    @Test
    public void testSubtraction(){
        UnitTesting u = new UnitTesting();
        int expected=6;
        int actual=u.subtraction(10, 4);
        assertEquals(expected,actual);
        
    }
    @Test 
    public void testMessage(){
        UnitTesting u = new UnitTesting();
        String expected ="Hello world";
        String actual=u.message();
        assertEquals(expected, actual);
        
    }
            
    
}
