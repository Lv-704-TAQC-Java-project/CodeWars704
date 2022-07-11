package implementation_test;

import com.org.ita.kata.Six;
import implementation_test.data_provider.SixData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SixImplTest {

    @DataProvider(name = "fTestData")
    public Object[][] fTestData() {
        return SixData.fTestData();
    }

    @Test(dataProvider = "fTestData")
    public void fTest(Six impl, double expected, double number) {
        double actual = impl.f(number);
        Assert.assertEquals(actual, expected, 1e-16);
    }

}
