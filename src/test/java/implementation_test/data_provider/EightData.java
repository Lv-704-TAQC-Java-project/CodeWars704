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

    @DataProvider(name = "squareOrSquareRootTestData")
    public static Object[][] TestSquareOrSquareRoot() {
        Object[][] baseTestData = new Object[][]{
                { new int[] { 4, 3, 9, 7, 2, 1}, new int[] { 2, 9, 3, 49, 4, 1 }},
//                { new int[] { 100, 101, 5, 5, 1, 1 }, new int[] { 10, 10201, 25, 25, 1, 1 }},
//                { new int[] { 1, 2, 3, 4, 5, 6 }, new int[] { 1, 4, 9, 2, 25, 36 }},
//                { new int[] { 51, 21, 26, 6, 90 }, new int[] { 2601, 441, 676, 36, 8100}},
//                { new int[] { 96, 36, 65}, new int[] { 9216, 6, 4225 }},
//                { new int[] { 38, 78, 71, 59, 32, 33, 88 }, new int[] { 1444, 6084, 5041, 3481, 1024, 1089, 7744 }},
//                { new int[] { 97, 91, 6, 84, 3, 94, 84, 37, 2, 54, 7 }, new int[] { 9409, 8281, 36, 7056, 9, 8836, 7056, 1369, 4, 2916, 49}},
//                { new int[] { 13, 47, 25, 33, 14, 27 }, new int[] { 169, 2209, 5, 1089, 196, 729 }},
//                { new int[] {100, 38, 69, 65 }, new int[] { 10, 1444, 4761, 4225 }},
//                { new int[] {64, 27, 83, 98, 10, 62, 58, 23, 57, 49, 53 }, new int[] { 8, 729, 6889, 9604, 100, 3844, 3364, 529, 3249, 7, 2809}},
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

}
