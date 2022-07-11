package implementation_test.data_provider;

import org.testng.annotations.DataProvider;
import implementation_test.UserImplementation;

import static implementation_test.UserImplementation.FIVE_IMPLEMENTATION;

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
                {0.9928189850440021, 19253.0},
                {0.9939142296138497, 26836.0},
                {0.9949394557583313, 38851.0},
                {0.9957745932880984, 55773.0},
                {0.995958314806545, 60970.0},
                {0.9972315437900073, 130113.0},
                {0.9972899330386218, 135788.0},
                {0.997493001056446, 158709.0},
                {0.9978936852325816, 224925.0},
                {0.9981157639169388, 281132.0},
                {0.9983155854800566, 351860.0},
                {0.9984497298708994, 415443.0},
                {0.9984889255580258, 437292.0},
                {0.9984997081334787, 443605.0},
                {0.99848136776115, 432947.0},
                {0.9985501958215017, 475063.0},
                {0.9985867860840736, 500000.0},
        };
        return UserImplementation.combineImplWithTests(FIVE_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "GapTestDataValid")
    public static Object[][] GapTestDataValid() {
        Object[][] baseTestData = new Object[][]{
                { new int[]{2,100,110}, "[101, 103]"},
                { new int[]{4,100,110}, "[103, 107]"},
                { new int[]{8,300,400}, "[359, 367]"},
                { new int[]{10,300,400}, "[337, 347]"},
                { new int[]{2,823972,824972}, "[824189, 824191]"},
                { new int[]{2,850053,851053}, "[850061, 850063]"},
                { new int[]{2,999506,1000506}, "[999611, 999613]"},
                { new int[]{4,30000,100000}, "[30109, 30113]"},
                { new int[]{2,1201,2201}, "[1229, 1231]"},
                { new int[]{2,656084,657084}, "[656321, 656323]"}
        };
        return UserImplementation.combineImplWithTests(FIVE_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "GapTestDataNotValid")
    public static Object[][] GapTestDataNotValid() {
        Object[][] baseTestData = new Object[][]{
                {new int[]{6, 100, 110}, null},
                {new int[]{11, 30000, 100000}, null}
        };
        return UserImplementation.combineImplWithTests(FIVE_IMPLEMENTATION, baseTestData);
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
        return UserImplementation.combineImplWithTests(FIVE_IMPLEMENTATION, baseTestData);
    }
}
