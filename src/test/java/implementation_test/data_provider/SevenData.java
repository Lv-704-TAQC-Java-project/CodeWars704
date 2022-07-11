package implementation_test.data_provider;

import org.testng.annotations.DataProvider;
import implementation_test.UserImplementation;

import static implementation_test.UserImplementation.SEVEN_IMPLEMENTATION;

public class SevenData {

    @DataProvider(name = "someTestData")
    public static Object[][] someTest() {
        Object[][] baseTestData = new Object[][]{
                {, },
                {, },
                {, }
        };

        return UserImplementation.combineImplWithTests(SEVEN_IMPLEMENTATION, baseTestData);
    }
}
