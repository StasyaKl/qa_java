package come.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.Assert;

import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final Lion lion;
    Feline feline = mock(Feline.class);

    public LionTest() throws Exception {
        this.lion = new Lion("Самец", feline);
    }

    @Test
    public void checkKittensForLion() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Assert.assertEquals(1, lion.getKittens());
    }
}
