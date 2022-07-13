package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public class BufferTest {

    @Test
    public void testReadString() {
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

}