package utils;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utils.data_provider_console_reader.ConsoleReaderData;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class ConsoleReaderTest {

    @Test(dataProvider = "readStringTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        String actual = reader.readString();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readStringArrTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadStringArr(String input, String[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        String[] actual = reader.readStringArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getValidIntFromUserInputTestData", dataProviderClass = ConsoleReaderData.class)
    public void testGetValidIntFromUserInput(String invalidMessage, int start, int end, String number, int expected) {
        System.setIn(new ByteArrayInputStream(number.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        int actual = reader.readIntegerInputInRange(invalidMessage, start, end);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "getValidIntFromUserInputTestDataNegative", dataProviderClass = ConsoleReaderData.class)
    public void testGetValidIntFromUserInputNegative(String invalidMessage, int start, int end, String number, int expected, String expectedError) {
        System.setIn(new ByteArrayInputStream(number.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int actual = reader.readIntegerInputInRange(invalidMessage, start, end);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedError, "Incorrect error");
        softAssert.assertEquals(actual, expected, "Expected number was " + expected + "but was" + actual);
        softAssert.assertAll();
    }

    @Test(dataProvider = "positive-data-readIntArr", dataProviderClass = ConsoleReaderData.class)
    public void testPositiveReadIntArr(String input, int[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        int[] actual = reader.readIntArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-readIntArr", dataProviderClass = ConsoleReaderData.class)
    public void testNegativeReadIntArr(String input, String expectedMessage, int[] expectedArray) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int[] actual = reader.readIntArr();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message");
        softAssert.assertEquals(actual, expectedArray, "Expected array was " + Arrays.toString(expectedArray) + "but was" + Arrays.toString(actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "positive-data-readDoubleArr", dataProviderClass = ConsoleReaderData.class)
    public void testPositiveReadDoubleArr(String input, double[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        double[] actual = reader.readDoubleArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-readDoubleArr", dataProviderClass = ConsoleReaderData.class)
    public void testNegativeReadDoubleArr(String input, String expectedMessage, double[] expectedArray) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double[] actual = reader.readDoubleArr();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message");
        softAssert.assertEquals(actual, expectedArray, "Expected array was " + Arrays.toString(expectedArray) + "but was" + Arrays.toString(actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "readLongTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));

        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        long actual = reader.readLong();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readLongNegativeTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadLongNegative(String input, String expectedMessage, Long expectedLong) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        long actual = reader.readLong();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message is shown");
        softAssert.assertEquals(actual, (long) expectedLong, String.format("Expected number was %d, but got %d instead.", expectedLong, actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "readBigIntegerTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        BigInteger actual = reader.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readBigIntegerNegativeTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadBigIntegerNegative(String input, String expectedMessage, BigInteger expectedBigInteger) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        BigInteger actual = reader.readBigInteger();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error");
        softAssert.assertEquals(actual, expectedBigInteger, String.format("Expected number was %s, but got %s instead.", expectedBigInteger.toString(), actual.toString()));
        softAssert.assertAll();
    }

    @Test(dataProvider = "readStringArrSplitByCommaTestData", dataProviderClass = ConsoleReaderData.class)
    public void testStringArrSplitByComma(String input, String[] expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        String[] actual = reader.readStringArrSplitByComma();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readFloatTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadFloat(String input, float expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        float actual = reader.readFloat();
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "readDoubleTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadDouble(String input, double expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        double actual = reader.readDouble();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readDoubleNegativeTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadDoubleNegative(String input, String expectedMessage, double expectedDouble) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double actual = reader.readDouble();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message is shown");
        softAssert.assertEquals(actual, expectedDouble, String.format("Expected double was %f, but got %f instead.", expectedDouble, actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "negativeDataReadFloat", dataProviderClass = ConsoleReaderData.class)
    public void testNegativeReadDouble(String input, String expectedMessage, float expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double actual = reader.readFloat();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message");
        softAssert.assertEquals(actual, expected, 0.0001, "Expected number was " + expected + "but was" + actual);
        softAssert.assertAll();
    }

    @Test(dataProvider = "readIntTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadInt(String input, double expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        int actual = reader.readInt();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readIntNegativeTestData", dataProviderClass = ConsoleReaderData.class)
    public void testReadIntNegative(String input, String expectedMessage, int expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        int actual = reader.readInt();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error");
        softAssert.assertEquals(actual, expected, String.format("Expected number was %d, but got %d instead.", expected, actual));
        softAssert.assertAll();
    }

    @Test(dataProvider = "readPositiveDoubleTestData", dataProviderClass = ConsoleReaderData.class)
    public void getPositiveDoubleInputTest(String input, double expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        double actual = reader.readPositiveDoubleInput();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "readPositiveDoubleNegativeTestData", dataProviderClass = ConsoleReaderData.class)
    public void readPositiveDoubleNegativeTest(String input, String expectedMessage, double expectedDouble) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        com.org.ita.utils.ConsoleReader reader = new com.org.ita.utils.ConsoleReader();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        double actual = reader.readPositiveDoubleInput();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(String.valueOf(output).replace("\r", ""), expectedMessage, "Incorrect error message is shown");
        softAssert.assertEquals(actual, expectedDouble, String.format("Expected double was %f, but got %f instead.", expectedDouble, actual));
        softAssert.assertAll();
    }
}