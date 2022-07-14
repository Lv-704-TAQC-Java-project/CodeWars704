package implementation_test.data_provider;

import implementation_test.UserImplementation;
import org.testng.annotations.DataProvider;
import java.math.BigInteger;


public class FiveData {

    @DataProvider(name = "solveSumTestData")
    public static Object[][] solveSumTestData() {
        Object[][] baseTestData = new Object[][]{
                {0.5, 2.0},
                {0.6096117967977924, 4.0},
                {0.641742430504416, 5.0},
                {0.6666666666666666, 6.0},
                {0.7034648345913732, 8.0},
                {0.7298437881283576, 10.0},
                {0.75, 12.0},
                {0.7584573119507494, 13.0},
                {0.7660773415974732, 14.0},
                {0.7850992981494684, 17.0},
                {0.8, 20.0},
                {0.8682255312124219, 50.0},
                {0.9771107023342285, 1865.0},
                {0.979836391277535, 2410.0},
                {0.9854672191704688, 4666.0},
                {0.9907207378963475, 11506.0},
                {0.9957745932880984, 55773.0},
                {0.9972899330386218, 135788.0},
                {0.9978936852325816, 224925.0},
                {0.9983155854800566, 351860.0},
                {0.9984497298708994, 415443.0},
                {0.9985867860840736, 500000.0},
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }

    @DataProvider(name = "GapTestDataValid")
    public static Object[][] GapTestDataValid() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{2, 100, 110}, "[101, 103]"},
                {new int[]{4, 100, 110}, "[103, 107]"},
                {new int[]{8, 300, 400}, "[359, 367]"},
                {new int[]{10, 300, 400}, "[337, 347]"},
                {new int[]{2, 823972, 824972}, "[824189, 824191]"},
                {new int[]{2, 850053, 851053}, "[850061, 850063]"},
                {new int[]{2, 999506, 1000506}, "[999611, 999613]"},
                {new int[]{4, 30000, 100000}, "[30109, 30113]"},
                {new int[]{2, 1201, 2201}, "[1229, 1231]"},
                {new int[]{2, 656084, 657084}, "[656321, 656323]"}
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }

    @DataProvider(name = "GapTestDataNotValid")
    public static Object[][] GapTestDataNotValid() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{6, 100, 110}, null},
                {new int[]{11, 30000, 100000}, null}
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }

    @DataProvider(name = "data-provider-zeros")
    public static Object[][] dataProviderFindNb() {
        Object[][] baseTestData = new Object[][]{
                {6, 1},
                {14, 2},
                {0, 0},
                {1000, 249},
                {100000, 24999},
                {509807639, 127451905},
                {1000000000, 249999998},
                {645925310, 161481322}
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }

    @DataProvider(name = "artificialRainData")
    public static Object[][] artificialRainTestData() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{2}, 1},
                {new int[]{5, 0, 9, 8, 0, 7, 6, 3, 9}, 4},
                {new int[]{1, 2, 7, 4, 0, 1, 9, 0, 5}, 5},
                {new int[]{0, 0, 1, 0, 0, 0}, 6},
                {new int[]{0, 0, 0, 0, 0, 0}, 6},
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }

    @DataProvider(name = "smallestData")
    public static Object[][] smallestTestData() {
        Object[][] baseTestData = new Object[][]{
                {261235, new long[]{126235, 2, 0}},
                {209917, new long[]{29917, 0, 1}},
                {285365, new long[]{238565, 3, 1}},
                {269045, new long[]{26945, 3, 0}},
                {296837, new long[]{239687, 4, 1}},
                {1000000, new long[]{1, 0, 6}},
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }

    @DataProvider(name = "perimeterData")
    public static Object[][] perimeterTestData() {
        Object[][] baseTestData = new Object[][]{
                {BigInteger.valueOf(5),BigInteger.valueOf(80)},
                {BigInteger.valueOf(7),BigInteger.valueOf(216)}
        };
        return UserImplementation.combineFiveWithTestData(baseTestData);
    }
}
