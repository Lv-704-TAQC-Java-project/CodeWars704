package implementation_test;

import com.org.ita.kata.Seven;
import implementation_test.data_provider.SevenData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SevenImplTest {

    @Test(dataProvider = "WhereIsVasyaTestData", dataProviderClass = SevenData.class)
    public void testWhereIsHe(Seven eightImpl, int[] data, int expected) {
        int actual = eightImpl.whereIsHe(data[0], data[1], data[2]);
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.toString(data));
    }

    @Test(dataProvider = "newAVGTestData", dataProviderClass = SevenData.class)
    public void testNewAVG(Seven sevenImpl, double[] data, double navg, double expected) {
        long actual = sevenImpl.newAvg(data, navg);
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.toString(data));
    }

    @Test(expectedExceptions = IllegalArgumentException.class, dataProvider = "newAVGTestDataNegative", dataProviderClass = SevenData.class)
    public void testNewAVGNegative(Seven sevenImpl, double[] data, double navg, double expected) {
        long actual = sevenImpl.newAvg(data, navg);
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.toString(data));
    }

    @Test(dataProvider = "seriesSumTestData", dataProviderClass = SevenData.class)
    public void testSeriesSum(Seven eightImpl, int data, String expected) {
        String actual = eightImpl.seriesSum(data);
        Assert.assertEquals(actual, expected, "Error: your number was " + data);
    }

}
