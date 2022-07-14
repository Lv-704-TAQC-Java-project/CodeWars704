package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.data_provider_buffer.BufferData;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Arrays;

public class BufferTest {

    @Test(dataProvider = "readStringTestData", dataProviderClass = BufferData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        String actual = br.readString();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readStringArrTestData", dataProviderClass = BufferData.class)
    public void testReadStringArr(String input, String[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        String[] actual = br.readStringArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getValidIntFromUserInputTestData", dataProviderClass = BufferData.class)
    public void testGetValidIntFromUserInput(String invalidMessage, int start, int end, String number, int expected) {
        System.setIn(new ByteArrayInputStream(number.getBytes()));
        Buffer br = new Buffer();
        int actual = br.getValidIntFromUserInput(invalidMessage, start, end);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getValidIntFromUserInputTestDataNegative", dataProviderClass = BufferData.class)
    public void testGetValidIntFromUserInputNegative(String invalidMessage, int start, int end, String number, int expected, String expectedError) {
        System.setIn(new ByteArrayInputStream(number.getBytes()));
        Buffer br = new Buffer();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int actual = br.getValidIntFromUserInput(invalidMessage, start, end);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedError, "Incorrect error");
        softAssert.assertEquals(actual, expected, "Expected number was " + expected + "but was" + actual);
        softAssert.assertAll();
    }

    @Test(dataProvider = "positive-data-readIntArr", dataProviderClass = BufferData.class)
    public void testPositiveReadIntArr(String input, int[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        int[] actual = br.readIntArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-readIntArr", dataProviderClass = BufferData.class)
    public void testNegativeReadIntArr(String input, String expectedMessage, int[] expectedArray) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int[] actual = br.readIntArr();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message");
        softAssert.assertEquals(actual, expectedArray, "Expected array was " + Arrays.toString(expectedArray) + "but was" + Arrays.toString(actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "positive-data-readDoubleArr", dataProviderClass = BufferData.class)
    public void testPositiveReadDoubleArr(String input, double[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        double[] actual = br.readDoubleArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-readDoubleArr", dataProviderClass = BufferData.class)
    public void testNegativeReadDoubleArr(String input, String expectedMessage, double[] expectedArray) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double[] actual = br.readDoubleArr();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message");
        softAssert.assertEquals(actual, expectedArray, "Expected array was " + Arrays.toString(expectedArray) + "but was" + Arrays.toString(actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "readLongTestData", dataProviderClass = BufferData.class)
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readLongNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadLongNegative(String input, String expectedMessage, Long expectedLong) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer bf = new Buffer();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        long actual = bf.readLong();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message is shown");
        softAssert.assertEquals(actual, (long) expectedLong, String.format("Expected number was %d, but got %d instead.", expectedLong, actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "readBigIntegerTestData", dataProviderClass = BufferData.class)
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        BigInteger actual = bf.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "readBigIntegerNegativeTestData", dataProviderClass = BufferData.class)
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


    @Test(expectedExceptions = NullPointerException.class, dataProvider = "readStringArrSplitByCommaNegativeTestData", dataProviderClass = BufferData.class)
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

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "readDoubleNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadDoubleNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readDouble();
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "readFloatNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadFloatNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readFloat();
    }

    @Test(dataProvider = "readIntTestData", dataProviderClass = BufferData.class)
    public void testReadInt(String input, double expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));
        Buffer bf = new Buffer();
        int actual = bf.readInt();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = NullPointerException.class, dataProvider = "readIntNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadIntNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readInt();
    }
}