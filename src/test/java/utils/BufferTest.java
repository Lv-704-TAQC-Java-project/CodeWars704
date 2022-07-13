package utils;

import com.org.ita.utils.Buffer;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.data_provider_buffer.BufferData;

import java.io.ByteArrayInputStream;

import static org.testng.Assert.*;

public class BufferTest {

    public static Buffer bf;

    @BeforeMethod
    public void setUp() {
//        System.setIn(InputStream.nullInputStream());
    }


    @AfterMethod
    public void tearDown() {
//        bf = null;
//        System.setIn(new ByteArrayInputStream("\\r\\n".getBytes()));
//        System.clearProperty("in");
//        System.setIn(new ByteArrayInputStream("".getBytes()));
//        System.setIn(InputStream.nullInputStream());
    }

    @Test
    public void testReadString() {
    }


//    @Test(dataProvider = "readLongTestData", dataProviderClass = BufferData.class)
//    public void testReadLong(String input, long expected) {
//        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator")).getBytes()));
//
//        bf = new Buffer();
//        long actual = bf.readLong();
////        System.setIn(new ByteArrayInputStream("".getBytes()));
////        System.setIn(InputStream.nullInputStream());
//        Assert.assertEquals(actual, expected);
//    }

    @Test
    public void testReadLong1() {
        String input = "12";
        Long expected = 12L;
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator") + input).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadLong2() {
        String input = "14";
        Long expected = 14L;
        System.setIn(new ByteArrayInputStream((input).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testReadLong4() {
        String input = "12";
        Long expected = 12L;
        System.setIn(new ByteArrayInputStream((input + System.getProperty("line.separator") + input).getBytes()));

        Buffer bf = new Buffer();
        long actual = bf.readLong();
        Assert.assertEquals(actual, expected);
    }
}