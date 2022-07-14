package implementation_test.data_provider;

import implementation_test.UserImplementation;
import org.testng.annotations.DataProvider;

import static implementation_test.UserImplementation.SIX_IMPLEMENTATION;

public class SixData {

    static String resultSheet = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
            + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
            + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
            + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 112,Boston Celtics 112 Philadelphia 76ers 95,"
            + "Brooklyn Nets 100 Chicago Bulls 88,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
            + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
            + "Atlanta Hawks 94.88 Detroit Pistons 106,Chicago Bulls 94 Cleveland Cavaliers 95,"
            + "Los Angeles Lakers 113 Detroit Pistons 112,Los Angeles Lakers 111 Cleveland Cavaliers 111,Los Angeles Lakers 111 Atlanta Hawks 112,";
    static String dataRainfall = "Rome:Jan 81.2,Feb 63.2,Mar 70.3,Apr 55.7,May 53.0,Jun 36.4,Jul 17.5,Aug 27.5," +
            "Sep 60.9,Oct 117.7,Nov 111.0,Dec 97.9" +
            "\nLondon:Jan 48.0,Feb 38.9,Mar 39.9,Apr 42.2,May 47.3,Jun 52.1,Jul 59.5,Aug 57.2,Sep 55.4,Oct 62.0," +
            "Nov 59.0,Dec 52.9" +
            "\nParis:Jan 182.3,Feb 120.6,Mar 158.1,Apr 204.9,May 323.1,Jun 300.5,Jul 236.8,Aug 192.9,Sep 66.3," +
            "Oct 63.3,Nov 83.2,Dec 154.7" +
            "\nNY:Jan 108.7,Feb 101.8,Mar 131.9,Apr 93.5,May 98.8,Jun 93.6,Jul 102.2,Aug 131.8,Sep 92.0,Oct 82.3," +
            "Nov 107.8,Dec 94.2" +
            "\nVancouver:Jan 145.7,Feb 121.4,Mar 102.3,Apr 69.2,May 55.8,Jun 47.1,Jul 31.3,Aug 37.0,Sep 59.6," +
            "Oct 116.3,Nov 154.6,Dec 171.5" +
            "\nSydney:Jan 103.4,Feb 111.0,Mar 131.3,Apr 129.7,May 123.0,Jun 129.2,Jul 102.8,Aug 80.3,Sep 69.3," +
            "Oct 82.6,Nov 81.4,Dec 78.2" +
            "\nBangkok:Jan 10.6,Feb 28.2,Mar 30.7,Apr 71.8,May 189.4,Jun 151.7,Jul 158.2,Aug 187.0,Sep 319.9," +
            "Oct 230.8,Nov 57.3,Dec 9.4" +
            "\nTokyo:Jan 49.9,Feb 71.5,Mar 106.4,Apr 129.2,May 144.0,Jun 176.0,Jul 135.6,Aug 148.5,Sep 216.4," +
            "Oct 194.1,Nov 95.6,Dec 54.4" +
            "\nBeijing:Jan 3.9,Feb 4.7,Mar 8.2,Apr 18.4,May 33.0,Jun 78.1,Jul 224.3,Aug 170.0,Sep 58.4,Oct 18.0," +
            "Nov 9.3,Dec 2.7" +
            "\nLima:Jan 1.2,Feb 0.9,Mar 0.7,Apr 0.4,May 0.6,Jun 1.8,Jul 4.4,Aug 3.1,Sep 3.3,Oct 1.7,Nov 0.5,Dec 0.7";

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
        return UserImplementation.combineSixWithTestData(baseTestData);
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

