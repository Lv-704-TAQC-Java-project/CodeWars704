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

    @DataProvider(name = "positiveDataLiters")
    public static Object[][] testDataLitersP() {
        Object[][] baseTestData = new Object[][]{
                {0, 0},
                {0.789, 0},
                {14.64, 7.0},
                {80, 40},
                {1600.20, 800.0},
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "negativeDataLiters")
    public static Object[][] testDataLitersN() {
        Object[][] baseTestData = new Object[][]{
                {-500.00, 0},
                {-1, 0},
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "positiveDataDivisibleBy")
    public static Object[][] testDataDivisibleByP() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{3, 6}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{0, 1, 0}, 2, new int[]{0, 0}}
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

}
