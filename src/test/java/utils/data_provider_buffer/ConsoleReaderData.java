package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

import static com.org.ita.utils.Message.ANSI_RED;

public class ConsoleReaderData {

    @DataProvider(name = "positive-data-readIntArr")
    public static Object[][] testPositiveReadIntArr() {
        return new Object[][]{
                {"1 8 3 4", new int[]{1, 8, 3, 4}},
                {"1 2 3 4 9 54 9 7", new int[]{1, 2, 3, 4, 9, 54, 9, 7}}
        };
    }

    @DataProvider(name = "negative-data-readIntArr")
    public static Object[][] testNegativeReadIntArr() {
        final String errorMsg = "\u001B[31mInput should be int\u001B[0m\n";
        return new Object[][]{
                {"hello\n2 7 6 4", errorMsg, new int[]{2, 7, 6, 4}},
                {"6bye 48\n5 7 8 9", errorMsg, new int[]{5, 7, 8, 9}},
                {" \n2 7 6 4", errorMsg, new int[]{2, 7, 6, 4}},
                {"\n5 7 8 9", errorMsg, new int[]{5, 7, 8, 9}}
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

    @DataProvider(name = "negative-data-readDoubleArr")
    public static Object[][] testNegativeReadDouble() {
        final String errorMsg = "\u001B[31mInput should be double\u001B[0m\n";
        return new Object[][]{
                {"hello\n14.0 30.0 5.0 7.0", errorMsg, new double[]{14.0, 30.0, 5.0, 7.0}},
                {"6bye 48\n139532.80000000002 163691.0", errorMsg, new double[]{139532.80000000002, 163691.0}},
                {" \n14.0 30.0 5.0 7.0", errorMsg, new double[]{14.0, 30.0, 5.0, 7.0}},
                {"\n139532.80000000002 163691.0", errorMsg, new double[]{139532.80000000002, 163691.0}}
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
                        new String[]{"getProperty(\"line.separator\")", "returns", "the", "OS", "dependent", "line", "separator"}}
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
        final String errorMsg1 = "\u001B[31mInput should be int\u001B[0m\n";
        final String errorMsg2 = "\u001B[31mInput should be int\u001B[31m\u001B[0m\n";
        return new Object[][]{
                {"Input should be int" + ANSI_RED, 0, 10, "\n5", 5, errorMsg1},
                {"Input should be int" + ANSI_RED, 0, 10, "11\n5", 5, errorMsg2},
                {"Input should be int" + ANSI_RED, 0, 10, "abC\n5", 5, errorMsg1}

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

    @DataProvider(name = "readLongNegativeTestData")
    public static Object[][] readLongNegativeTestData() {
        String errorMsg = "\u001B[31mInput should be of a 'long' type\u001B[0m\n";
        return new Object[][]{
                {"abra\n2456454884253485", errorMsg, 2456454884253485L},
                {"fdas485615\n25", errorMsg, 25L},
                {" \n25", errorMsg, 25L},
                {"\n25", errorMsg, 25L},
//                {"\n25", "\u001B[31mInput should be of a LONG type\u001B[0m\n", 26L},
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
        String errorMsg = "\u001B[31mInput should be BI\u001B[0m\n";
        return new Object[][]{
                {"hello\n1", errorMsg, new BigInteger("1")},
                {"12350986.078099579\n1", errorMsg, new BigInteger("1")},
                {"-1235098,60099579\n1", errorMsg, new BigInteger("1")},
                {" \n1", errorMsg, new BigInteger("1")},
                {"536893059687657956@9870865978$975489365675364756896596897809678\n1", errorMsg, new BigInteger("1")},
                {"0fgh\n1", errorMsg, new BigInteger("1")}
        };
    }

    @DataProvider(name = "readStringArrSplitByCommaTestData")
    public static Object[][] readStringArrSplitByCommaTestData() {
        return new Object[][]{
                {"1,2,3", new String[]{"1", "2", "3"}},
                {"Hello, world, !", new String[]{"Hello", " world", " !"}},
                {"Lorem Ipsum has been the industry's standard" +
                        " dummy text ever since the 1500s, when an unknown " +
                        "printer took a galley of type and scrambled it to make a type specimen book.",
                        new String[]{"Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                                " when an unknown printer took a galley of type and scrambled it to make a type specimen book."}},
                {"Some word", new String[]{"Some word"}},
                {"Sections,, 1.10.32", new String[]{"Sections", "", " 1.10.32"}
                }
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
        String errorMsg = "\u001B[31mInput should be double\u001B[0m\n";
        return new Object[][]{
                {"bcfjw\n0.0", errorMsg, 0.0},
                {"fdas485615\n25", errorMsg, 25},
                {" \n25.000", errorMsg, 25.000},
                {"\n15.123", errorMsg, 15.123},
        };
    }

    @DataProvider(name = "negativeDataReadFloat")
    public static Object[][] testNegativeReadFloat() {
        String errorMsg = "\u001B[31mInput should be float\u001B[0m\n";
        return new Object[][]{
                {"hello\n14.0", errorMsg, 14.0f},
                {"6bye 48\n139532.80000000002", errorMsg, 139532.80000000002f},
                {" \n14.0", errorMsg, 14.0f},
                {"\n139532.80000000002", errorMsg, 139532.80000000002f}
        };
    }

    @DataProvider(name = "readIntTestData")
    public static Object[][] readIntTestData() {
        return new Object[][]{
                {"0", 0},
                {"1", 1},
                {"163", 163},
                {"-38687", -38687},
                {"-23456", -23456},
                {"112345", 112345},
        };
    }

    @DataProvider(name = "readIntNegativeTestData")
    public static Object[][] readIntNegativeTestData() {
        String errorMsg = "\u001B[31mInput should be int\u001B[0m\n";
        return new Object[][]{
                {"hello\n2", errorMsg, 2},
                {"6bye 48\n55", errorMsg, 55},
                {" \n270", errorMsg, 270},
                {"\n578", errorMsg, 578}
        };
    }

    @DataProvider(name = "readPositiveDoubleTestData")
    public static Object[][] readPositiveDoubleTestData() {
        return new Object[][]{
                {"0", 0},
                {"0.0", 0.0},
                {"16.123", 16.123},
                {"1.7e308", 1.7e308},
                {"1", 1},
                {"1456456158", 1456456158},
        };
    }

    @DataProvider(name = "readPositiveDoubleNegativeTestData")
    public static Object[][] readPositiveDoubleNegativeTestData() {
        String errorMsg1 = "\u001B[31mEnter positive number.\u001B[0m\n";
        String errorMsg2 = "\u001B[31mInput should be double\u001B[0m\n";
        return new Object[][]{
                {"-0.00000000001\n24564548", errorMsg1, 24564548},
                {"-16.123\n16.123", errorMsg1, 16.123},
                {"-1.7e308\n1.7e308", errorMsg1, 1.7e308},
                {"-1\n1", errorMsg1, 1},
                {"-1456456158\n1456456158", errorMsg1, 1456456158},
                {"\n14.56", errorMsg2, 14.56},
                {" \n0.1456456158", errorMsg2, 0.1456456158},
                {"abra\n1450006158", errorMsg2, 1450006158},
//                {"-1456456158\n1456456158", "\u001B[31mEnter POSITIVE number.\u001B[0m\n", 14},
        };
    }
}
