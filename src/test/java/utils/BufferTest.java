package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.*;
import java.math.BigInteger;

public class BufferTest {

    @Test (dataProvider = "readStringTestData", dataProviderClass = BufferData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        String actual = br.readString();
        Assert.assertEquals(actual, expected);
    }

    @Test (dataProvider = "readStringArrTestData", dataProviderClass = BufferData.class)
    public void testReadStringArr(String input, String[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        String[] actual = br.readStringArr();
        Assert.assertEquals(actual, expected);
    }

    @Test (dataProvider = "getValidIntFromUserInputTestData", dataProviderClass = BufferData.class)
    public void testGetValidIntFromUserInput(String invalidMessage, int start, int end, String number, int expected) {
        System.setIn(new ByteArrayInputStream(number.getBytes()));
        Buffer br = new Buffer();
        int actual = br.getValidIntFromUserInput(invalidMessage, start, end);
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
        br.readIntArr();
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
            br.readDoubleArr();
    }

    @Test(dataProvider = "readLongTestData", dataProviderClass = BufferData.class)
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "readBigIntegerTestData", dataProviderClass = BufferData.class)
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        BigInteger actual = bf.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @Test( expectedExceptions = NullPointerException.class, dataProvider = "readBigIntegerNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadBigIntegerNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readBigInteger();
    }

    @Test(dataProvider = "readStringArrSplitByCommaTestData", dataProviderClass = BufferData.class)
    public void testStringArrSplitByComma(String input, String[] expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        String[] actual = bf.readStringArrSplitByComma();
        Assert.assertEquals(actual, expected);
    }


    @Test( expectedExceptions = NullPointerException.class, dataProvider = "readStringArrSplitByCommaNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadStringArrSplitByCommaNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readStringArrSplitByComma();
    }

    @Test(dataProvider = "readFloatTestData", dataProviderClass = BufferData.class)
    public void testReadFloat(String input, float expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        float actual = bf.readFloat();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readDoubleTestData", dataProviderClass = BufferData.class)
    public void testReadDouble(String input, double expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));
        Buffer bf = new Buffer();
        double actual = bf.readDouble();
        Assert.assertEquals(actual, expected);
    }

    @Test( expectedExceptions = NullPointerException.class, dataProvider = "readDoubleNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadDoubleNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readDouble();
    }

}