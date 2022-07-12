package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.ByteArrayInputStream;

import static org.testng.Assert.*;

public class BufferTest {

    @Test
    public void testReadString() {
    }

    @Test(dataProvider = "data-provider-readIntArr", dataProviderClass = BufferData.class)
    public void testReadIntArr(String input, int[] expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        int[] actual = new Buffer().readIntArr(System.in);
        Assert.assertEquals(actual, expected);
    }
}