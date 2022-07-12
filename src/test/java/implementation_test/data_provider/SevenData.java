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

    @DataProvider(name = "WhereIsVasyaTestData")
    public static Object[][] TestWhereIsVasya() {
        Object[][] baseTestData = new Object[][]{
                { new int[]{3, 1, 1}, 2},
                { new int[]{5, 2, 3}, 3},
                { new int[]{69,9,26}, 27},
                { new int[]{92,34,76}, 58},
                { new int[]{94,80,18}, 14},
                { new int[]{87,75,33}, 12},
                { new int[]{81,11,19}, 20},
                { new int[]{97,84,27}, 13},
                { new int[]{6,5,5}, 1},
                { new int[]{5,4,0}, 1}
        };
        return UserImplementation.combineImplWithTests(SEVEN_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "newAVGTestData")
    public static Object[][] TestNewAVG() {
        Object[][] baseTestData = new Object[][]{
                { new double[] {14.0, 30.0, 5.0, 7.0, 9.0, 11.0, 16.0}, 90, 628},
                { new double[] {14, 30, 5, 7, 9, 11, 15}, 92, 645},
                { new double[] {1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98}, 10000.0, 58430},
                { new double[] {1400.25, 30000.76, 5.56, 7.0, 9.0, 11.0, 15.48, 120.98}, 5800.0, 20630},
                { new double[] {}, 90.0, 90},
                { new double[] {75246.6, 103573.8, 78457.5, 123852.3, 117791.3, 82212.90000000001, 172739.6,
                        94494.40000000001, 120345.50000000001, 2909.5000000000005, 15669.500000000002, 84293.0,
                        52412.8, 207358.80000000002, 173803.30000000002, 195800.00000000003, 84543.8, 33918.5,
                        102402.3, 18122.5, 81072.20000000001, 202562.80000000002, 186523.7, 203358.1, 180643.1,
                        84109.3, 44625.9, 148099.6, 88079.20000000001, 219531.40000000002, 39114.9, 179360.5,
                        207099.2}, 122556.6, 362797}
        };
        return UserImplementation.combineImplWithTests(SEVEN_IMPLEMENTATION, baseTestData);
    }
}
