package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

public class BufferData {
    @DataProvider(name = "positive-data-readIntArr")
    public static Object[][] testPositiveReadIntArr() {
        return new Object[][]{
                {"1 8 3 4", new int[]{1, 8, 3, 4}},
                {"1 2 3 4 9 54 9 7", new int[]{1, 2, 3, 4, 9, 54, 9, 7}}
        };
    }

    @DataProvider(name = "negative-data-readIntArr")
    public static Object[][] testNegativeReadIntArr() {
        return new Object[][]{
                {"hello", "Input should be int"},
                {"bye", "Input should be int"}
        };
    }
}
