package com.example;
import org.junit.Test;
import org.mockito.Mock;

public class LionWithExceptionTest {

    @Mock
    Feline feline;

    @Test(expected = java.lang.Exception.class)
    public void LionConstructorWithException () throws Exception {
        Lion lion = new Lion("кря", feline);
        lion.doesHaveMane();
    }


}