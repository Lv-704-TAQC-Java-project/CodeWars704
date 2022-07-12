package implementation_test;

import com.org.ita.kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;
import implementation_test.data_provider.FiveData;

import java.util.Arrays;

public class FiveImplTest {

    @Test(dataProvider = "solveSumTestData", dataProviderClass = FiveData.class, timeOut = 1000)
    public void solveTest(Five impl, double expected, double number) {
        double actual = impl.solveSum(number);
        Assert.assertEquals(actual, expected, 1e-13);
    }


    @Test(dataProvider = "GapTestDataValid", dataProviderClass = FiveData.class, timeOut = 1600)
    public void testGap(Five fiveImpl, int[] data, String expected) {
        String actual = Arrays.toString(fiveImpl.gap(data[0], data[1], data[2]));
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.toString(data));
    }

    @Test(dataProvider = "GapTestDataNotValid", dataProviderClass = FiveData.class, timeOut = 1000)
    public void testGapNull(Five fiveImpl, int[] data, Object expected) {
        Object actual = fiveImpl.gap(data[0], data[1], data[2]);
        Assert.assertNull(actual, "Error: your array was " + Arrays.toString(data));
    }

    @Test(dataProvider = "data-provider-zeros", dataProviderClass = FiveData.class, timeOut = 1000)
    public void testZeros(Five fiveImpl, int number, int expected) {
        int actual = fiveImpl.zeros(number);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "artificialRainData", dataProviderClass = FiveData.class, timeOut = 1000)
    public void testArtificialRain(Five fiveImpl, int[] data, int expected) {
        Object actual = fiveImpl.artificialRain(data);
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.toString(data));
    }

    @Test(dataProvider = "smallestData", dataProviderClass = FiveData.class, timeOut = 1000)
    public void testSmallest(Five fiveImpl, long data, long[] expected) {
        Object actual = fiveImpl.smallest(data);
        Assert.assertEquals(actual, expected, "Error: your number was " + data);
    }

}
