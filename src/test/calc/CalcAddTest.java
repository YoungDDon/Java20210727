package calc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcAddTest {
    CalcAdd calcAdd = new CalcAdd();
    @Test
    void sum() {
        assertEquals(calcAdd.sum(15,15),30);
    }
}