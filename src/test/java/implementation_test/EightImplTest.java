package implementation_test;

import com.org.ita.kata.Eight;
import implementation_test.data_provider.EightData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class EightImplTest {

    @Test(dataProvider = "amIWilsonTestData", dataProviderClass = EightData.class)
    public void amIWilsonTest(Eight impl, boolean expected, double number) {
        boolean actual = impl.amIWilson(number);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "positive-data-Liters", dataProviderClass = EightData.class)
    public void positiveTestLiters(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-Liters", dataProviderClass = EightData.class)
    public void negativeTestLiters(Eight eightImpl, double data, double expected) {
        double actual = eightImpl.liters(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "squareOrSquareRootTestData", dataProviderClass = EightData.class)
    public void testSquareOrSquareRoot(Eight eightImpl, int[] a, int[] b) {
        String actual = Arrays.toString(eightImpl.squareOrSquareRoot(a));
        Assert.assertEquals(actual, Arrays.toString(b), "Error: your array was " + Arrays.toString(a));
    }

    @Test(dataProvider = "data-provider-countPositivesSumNegatives", dataProviderClass = EightData.class)
    public void testCountPositivesSumNegatives(Eight eightImpl, int[] numbers, int[] expected) {
        int[] actual = eightImpl.countPositivesSumNegatives(numbers);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "data-DivisibleBy", dataProviderClass = EightData.class)
    public void testDivisibleBy(Eight eightImpl, int[] numbers, int divider, int[] expected) {
        int[] actual = eightImpl.divisibleBy(numbers, divider);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "volumeOfCuboidData", dataProviderClass = EightData.class)
    public void testVolumeOfCuboid(Eight eightImpl, double length, double width, double height, double expected) {
        final double delta = 0.0001;
        double actual = eightImpl.getVolumeOfCuboid(length, width, height);
        Assert.assertEquals(actual, expected, delta, "Error: your data was " + Arrays.toString(new double[]{length, width, height}));
    }

    @Test(dataProvider = "mpgToKPMData", dataProviderClass = EightData.class)
    public void testMpgToKpm(Eight eightImpl, float mpg, double expected) {
        final double delta = 0.0001;
        float actual = eightImpl.mpgToKPM(mpg);
        Assert.assertEquals(actual, expected, delta, "Error: your data was " + mpg);
    }
    @Test(dataProvider = "stringToNumber", dataProviderClass = EightData.class)
    public void testDataStringToNumber(Eight eightImpl, String str, int expected) {
        int actual = eightImpl.stringToNumber(str);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "twoDecimalPlacesTestData", dataProviderClass = EightData.class)
    public void twoDecimalPlacesTest(Eight impl, double number, double expected) {
        double actual = impl.twoDecimalPlaces(number);
        Assert.assertEquals(actual, expected);
    }

}
