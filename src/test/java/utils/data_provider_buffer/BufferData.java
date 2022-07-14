package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

import static com.org.ita.utils.Message.ANSI_RED;

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

    @DataProvider(name = "getValidIntFromUserInputTestDataNegative")
    public static Object[][] testGetValidIntFromUserUnputNegative() {
        return new Object[][]{
                {"Input should be int" + ANSI_RED, 0, 10, "\n5", 5, "\u001B[31mInput should be int\u001B[0m" + "\n"},
                {"Input should be int" + ANSI_RED, 0, 10, "11\n5", 5, "[31mInput should be int[31m[0m" + "\n"},
                {"Input should be int" + ANSI_RED, 0, 10, "abC\n5", 5, "\u001B[31mInput should be int\u001B[0m" + "\n"}

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

    @DataProvider(name = "readBigIntegerTestData")
    public static Object[][] readBigIntegerTestData() {
        return new Object[][]{
                {"123", new BigInteger("123")},
                {"12350986078099579", new BigInteger("12350986078099579")},
                {"-123509860099579", new BigInteger("-123509860099579")},
                {"6570304580394858768970324957568934567", new BigInteger("6570304580394858768970324957568934567")},
                {"5368930596876579569870865978975489365675364756896596897809678", new BigInteger("5368930596876579569870865978975489365675364756896596897809678")},
                {"0", new BigInteger("0")}
        };
    }

    @DataProvider(name = "readBigIntegerNegativeTestData")
    public static Object[][] readBigIntegerNegativeTestData() {
        return new Object[][]{
                {"hello"},
                {"12350986.078099579"},
                {"-1235098,60099579"},
                {" "},
                {"536893059687657956@9870865978$975489365675364756896596897809678"},
                {"0fgh"}
        };
    }

    @DataProvider(name = "readStringArrSplitByCommaTestData")
    public static Object[][] readStringArrSplitByCommaTestData() {
        return new Object[][]{
                {"1,2,3", new String[]{"1","2","3"}},
                {"Hello, world, !", new String[]{"Hello"," world"," !"}},
                {"Lorem Ipsum has been the industry's standard"+
                        " dummy text ever since the 1500s, when an unknown "+
                        "printer took a galley of type and scrambled it to make a type specimen book.",
                    new String[]{"Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                        " when an unknown printer took a galley of type and scrambled it to make a type specimen book."}},
                {"Some word", new String[]{"Some word"}},
                {"Sections,, 1.10.32", new String[]{"Sections",""," 1.10.32"}}
        };
    }

    @DataProvider(name = "readStringArrSplitByCommaNegativeTestData")
    public static Object[][] readStringArrSplitByCommaNegativeTestData() {
        return new Object[][]{
                {""}
        };
    }

    @DataProvider(name = "readFloatTestData")
    public static Object[][] readFloatTestData() {
        return new Object[][]{
                {"0", 0.0f},
                {"1", 1f},
                {"555", 555f},
                {"678935627854", 678935627854f},
                {"0.00068925", 0.00068925f},
                {"0.5698632568954123658", 0.5698632568954123658f},
                {"5986523598.235897536", 5986523598.235897536f}
        };
    }


    @DataProvider(name = "readDoubleTestData")
    public static Object[][] readDoubleTestData() {
        return new Object[][]{
                {"0.0", 0.0},
                {"1", 1},
                {"16.123", 16.123},
                {"-386.8527", -386.8527},
                {"-1.7e308", -1.7e308},
                {"1.7e308", 1.7e308},
        };
    }

    @DataProvider(name = "readDoubleNegativeTestData")
    public static Object[][] readDoubleNegativeTestData() {
        return new Object[][]{
                {"19,8"},
                {"0,000"},
                {"-1235098,60099579"},
                {" "},
                {"world"},
        };
    }

    @DataProvider(name = "readFloatNegativeTestData")
    public static Object[][] readFloatNegativeTestData() {
        return new Object[][]{
                {""},
                {" "},
                {"gjlkg"},
                {"74653@56"},
                {"0.0g"},
                {"789.52-"},
                {"gjgk.kjgjhh"}
        };
    }
    @DataProvider(name = "readIntTestData")
    public static Object[][] readIntTestData() {
        return new Object[][]{
                {"0", 0},
                {"1", 1},
                {"163", 163},
                {"-38687", -38687},
                {"23456", -23456},
                {"112345", 112345},
        };
    }

    @DataProvider(name = "readIntNegativeTestData")
    public static Object[][] readIntNegativeTestData() {
        return new Object[][]{
                {"111111111111111234567890o9i87654323"},
                {"1.5"},
                {"wrethyft"},
                {" "},
                {"hi"},
        };
    }
}
