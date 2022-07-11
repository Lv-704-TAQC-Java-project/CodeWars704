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
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{91, 54, 74, 31, 91, 13, 36, 31, 63, 43, 20,
                        24, 89, 94, 83, 14, 8, 46, 59, 95, 87, 58, 62,
                        50, 81, 6, 10, 58, 81, 61, 1, 80, 55, 11, 9, 51,
                        15, 8, 17, 23, 78, 49, 78, 60, 65, 55, 96, 42,
                        61, 2, 61, 58, 41, 83, 92, 80, 29, 18, 28, 25, 51, 47,
                        16, 11, 82, 52, 3, 27, 31, 44, 37, 51, 26, 63, 20, 10,
                        1, 99, 81, 89, 70, 43, 43, 88, 92, 42, 19, 90, 60, 99,
                        7, 67, 96, 85, 88, 64, 15, 46, 87, 44},
                        11,
                        new int[]{55, 11, 55, 11, 44, 99, 88, 99, 88, 44}},
        };

        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }
}
