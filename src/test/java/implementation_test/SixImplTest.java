package implementation_test;

import com.org.ita.kata.Six;
import implementation_test.data_provider.SixData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class SixImplTest {

    @Test(dataProvider = "fTestData", dataProviderClass = SixData.class)
    public void fTest(Six impl, double expected, double number) {
        double actual = impl.f(number);
        Assert.assertEquals(actual, expected, 1e-16);
    }

    @Test(dataProvider = "data-provider-findNb", dataProviderClass = SixData.class)
    public void testFindNb(Six sixImpl, long number, long expected) {
        long actual = sixImpl.findNb(number);
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

    @Test(dataProvider = "data-provider-mean", dataProviderClass = SixData.class)
    public void testRainfallMean(Six sixImpl, String town, String strng, double expected) {
        double actual = sixImpl.mean(town, strng);
        Assert.assertEquals(actual, expected, 1e-2);
    }

    @Test(dataProvider = "data-provider-variance", dataProviderClass = SixData.class)
    public void testRainfallVariance(Six sixImpl, String town, String strng, double expected) {
        double actual = sixImpl.variance(town, strng);
        Assert.assertEquals(actual, expected, 1e-2);
    }

    @Test(dataProvider = "stockSummaryData", dataProviderClass = SixData.class)
    public void testStockSummary(Six sixImpl, String[] lstOfArt, String[] lstOf1stLetter, String expected) {
        String actual = sixImpl.stockSummary(lstOfArt, lstOf1stLetter);
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.asList(lstOfArt));
    }
    @Test(dataProvider = "balanceData", dataProviderClass = SixData.class)
    public void testBalance(Six sixImpl, String book, String expected) {
        String actual = sixImpl.balance(book);
        Assert.assertEquals(actual, expected, "Error: your string was " + Arrays.asList(book));
    }

    @Test(dataProvider = "stockSummaryDataNegative", dataProviderClass = SixData.class)
    public void testStockSummaryNegative(Six sixImpl, String[] lstOfArt, String[] lstOf1stLetter, String expected) {
        String actual = sixImpl.stockSummary(lstOfArt, lstOf1stLetter);
        Assert.assertEquals(actual, expected, "Error: your array was " + Arrays.asList(lstOfArt));
    }

}
