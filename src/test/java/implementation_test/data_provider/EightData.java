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

    @DataProvider(name = "data-provider-countPositivesSumNegatives")
    public static Object[][] dataCountPositivesSumNegatives() {
        Object[][] baseTestData = new Object[][]{
                {null, new int[0]},
                {new int[0], new int[0]},
                {new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}, new int[]{8, -50}},
                {new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}, new int[]{10, -65}},
                {new int[]{466, -478, 123, -182, -21, -12, 463, -126, -390, 136, -315, 494, 119, -172, 447, 123, 404,
                        85, -77, 410, -356, 47, -243, -469, -432, -421, 431, 257, 364, 208, 464, -133, -380, 305, -39,
                        116, 273, -360, 437, 64, -7, -304, -499},
                        new int[]{22, -5416}
                },
                {new int[]{362, -429, 392, -67, -270, -494, -43, 6, 378, 461, 425, 110, 236, -214, -235, -269, 319,
                        -198, -327, -225, 282, -387, 234, 129, 218, -309, 373, 477, 431, 101, 280, 168, 288, -112, 419,
                        240, -86, 268, -116, -66, 483, -38},
                        new int[]{24, -3885}
                },
                {new int[]{-402, 471, -33, 153, -114, -109, -409, -163, 77, 253, -255, 320, 244, -371, -102, 265, 219,
                        -92, -175, -128, 19, 137, -278, 470, 80, -195, 61, 449, -305, 119, 214, -439, -469, -205, -100,
                        254, -117, -103, 271, 286, 352, -262, 30, -414, -20, -28, 311, -28, 464, -474, 179, 112, -1,
                        207, -481, -157, 429, 410, -229, -250, -134, -428, 417, -245, -329, -289, 429, 295, -297, -361,
                        -153, -439, 31, 211, -463, 175, -96, 273, -271, -347, -392, -184, 332, -52, 17, 208, 175, 399,
                        17, 278, 258, 440},
                        new int[]{44, -11388}
                },
        };

        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }
}
