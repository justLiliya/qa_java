package com.example;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionWithParametrizeTest {

    private final String actualSex;
    private final boolean expectedSex;

    public LionWithParametrizeTest(String actualSex, boolean expectedSex){
        this.actualSex = actualSex;
        this.expectedSex = expectedSex;
    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void LionHaveSexMaleTest () throws Exception{
        Lion lion = new Lion("Самец", null);
        Boolean expectedLionSex = true;
        Boolean actualLionSex = lion.doesHaveMane();
        assertEquals(expectedLionSex,actualLionSex);
    }

}