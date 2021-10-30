package com.example;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class FelineTest {

    private final int felineKittensCount;
    private final int expectedFelineKittensCount;


    public FelineTest(int felineKittensCount, int expectedFelineKittensCount){
        this.felineKittensCount = felineKittensCount;
        this.expectedFelineKittensCount = expectedFelineKittensCount;

    }

    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 1},
        };
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> actualEatMeatList = feline.eatMeat();
        List<String> expectedEatMeatList = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedEatMeatList, actualEatMeatList);
    }

    @Test
    public void felineGetFamilyTest() {
        Feline feline = new Feline();
        String actualFelineFamily = feline.getFamily();
        assertEquals("Кошачьи", actualFelineFamily);
        System.out.println(feline.getFamily());
    }

    @Test
    public void felineGetKittensTest() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(felineKittensCount);
        assertEquals(expectedFelineKittensCount, actualKittensCount);
    }
}