package come.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;

public class LionExceptionTest {
    @Test(expected = Exception.class)
    public void throwsExceptionSex() throws Exception {
        new Lion("Исключение", new Feline());
    }
}
