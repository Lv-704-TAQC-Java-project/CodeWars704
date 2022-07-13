package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.*;
import java.math.BigInteger;

import static org.testng.Assert.assertThrows;

public class BufferTest {

    @Test (dataProvider = "data-provider-readString", dataProviderClass = BufferData.class)
    public void testReadString(String input, String expected) {
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Buffer br = new Buffer();
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

    @Test(dataProvider = "readBigIntegerTestData", dataProviderClass = BufferData.class)
    public void testReadBigInteger(String input, BigInteger expected) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        BigInteger actual = bf.readBigInteger();
        Assert.assertEquals(actual, expected);
    }

    @Test( expectedExceptions = {NumberFormatException.class, NullPointerException.class}, dataProvider = "readBigIntegerNegativeTestData", dataProviderClass = BufferData.class)
    public void testReadBigIntegerNegative(String input) {
        System.setIn(new ByteArrayInputStream((input).getBytes()));
        Buffer bf = new Buffer();
        bf.readBigInteger();
    }

}