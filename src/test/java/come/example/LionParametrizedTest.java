package come.example;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final boolean doesHaveMane;
    private final Lion lion;

    public LionParametrizedTest(String sex, boolean doesHaveMane) throws Exception {
        this.doesHaveMane = doesHaveMane;
        this.lion = new Lion(sex, new Feline());
    }

    @Parameterized.Parameters
    public static Object[] getParams() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void checkDoesHaveMane() {
        Assert.assertEquals(this.doesHaveMane, lion.doesHaveMane());
    }
}