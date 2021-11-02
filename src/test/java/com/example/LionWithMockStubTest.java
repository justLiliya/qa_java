package com.example;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionWithMockStubTest {

    @Mock
    Feline feline;


    @Test
    public void lionGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedLionKittensCount = 0;
        Mockito.when(feline.getKittens()).thenReturn(expectedLionKittensCount);
        int lionKittensCount = lion.getKittens();
        assertEquals(expectedLionKittensCount, lionKittensCount);
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void lionShouldDoesHaveMane() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean actualLionMan = lion.doesHaveMane();
        boolean expectedLionMan = true;
        assertEquals(expectedLionMan, actualLionMan);
    }


    @Test
    public void LionShouldGetFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFoodLion = Arrays.asList("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFoodLion);
        List<String> checkedFoodLion = lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
        assertEquals(expectedFoodLion,checkedFoodLion);



    }
}