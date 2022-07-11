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
        Assert.assertEquals(actual, expected,"Error: your array was " + Arrays.toString(data));
    }

}
