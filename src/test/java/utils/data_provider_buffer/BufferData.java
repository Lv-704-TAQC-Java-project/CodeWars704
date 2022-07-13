package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

import java.math.BigInteger;

public class BufferData {

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
                {"Hello, world, !", new String[]{"Hello"," world","!"}},
                {"Lorem Ipsum has been the industry's standard"+
                        " dummy text ever since the 1500s, when an unknown "+
                        "printer took a galley of type and scrambled it to make a type specimen book.",
                    new String[]{"Lorem Ipsum has been the industry's standard dummy text ever since the 1500s",
                        " when an unknown printer took a galley of type and scrambled it to make a type specimen book."}},
                {"Some word", new String[]{"Some word"}},
                {"", new String[]{""}},
                {"Sections,, 1.10.32", new String[]{"Sections",""," 1.10.32"}}
        };
    }

    @DataProvider(name = "readStringArrSplitByCommaNegativeTestData")
    public static Object[][] readStringArrSplitByCommaNegativeTestData() {
        return new Object[][]{
                {""}
        };
    }
}