    @DataProvider(name = "positive-data-NbaCup")
    public static Object[][] testDataNbaCupPositive() {
        Object[][] baseTestData = new Object[][]{
                {resultSheet, "Los Angeles Lakers", "Los Angeles Lakers:W=1;D=1;L=2;Scored=446;Conceded=447;Points=4"},
                {resultSheet, "Los Angeles Clippers", "Los Angeles Clippers:W=2;D=0;L=0;Scored=215;Conceded=192;Points=6"},
                {resultSheet, "Oklahoma City Thunder", "Oklahoma City Thunder:W=0;D=1;L=0;Scored=112;Conceded=112;Points=1"},
                {resultSheet, "Chicago Bulls", "Chicago Bulls:W=0;D=0;L=2;Scored=182;Conceded=195;Points=0"}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "negative-data-NbaCup")
    public static Object[][] testDataNbaCupNegative() {
        Object[][] baseTestData = new Object[][]{
                {resultSheet, "Memphi", "Memphi:This team didn't play!"},
                {resultSheet, "Atlanta Hawks", "Error(float number):Atlanta Hawks 94.88 Detroit Pistons 106"},
                {resultSheet, "", ""}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "data-provider-mean")
    public static Object[][] dataProviderRainfallMean() {
        Object[][] baseTestData = new Object[][]{
                {"London", dataRainfall, 51.199999999999996},
                {"Beijing", dataRainfall, 52.416666666666664},
                {"Tokyo", dataRainfall, 126.8},
                {"Lon", dataRainfall, -1},
                {"Caracas", dataRainfall, -1},
                {"Sydney", dataRainfall, 101.85000000000001}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "data-provider-variance")
    public static Object[][] dataProviderRainfallVariance() {
        Object[][] baseTestData = new Object[][]{
                {"London", dataRainfall, 57.428333333333335},
                {"Beijing", dataRainfall, 4808.37138888889},
                {"Tokyo", dataRainfall, 2619.256666666667},
                {"Lon", dataRainfall, -1},
                {"Caracas", dataRainfall, -1},
                {"Sydney", dataRainfall, 483.1075000000001}
        };
        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "stockSummaryData")
    public static Object[][] dataProviderStockSummary() {
        Object[][] baseTestData = new Object[][]
                {
                        {new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"},
                                new String[]{"A", "B"}, "(A : 200) - (B : 1140)"},
                        {new String[]{"BBAR 150", "CDXE 515", "BKWR 250", "BTSQ 890", "DRTY 600"},
                                new String[]{"A", "B", "C", "D"}, "(A : 0) - (B : 1290) - (C : 515) - (D : 600)"},
                        {new String[]{"CBART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"},
                                new String[]{"A", "B", "C", "W"}, "(A : 0) - (B : 114) - (C : 70) - (W : 0)"},
                        {new String[]{"ROXANNE 102", "RHODODE 123", "BKWRKAA 125", "BTSQZFG 239", "DRTYMKH 060"},
                                new String[]{"B", "R", "D", "X"}, "(B : 364) - (R : 225) - (D : 60) - (X : 0)"}

                };

        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }

    @DataProvider(name = "stockSummaryDataNegative")
    public static Object[][] dataProviderStockSummaryNegative() {
        Object[][] baseTestData = new Object[][]
                {
                        {new String[]{"ROXANNE 102", "RHODODE 123", "BKWRKAA 125", "BTSQZFG 239", "DRTYMKH 060"},
                                new String[]{}, ""},
                        {new String[]{},
                                new String[]{"B", "R", "D", "X"}, ""},
                        {new String[]{},
                                new String[]{}, ""}

                };

        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }
    @DataProvider(name = "balanceData")
    public static Object[][] dataProviderBalance() {
        Object[][] baseTestData = new Object[][]
                {
                        {"1000.00\n" +
                                "125 Market 125.45\n" +
                                "126 Hardware 34.95\n" +
                                "127 Video 7.45\n" +
                                "128 Book 14.32\n" +
                                "129 Gasoline 16.10",

                                "Original Balance: 1000,00\\r\\n"+
                                "125 Market 125.45 Balance 874,55\\r\\n" +
                                "126 Hardware 34.95 Balance 839,60\\r\\n" +
                                "127 Video 7.45 Balance 832,15\\r\\n" +
                                "128 Book 14.32 Balance 817,83\\r\\n" +
                                "129 Gasoline 16.10 Balance 801,73\\r\\n" +
                                "Total expense  198,27\\r\\n" +
                                "Average expense  39,65"}
                };

        return UserImplementation.combineImplWithTests(SIX_IMPLEMENTATION, baseTestData);
    }
}
