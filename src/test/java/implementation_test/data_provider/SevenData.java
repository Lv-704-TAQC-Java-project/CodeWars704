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
}
