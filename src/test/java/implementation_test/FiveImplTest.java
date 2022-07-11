package implementation_test;

import com.org.ita.kata.Five;
import org.testng.Assert;
import org.testng.annotations.Test;
import implementation_test.data_provider.FiveData;

public class FiveImplTest {

    @Test(dataProvider = "solveSumTestData", dataProviderClass =  FiveData.class, timeOut = 1000)
    public void solveTest(Five impl, double expected, double number) {
        double actual = impl.solveSum(number);
        Assert.assertEquals(actual, expected, 1e-13);
    }

    @Test(dataProvider = "data-provider-zeros", dataProviderClass =  FiveData.class, timeOut = 1000)
    public void testZeros(Five fiveImpl, int data, int expected) {
        int actual = fiveImpl.zeros(data);
        Assert.assertEquals(actual, expected);
    }

}
