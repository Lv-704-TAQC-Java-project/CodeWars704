package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.*;

public class BufferTest {

    // public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    @Test (dataProvider = "data-provider-readString", dataProviderClass = BufferData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
        OutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String actual = br.readString();
        Assert.assertEquals(actual, expected);
    }

}