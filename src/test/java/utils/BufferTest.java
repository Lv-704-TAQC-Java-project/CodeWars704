package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.*;

public class BufferTest {

    @Test(dataProvider = "data-provider-readString", dataProviderClass = BufferData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        String actual = br.readString();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "positive-data-readIntArr", dataProviderClass = BufferData.class)
    public void testPositiveReadIntArr(String input, int[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        int[] actual = br.readIntArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class,
            dataProvider = "negative-data-readNumbers",
            dataProviderClass = BufferData.class)
    public void testNegativeReadIntArr(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        int[] arr = br.readIntArr();
        Assert.assertNull(arr);
    }

    @Test(dataProvider = "positive-data-readDoubleArr", dataProviderClass = BufferData.class)
    public void testPositiveReadDoubleArr(String input, double[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        double[] actual = br.readDoubleArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class,
            dataProvider = "negative-data-readNumbers",
            dataProviderClass = BufferData.class)
    public void testNegativeReadDoubleArr(String input) {
            System.setIn(new ByteArrayInputStream(input.getBytes()));
            Buffer br = new Buffer();
            double[] arr = br.readDoubleArr();
            Assert.assertNull(arr);
    }

    @Test(dataProvider = "readLongTestData", dataProviderClass = BufferData.class)
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }
}