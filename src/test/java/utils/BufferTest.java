package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.*;

public class BufferTest {

    @Test (dataProvider = "data-provider-readString", dataProviderClass = BufferData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        String actual = br.readString();
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "positive-data-readIntArr", dataProviderClass = BufferData.class)
    public void testPositiveReadIntArr(String input, int[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int[] actual = new Buffer().readIntArr();
        Assert.assertEquals(actual, expected);
    }

    @Test(expectedExceptions = {NullPointerException.class},
            dataProvider = "negative-data-readIntArr",
            dataProviderClass = BufferData.class)
    public void testNegativeReadIntArr(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        Buffer br = new Buffer();
        br.readIntArr();

        OutputStream os = new ByteArrayOutputStream();
        System.setOut(new PrintStream(os));

        String actual = br.readString();
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