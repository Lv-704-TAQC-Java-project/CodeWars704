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

    @DataProvider(name = "positive-data-readDoubleArr")
    public static Object[][] testPositiveReadDoubleArr() {
        return new Object[][]{
                {"14.0 30.0 5.0 7.0 9.0 11.0 16.0", new double[]{14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}},
                {"139532.80000000002 163691.0 93493.40000000001 34536.700000000004",
                        new double[]{139532.80000000002, 163691.0, 93493.40000000001, 34536.700000000004}}
        };
    }

    @DataProvider(name = "negative-data-readNumbers")
    public static Object[][] testNegativeReadNumbers() {
        return new Object[][]{
                {"hello"},
                {"bye"}
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
