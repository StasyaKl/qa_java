package come.example;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Spy
    private Feline feline;

    @Test
    public void eatMeatForFeline() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyForFeline() {
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void getKittensCheckReturnCount() {
        int expectedKittensCount = 100;
        Mockito.when(feline.getKittens(1)).thenReturn(expectedKittensCount);
        Assert.assertEquals(feline.getKittens(1), feline.getKittens());
    }

   @Test
    public void getKittensCheckMethod() {
        int expectedCountKittens = 5;
        Assert.assertEquals(expectedCountKittens, feline.getKittens(5));
    }
}