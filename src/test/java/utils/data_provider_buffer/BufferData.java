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

    @DataProvider(name = "data-provider-readString")
    public static Object[][] testReadString() {
        return new Object[][]{
                {"ATQC course", "ATQC course"},
                {"ATQC", "ATQC"}
        };
    }
    
    @DataProvider(name = "readLongTestData")
    public static Object[][] readLongTestData() {
        return new Object[][]{
                {"12", 12L},
                {"1", 1L},
                {"1", 1L},
                {"7894032459451845645", 7894032459451845645L},
                {"789403245945184564", 789403245945184564L},
                {"7894032459451845645", 7894032459451845645L},
                {"7894032459451845645", 7894032459451845645L},
                {"1894032459451845645", 1894032459451845645L},
                {"789403245", 789403245L}
        };
    }
}
