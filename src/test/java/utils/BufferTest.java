package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.*;

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

    @Test(dataProvider = "readLongTestData", dataProviderClass = BufferData.class)
    public void testReadLong(String input, long expected) {
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }

}