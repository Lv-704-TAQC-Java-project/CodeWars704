package implementation_test.data_provider;

import org.testng.annotations.DataProvider;
import implementation_test.UserImplementation;

import static implementation_test.UserImplementation.EIGHT_IMPLEMENTATION;
import static implementation_test.UserImplementation.SIX_IMPLEMENTATION;

public class SixData {

    @DataProvider(name = "fTestData")
    public static Object[][] fTestData() {
        Object[][] baseTestData = new Object[][]{
                {1.2999999915500002E-8, 2.6E-8},
                {6.999999997549999E-10, 1.4E-9},
                {2.4999968750078126E-6, 5.0E-6},
                {1.1999999280000085E-7, 2.4E-7},
                {1.2999999915500002E-8, 2.6E-8},
                {6.999999997549999E-10, 1.4E-9},
                {2.4999968750078126E-6, 5.0E-6},
                {1.1999999280000085E-7, 2.4E-7},
                {1.0499999999944874E-11, 2.1E-11},
                {8.499638780702988E-5, 1.7E-4},
                {9.499999548750043E-8, 1.9E-7},
                {8.9999999595E-9, 1.8E-8},
                {2.0999999779500005E-8, 4.2E-8},
                {3.499938752143656E-5, 7.0E-5},
                {1.3499088872997994E-4, 2.7E-4},
                {1.3499990887512302E-6, 2.7E-6},
                {8.999959500364496E-6, 1.8E-5},
                {5.99999982000001E-8, 1.2E-7},
                {1.5999998720000206E-7, 3.2E-7},
                {1.9999999998E-10, 4.0E-10},
                {2.9999955000135E-6, 6.0E-6},
                {1.6499999986387501E-9, 3.3E-9},
                {9.999999950000001E-9, 2.0E-8},
                {3.99999999992E-11, 8.0E-11},
                {1.899981950342942E-5, 3.8E-5},
                {3.4999938750214374E-6, 7.0E-6},
                {3.499999993875E-9, 7.0E-9},
                {6.499788763730134E-5, 1.3E-4},
                {1.49999998875E-8, 3.0E-8},
                {7.499971875210936E-6, 1.5E-5},
                {1.3499999088750124E-7, 2.7E-7},
                {1.8499999828875003E-8, 3.7E-8},
                {1.4999887501687468E-5, 3.0E-5},
                {4.999999999875E-11, 1.0E-10},
                {1.9999999800000004E-8, 4.0E-8},
                {4.999999999875E-11, 1.0E-10},
                {9.499999954875E-9, 1.9E-8},
                {7.99999680000256E-7, 1.6E-6},
                {1.5499998798750185E-7, 3.1E-7},
                {5.499999984875E-9, 1.1E-8},
                {1.5998720204759052E-4, 3.2E-4},
                {1.949999999809875E-10, 3.9E-10},
                {1.049999999944875E-10, 2.1E-10},
                {1.4498948902403626E-4, 2.9E-4},
                {1.999998000004E-6, 4.0E-6},
                {9.999950000499994E-6, 2.0E-5},
                {7.499999971875E-9, 1.5E-8},
                {8.499999963875001E-9, 1.7E-8},
                {4.9999875000625E-6, 1.0E-5},
                {9.999995000005E-7, 2.0E-6},
                {1.6999999855500004E-8, 3.4E-8},
                {1.3999020137175994E-4, 2.8E-4},
                {6.999999997549999E-10, 1.4E-9},
                {1.7999983800029159E-6, 3.6E-6},
                {3.49999999993875E-11, 7.0E-11},
                {1.3499088872997994E-4, 2.7E-4},
                {1.8999999998194998E-10, 3.8E-10},
                {4.99999999875E-10, 1.0E-9},
                {1.6499999863875E-8, 3.3E-8},
                {5.9999999982E-10, 1.2E-9},
                {1.0499999944875E-8, 2.1E-8},
                {1.0499944875578804E-5, 2.1E-5},
                {8.99999999595E-10, 1.8E-9},
                {4.9999875000625E-6, 1.0E-5}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "data-provider-findNb")
    public static Object[][] dataProviderFindNb() {
        Object[][] baseTestData = new Object[][]
                {
                        {4, -1},
                        {24723578342962L, -1},
                        {135440716410000L, 4824},
                        {40539911473216L, 3568},
                        {108806345136785L, -1},
                        {135440716410000L, 4824},
                        {2077755840805829284L, 53692},
                        {1915123148621265025L, 52609},
                        {1724640336594140626L, -1}
                };

        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    static String resultSheet = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
            + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
            + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
            + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
            + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
            + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
            + "Atlanta Hawks 94.88 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";

    @DataProvider(name = "positive-data-NbaCup")
    public static Object[][] testDataNbaCupPositive() {
        Object[][] baseTestData = new Object[][]{
                {resultSheet, "Los Angeles Clippers", "Los Angeles Clippers:W=2;D=0;L=0;Scored=215;Conceded=192;Points=6"}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "negative-data-NbaCup")
    public static Object[][] testDataNbaCupNegative() {
        Object[][] baseTestData = new Object[][]{
                {resultSheet, "Memphi", "Memphi:This team didn't play!"},
                {resultSheet, "Atlanta Hawks", "Error(float number):Atlanta Hawks 94.88 Detroit Pistons 106"}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

}
