#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * CalculatorTest.java
 * Toy test for our Calculator
 *
 * @author calebjosue
 */
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addition() {

        assertEquals(2, calculator.add(1, 1));
    }
}
