package implementation_test;

import com.org.ita.kata.Eight;
import org.testng.Assert;
import org.testng.annotations.*;
import implementation_test.data_provider.EightData;

import java.util.Arrays;

public class EightImplTest {

    @Test(dataProvider = "amIWilsonTestData", dataProviderClass = EightData.class)
    public void amIWilsonTest(Eight impl, boolean expected, double number) {
        boolean actual = impl.amIWilson(number);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "positiveDataLiters", dataProviderClass = EightData.class)
    public void testLitersPositive(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negativeDataLiters", dataProviderClass = EightData.class)
    public void testLitersnegative(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "squareOrSquareRootTestData", dataProviderClass = EightData.class)
    public void testSquareOrSquareRoot(Eight eightImpl, int[] data, int[] expected) {
        int[] actual = eightImpl.squareOrSquareRoot(data);
        Assert.assertEquals(Arrays.toString(actual), Arrays.toString(expected),"Error: your array was " + Arrays.toString(actual)+"Should be "+Arrays.toString(expected));
    }

}
