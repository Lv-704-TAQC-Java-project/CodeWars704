package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

public class BufferData {

    @DataProvider(name = "readStringTestData")
    public static Object[][] testReadString() {
        return new Object[][]{
                {"ATQC course", "ATQC course"},
                {"ATQC", "ATQC"}
        };
    }

    @DataProvider(name = "readStringArrTestData")
    public static Object[][] testReadStringArr() {
        return new Object[][]{
                {"CodeWars 704 Lv 704 Java Project", new String[]{"CodeWars", "704", "Lv", "704", "Java", "Project"}},
                {"getProperty(\"line.separator\") returns the OS dependent line separator",
                        new String[]{"getProperty(\"line.separator\")", "returns", "the", "OS", "dependent", "line", "separator" }}
        };
    }

    @DataProvider(name = "getValidIntFromUserInputTestData")
    public static Object[][] testGetValidIntFromUserUnput() {
        return new Object[][]{
                {"Invalid message", 0, 10, "5", 5},
                {"Invalid message", 0, 3, "3", 3}
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
