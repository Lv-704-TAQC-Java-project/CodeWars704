package implementation_test.data_provider;

import org.testng.annotations.DataProvider;
import implementation_test.UserImplementation;

import static implementation_test.UserImplementation.EIGHT_IMPLEMENTATION;

public class EightData {

    @DataProvider(name = "amIWilsonTestData")
    public static Object[][] amIWilsonTestData() {
        Object[][] baseTestData = new Object[][]{
                {true, 5.0},
                {true, 13.0},
                {true, 563.0},
                {false, 2},
                {false, 3},
                {false, 7},
                {false, 11},
                {false, 107},
                {false, 4931},
        };

        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "data-provider-divisibleBy")
    public static Object[][] dataProviderDivisibleBy() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{3, 6}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}}
        };

        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }
}
