package com.tumivn.juniteaxmples.jumpstart;

import com.tumivn.junitexamples.jumpstart.Calculator;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Tumi Le (Dung Le Hoang) <tumivn@gmail.com>
 */
@RunWith(Parameterized.class)
public class ParameterizedTest {
    private double expected;
    private double valueOne;
    private double valueTwo;
    
    @Parameters
    public static Collection dataParameters(){
        return Arrays.asList(new Object[][]{
            {2,1,1},
            {3,2,1}, 
            {4,2,2}
        });
    }
    
    public ParameterizedTest(double expected, double valueOne, double valueTwo){
        this.expected = expected;
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }
    
    @Test
    public void testAdd(){
        Calculator cal = new Calculator();
        double result = cal.add(this.valueOne, this.valueTwo);
        assertEquals(expected, result, 0);
    }
}
