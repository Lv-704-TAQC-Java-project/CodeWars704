package implementation_test.data_provider;

import implementation_test.UserImplementation;
import org.testng.annotations.DataProvider;

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

        return UserImplementation.combineEightWithTestData(baseTestData);
    }

    @DataProvider(name = "positive-data-Liters")
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

    @DataProvider(name = "negative-data-Liters")
    public static Object[][] testDataLitersN() {
        Object[][] baseTestData = new Object[][]{
                {-500.00, 0},
                {-1, 0},
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }


    @DataProvider(name = "squareOrSquareRootTestData")
    public static Object[][] testSquareOrSquareRoot() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{4, 3, 9, 7, 2, 1}, new int[]{2, 9, 3, 49, 4, 1}},
                {new int[]{100, 101, 5, 5, 1, 1}, new int[]{10, 10201, 25, 25, 1, 1}},
                {new int[]{1, 2, 3, 4, 5, 6}, new int[]{1, 4, 9, 2, 25, 36}},
                {new int[]{51, 21, 26, 6, 90}, new int[]{2601, 441, 676, 36, 8100}},
                {new int[]{96, 36, 65}, new int[]{9216, 6, 4225}},
                {new int[]{38, 78, 71, 59, 32, 33, 88}, new int[]{1444, 6084, 5041, 3481, 1024, 1089, 7744}},
                {new int[]{97, 91, 6, 84, 3, 94, 84, 37, 2, 54, 7}, new int[]{9409, 8281, 36, 7056, 9, 8836, 7056, 1369, 4, 2916, 49}},
                {new int[]{13, 47, 25, 33, 14, 27}, new int[]{169, 2209, 5, 1089, 196, 729}},
                {new int[]{100, 38, 69, 65}, new int[]{10, 1444, 4761, 4225}},
                {new int[]{64, 27, 83, 98, 10, 62, 58, 23, 57, 49, 53}, new int[]{8, 729, 6889, 9604, 100, 3844, 3364, 529, 3249, 7, 2809}}
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

    @DataProvider(name = "data-DivisibleBy")
    public static Object[][] testDataDivisibleBy() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{2, 4, 6}},
                {new int[]{1, 2, 3, 4, 5, 6}, 3, new int[]{3, 6}},
                {new int[]{0, 1, 2, 3, 4, 5, 6}, 4, new int[]{0, 4}},
                {new int[]{0, 1, 0}, 2, new int[]{0, 0}},
                {new int[]{91, 54, 74, 31, 91, 13, 36, 31, 63, 43, 20,
                        24, 89, 94, 83, 14, 8, 46, 59, 95, 87, 58, 62,
                        50, 81, 6, 10, 58, 81, 61, 1, 80, 55, 11, 9, 51,
                        15, 8, 17, 23, 78, 49, 78, 60, 65, 55, 96, 42,
                        61, 2, 61, 58, 41, 83, 92, 80, 29, 18, 28, 25, 51, 47,
                        16, 11, 82, 52, 3, 27, 31, 44, 37, 51, 26, 63, 20, 10,
                        1, 99, 81, 89, 70, 43, 43, 88, 92, 42, 19, 90, 60, 99,
                        7, 67, 96, 85, 88, 64, 15, 46, 87, 44},
                        11,
                        new int[]{55, 11, 55, 11, 44, 99, 88, 99, 88, 44}}
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "volumeOfCuboidData")
    public static Object[][] testDataVolumeOfCuboid() {
        Object[][] baseTestData = new Object[][]{
                {0.0, 0.0, 0.0, 0.0},
                {0.5, 0.5, 0.5, 0.125},
                {23.61, 58.33, 12.11, 16677.5444},
                {259, 333, 0.55, 47435.85}
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "mpgToKPMData")
    public static Object[][] testDataMpgToKpm() {
        Object[][] baseTestData = new Object[][]{
                {0, 0f},
                {10, 3.54f},
                {30, 10.62f},
                {150, 53.1f}
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }
    @DataProvider(name = "stringToNumber")
    public static Object[][] testDataStringToNumber() {
        Object[][] baseTestData = new Object[][]{
                {"7", 7},
                {"0", 0},
                {"-2", -2},
                {"345", 345},
                {"2345678", 2345678}
        };
        return UserImplementation.combineImplWithTests(EIGHT_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "twoDecimalPlacesTestData")
    public static Object[][] twoDecimalPlacesTestData() {
        Object[][] baseTestData = new Object[][]{
                {4.659725356, 4.66},
                {1.7373532637837327E8, 1.7373532638E8},
                {0.382419143569974, 0.38},
                {0.4123047623259056, 0.41},
                {0.06301586882172272, 0.06},
                {0.39911694314467683, 0.4},
                {0.7685189578714594, 0.77},
                {0.16539595230912507, 0.17},
                {0.44564709509868716, 0.45},
                {0.8824176221688326, 0.88},
                {0.49965705290401485, 0.5},
                {0.97619548425804, 0.98},
                {0.3001064304016182, 0.3},
                {0.16411508262041063, 0.16},
                {0.849352306981162, 0.85},
                {0.7950008232704364, 0.8},
                {0.26735414244317723, 0.27},
                {0.8907022035445776, 0.89},
                {0.7955954722615195, 0.8},
                {0.5548281442391715, 0.55},
                {0.21997527519111615, 0.22},
                {0.28962591784769887, 0.29},
                {0.6874020255844823, 0.69},
                {0.3843768931885321, 0.38},
                {0.14988898688250785, 0.15},
                {0.81166241365221, 0.81},
                {0.7775031346991306, 0.78},
                {0.07676411325713295, 0.08},
                {0.3758939553247468, 0.38},
                {0.6823912988784994, 0.68},
                {0.7133589692457248, 0.71},
                {0.8895706333424793, 0.89},
                {0.03185733290460935, 0.03},
                {0.29321665339803893, 0.29},
                {0.0265019479371007, 0.03},
                {0.9871732945126539, 0.99},
                {0.6090098706703752, 0.61},
                {0.7304617655914976, 0.73},
                {0.5968767093933243, 0.6},
                {0.9003413336322571, 0.9},
                {0.16869372300311358, 0.17},
                {0.3301429566546824, 0.33},
                {0.9012979039322976, 0.9},
        };

        return UserImplementation.combineEightWithTestData(baseTestData);
    }

}
