package tests;

import inno.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;

public class Tests {
    @Test
    @DisplayName("testWork1")
    public void testWork() {
        TestFraction fraction = new TestFraction(4,5);
        Fractionable fractionPtoxy = Utils.cache(fraction);
        fractionPtoxy.doubleValue();
        fractionPtoxy.doubleValue();
        Assertions.assertEquals(fraction.count,1);
    }

    @Test
    @DisplayName("testReturn Good")
    public void testReturn() {
        TestFraction fraction = new TestFraction(3,6);
        Fractionable fractionPtoxy = Utils.cache(fraction);
        double d = fractionPtoxy.doubleValue();
        Assertions.assertEquals(d,0.5);
    }

    @Test
    @DisplayName("testGoodFromCache")
    public void testGoodFromCache() {
        TestFraction fraction = new TestFraction(3,6);
        Fractionable fractionPtoxy = Utils.cache(fraction);
        fractionPtoxy.doubleValue();
        double d = fractionPtoxy.doubleValue();
        Assertions.assertEquals(d,0.5);
    }

    @Test
    @DisplayName("testClearCacheReturn Good")
    public void testClearCacheReturn() {
        TestFraction fraction = new TestFraction(1,2);
        Fractionable fractionPtoxy = Utils.cache(fraction);
        fractionPtoxy.doubleValue();
        fractionPtoxy.toString();
        fractionPtoxy.setNum(2);
        double d = fractionPtoxy.doubleValue();
        Assertions.assertEquals(d,1);
    }

    @Test
    @DisplayName("testWithoutCache")
    public void test3_1() {
        TestFraction fraction = new TestFraction(1,2);
        Fractionable fractionPtoxy = Utils.cache(fraction);
        fractionPtoxy.doubleValue();
        fractionPtoxy.toString();
        fractionPtoxy.setDenum(4);
        double d = fractionPtoxy.doubleValue();
        Assertions.assertEquals(d,0.5);
    }

}