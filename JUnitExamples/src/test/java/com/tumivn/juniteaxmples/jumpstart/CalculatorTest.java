package com.tumivn.juniteaxmples.jumpstart;

import com.tumivn.junitexamples.jumpstart.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tumi Le (Dung Le Hoang) <tumivn@gmail.com>
 */
public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        double result = cal.add(10, 50);
        assertEquals(60, result, 0);
        
    }
}
