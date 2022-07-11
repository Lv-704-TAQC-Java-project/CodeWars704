package implementation_test;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Six;
import implementation_test.data_provider.EightData;
import implementation_test.data_provider.SixData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SixImplTest {

    @Test(dataProvider = "fTestData", dataProviderClass = SixData.class)
    public void fTest(Six impl, double expected, double number) {
        double actual = impl.f(number);
        Assert.assertEquals(actual, expected, 1e-16);
    }

    @Test(dataProvider = "data-provider-findNb", dataProviderClass = SixData.class)
    public void testFindNb(Six sixImpl, long data, long expected) {
        long actual = sixImpl.findNb(data);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "positive-data-NbaCup", dataProviderClass = SixData.class)
    public void testNbaCupPositive(Six sixImpl, String sheet, String team, String expected) {
        String actual = sixImpl.nbaCup(sheet, team);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "negative-data-NbaCup", dataProviderClass = SixData.class)
    public void testNbaCupNegative(Six sixImpl, String sheet, String team, String expected) {
        String actual = sixImpl.nbaCup(sheet, team);
        Assert.assertEquals(actual, expected);
    }

}
