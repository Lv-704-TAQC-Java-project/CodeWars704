package utils.data_provider_buffer;

import org.testng.annotations.DataProvider;

public class BufferData {

    @DataProvider(name = "readLongTestData")
    public static Object[][] readLongTestData() {
        return new Object[][]{
                {"12", 12L},
                {"1", 1L},
                {"1", 1L}
//                {"7894032459451845645", 7894032459451845645L},
//                {"789403245945184564", 789403245945184564L},
//                {"7894032459451845645", 7894032459451845645L},
//                {"7894032459451845645", 7894032459451845645L},
//                {"1894032459451845645", 1894032459451845645L},
//                {"789403245", 789403245L},
        };
    }
}
