package VisitorTests;

import org.junit.Before;
import org.junit.Test;
import Visitor.Visitor;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before() {
        visitor = new Visitor(19, 165.3, 40.50);
    }

    @Test
    public void hasAge() {
        assertEquals(19, visitor.getAge());
    }

    @Test
    public void hasHeight() {
        assertEquals(165.3, visitor.getHeight(), 2);
    }

    @Test
    public void hasName() {
        assertEquals(40.50, visitor.totalCash(), 2);
    }

    @Test
    public void canPay() {
        assertEquals(39.00, visitor.pay(1.5), 2);
    }
}
