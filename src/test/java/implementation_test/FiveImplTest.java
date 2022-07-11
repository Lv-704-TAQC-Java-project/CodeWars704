package implementation_test;

import com.org.ita.kata.Five;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import implementation_test.data_provider.FiveData;

public class FiveImplTest {

    @DataProvider(name = "solveSumTestData")
    public Object[][] solveSumTestData() {
        return FiveData.solveSumTestData();
    }

    @Test(dataProvider = "solveSumTestData", timeOut = 1000)
    public void solveTest(Five impl, double expected, double number) {
        double actual = impl.solveSum(number);
        Assert.assertEquals(actual, expected, 1e-13);
    }

}
