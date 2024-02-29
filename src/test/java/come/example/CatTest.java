package come.example;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;
import java.util.List;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline = mock(Feline.class);
    private final Cat cat = new Cat(feline);

    @Test
    public void getSoundForCat() {
        String expectedCatSound = "Мяу";
        Assert.assertEquals(expectedCatSound, cat.getSound());
    }

    @Test
    public void getFoodForCat() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}