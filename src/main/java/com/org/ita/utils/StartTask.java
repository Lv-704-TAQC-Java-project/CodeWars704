package com.org.ita.utils;

import java.math.BigInteger;
import java.util.Arrays;

import static com.org.ita.utils.Message.*;

public class StartTask implements Runner {

    private Group member;
    Buffer br = new Buffer();

    @Override
    public void run() {

        if (SettingsMenu.getSetImplementation() == 0) {
            System.out.println("First pick user");
            int userId = br.readInt();
            member = Group.getMemberById(userId);
        } else {
            member = Group.getMemberById(SettingsMenu.getSetImplementation());
        }

        setMember(member);
        System.out.println("Please pick task");
        int a = br.readInt();
        runTask(a);
    }

    public void setMember(Group member) {
        this.member = member;
    }

    public void runTask(int taskId) {
        switch (taskId) {
            case 1:
                runLiters();
                break;
            case 2:
                runGetVolumeOfCuboid();
                break;
            case 3:
                runMpgToKPM();
                break;
            case 4:
                runSquareOrSquareRoot();
                break;
            case 5:
                runCountPositivesSumNegatives();
                break;
            case 6:
                runStringToNumber();
                break;
            case 7:
                runAmIWilson();
                break;
            case 8:
                runTwoDecimalPlaces();
                break;
            case 9:
                runDivisibleBy();
                break;
            case 10:
                runNewAvg();
                break;
            case 11:
                runSeriesSum();
                break;
            case 12:
                runWhereIsHe();
                break;
            case 13:
                runFindNb();
                break;
            case 15:
                runF();
                break;
            case 16:
                runRainfall();
                break;
            case 17:
                runNbaCup();
                break;
            case 18:
                runStockSummary();
                break;
            case 19:
                runArtificialRain();
                break;
            case 20:
                runGap();
                break;
            case 21:
                runZeros();
                break;
            case 22:
                runPerimeter();
                break;
            case 23:
                runSolveSum();
                break;
            case 24:
                runSmallest();
                break;
            default:
                System.out.println("rest will be done soon");
        }

    }

    public void runLiters() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task liters", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("The function liters returns the number of litres person should drink, rounded to the smallest value", ANSI_YELLOW);
        System.out.println("Please input time (hours):");
        double a = br.readDouble();
        if (a > 0) {
            double answer = member.getEight().liters(a);
            colorln("Result - " + answer + " hours", ANSI_BLUE);
        } else {
            colorln("Please input number larger than 0. Try again!", ANSI_RED);
            runLiters();
        }
    }

    public void runGetVolumeOfCuboid() {
        System.out.println("Run task getVolumeOfCuboid.\nPlease input length of cuboid (double):");
        double a = br.readDouble();

        System.out.println("Run task getVolumeOfCuboid.\nPlease input width of cuboid (double):");
        double b = br.readDouble();

        System.out.println("Run task getVolumeOfCuboid.\nPlease input height of cuboid (double):");
        double c = br.readDouble();

        double volume = member.getEight().getVolumeOfCuboid(a, b, c);
        System.out.println("Result - " + volume + " volume");
    }

    public void runAmIWilson() {
        System.out.println("Run task amIWilson.\nPlease input number (double):");
        double n = br.readDouble();
        System.out.println("Is " + n + "Wilson?");
        boolean numb = member.getEight().amIWilson(n);
        System.out.println("Result: " + numb);
    }

    public void runZeros() {
        System.out.println("Run task zeros.\nPlease input the number (int):");
        int factor = br.readInt();
        int answer = member.getFive().zeros(factor);
        System.out.println("The amount of trailing zeros in factorial " + answer);
    }

    public void runStringToNumber() {
        System.out.println("Run task stringToNumber.\nPlease input value (String):");
        String a = br.readString();
        int answer = member.getEight().stringToNumber(a);
        System.out.println("Result " + answer);
    }

    public void runWhereIsHe() {
        System.out.println("Run task WhereIsHe.\nPlease input the total amount of people (int):");
        int p = br.readInt();

        System.out.println("Run task WhereIsHe.\nPlease input amount of people before (int):");
        int bef = br.readInt();

        System.out.println("Run task WhereIsHe.\nPlease input amount of people after (int):");
        int aft = br.readInt();

        int answer = member.getSeven().whereIsHe(p, bef, aft);
        System.out.println("The amount of possible positions " + answer);
    }

    public void runRainfall() {
        System.out.println("Run task Rainfall.\nPlease input the town (string):");
        String town = br.readString();

        System.out.println("Run task Rainfall.\nPlease input data of rain (string):");
        String data = br.readString();

        double mean = member.getSix().mean(town, data);
        double variance = member.getSix().variance(town, data);

        System.out.println("Mean of your data is " + mean);
        System.out.println("Variance of your data is " + variance);
    }

    public void runSmallest() {
        System.out.println("Run task getVolumeOfCuboid.\nPlease enter positive number (long):");
        long n = br.readLong();

        long[] resultArr = member.getFive().smallest(n);
        System.out.println("You have entered " + n);
        System.out.println("The smallest number you got by one swap is: " + resultArr[0]);
        System.out.println("You can get this number by taking digit from index " + resultArr[1] + " and inserting it at index " + resultArr[2]);
    }

    public void runF() {
        System.out.println("Run task f.\nPlease input x (double):");
        double x = br.readDouble();
        double answer = member.getSix().f(x);
        System.out.println("Result " + answer);
    }

    public void runFindNb() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task findNb.", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("This method should return you the number n that belongs to the function - n^3 + (n-1)^3 + ... + 1^3 = m", ANSI_YELLOW);
        System.out.println("Please enter positive number (long):");
        long n = br.readLong();
        if (n > 0) {
            long result = member.getSix().findNb(n);
            colorln("You have entered " + n, ANSI_BLUE);
            if (result >= 0) {
                colorln("Your number n is: ", ANSI_YELLOW);
                colorln("" + result, ANSI_RED);
            } else {
                colorln("There is no such n", ANSI_YELLOW);
            }
        } else {
            colorln("Please enter a positive number greater than 0", ANSI_RED);
            runFindNb();
        }
        System.out.println();
    }

    public void runSolveSum() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task solveSum.", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("This method returns the value of x from the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n", ANSI_YELLOW);
        System.out.println("Please input m > 0 (double) :");
        double a = br.readDouble();
        if (a > 0) {
            colorln("You have entered " + a, ANSI_BLUE);
            double result = member.getFive().solveSum(a);
            colorln("The number x is equal: ", ANSI_YELLOW);
            colorln("" + result, ANSI_RED);
        } else {
            colorln("Please input m larger then 0", ANSI_RED);
            runSolveSum();
        }
    }

    public void runMpgToKPM() {
        System.out.println("Run task mpgToKPM.\nPlease input x (float):");
        float x = br.readFloat();
        float answer = member.getEight().mpgToKPM(x);
        System.out.println("Result " + answer + " kilometers per liter");
    }

    public void runTwoDecimalPlaces() {
        System.out.println("Run task twoDecimalPlaces.\nPlease input number (double):");
        double a = br.readDouble();
        double answer = member.getEight().twoDecimalPlaces(a);
        System.out.println("Result " + answer);
    }

    public void runCountPositivesSumNegatives() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task CountPositivesSumNegatives", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln ("The function CountPositivesSumNegatives array (the 1st element is the count of positives and the 2nd is sum of negatives", ANSI_YELLOW);
        colorln("Please input an array of integers:", ANSI_RESET);
        int[] intArr = br.readIntArr();
        int[] answer = member.getEight().countPositivesSumNegatives(intArr);
        System.out.println("Result " + Arrays.toString(answer));
    }

    public void runGap() {
        System.out.println("Run task Gap.\nPlease input the gap we are looking for (int):");
        int g = br.readInt();

        System.out.println("Please input the start of the search (long):");
        long m = br.readLong();

        System.out.println("Please input the end of the search (long):");
        long n = br.readLong();

        long[] answer = member.getFive().gap(g, m, n);
        System.out.println("Result " + Arrays.toString(answer) + " gap");
    }

    public void runArtificialRain() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task artificialRain.", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Methods of deriving the number that conveys the maximum coverage of the array section", ANSI_YELLOW);
        System.out.println("Please input an array of integers:");
        int[] intArr = br.readIntArr();
        int result = member.getFive().artificialRain(intArr);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("The maximum number of numbers that will be covered by artificial rain is equal to ", ANSI_YELLOW);
        colorln("" + result, ANSI_RED);
    }

    public void runSeriesSum() {
        System.out.println("Run task seriesSum.\nPlease input the number (int):");
        int n = br.readInt();
        String answer = member.getSeven().seriesSum(n);
        System.out.println("The sum of following series " + answer);
    }

    public void runNewAvg() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task NewAvg", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("The function liters returns the expected donation that will permit to reach the average navg", ANSI_YELLOW);
        colorln("Please input an array of donations (double):", ANSI_RESET);
        double[] arr = br.readDoubleArr();
        colorln("Please input average navg (double):", ANSI_RESET);
        double nabg = br.readDouble();
        double arrAverage = 0;
        for (Double a : arr) {
            arrAverage+=a;
        }
        if (nabg < arrAverage) {
            colorln("Expected navr should be bigger than existing one. Try again!", ANSI_RED);
            System.out.println();
            runNewAvg();
        } else {
            double result = member.getSeven().newAvg(arr, nabg);
            colorln("The expected donation is " + result + " $", ANSI_PURPLE);
        }
    }

    String resultSheet = "Los Angeles Clippers 104 Dallas Mavericks 88,New York Knicks 101 Atlanta Hawks 112,Indiana Pacers 103 Memphis Grizzlies 112,"
            + "Los Angeles Lakers 111 Minnesota Timberwolves 112,Phoenix Suns 95 Dallas Mavericks 111,Portland Trail Blazers 112 New Orleans Pelicans 94,"
            + "Sacramento Kings 104 Los Angeles Clippers 111,Houston Rockets 85 Denver Nuggets 105,Memphis Grizzlies 76 Cleveland Cavaliers 106,"
            + "Milwaukee Bucks 97 New York Knicks 122,Oklahoma City Thunder 112 San Antonio Spurs 106,Boston Celtics 112 Philadelphia 76ers 95,"
            + "Brooklyn Nets 100 Chicago Bulls 115,Detroit Pistons 92 Utah Jazz 87,Miami Heat 104 Charlotte Hornets 94,"
            + "Toronto Raptors 106 Indiana Pacers 99,Orlando Magic 87 Washington Wizards 88,Golden State Warriors 111 New Orleans Pelicans 95,"
            + "Atlanta Hawks 94 Detroit Pistons 106,Chicago Bulls 97 Cleveland Cavaliers 95,";

    public void runNbaCup() {
        System.out.println("Run task NbaCup.\nPlease input some team, e.g. - Boston Celtics or Los Angeles Clippers");
        String team = br.readString();
        String teamScore = member.getSix().nbaCup(resultSheet, team);
        System.out.println("Result for the team " + team + " : " + teamScore);
    }

    public void runStockSummary() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task 'Help the bookseller!'", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        System.out.println("Enter an array of strings (strings are divided by comma) in the following format:");
        colorln("ABART 20, CDXEF 50, BKWRK 25, BTSQZ 89, DRTYM 60", ANSI_YELLOW);
        System.out.println("Where 3, 4, 5 letters represent a book code and digits after a 'space'");
        System.out.println("indicate the quantity of books by this code in stock.");
        String[] lstOfArt = br.readStringArrSplitByComma();
        lstOfArt = Arrays.stream(lstOfArt).map(String::trim).toArray(String[]::new);

        colorln(DIVIDER, ANSI_BLUE);
        System.out.println("Enter an array of strings (strings are divided by comma) in the following format:");
        colorln("A, B, C, W", ANSI_YELLOW);
        String[] lstOf1stLetter = br.readStringArrSplitByComma();
        lstOf1stLetter = Arrays.stream(lstOf1stLetter).map(String::trim).toArray(String[]::new);

        String result = member.getSix().stockSummary(lstOfArt, lstOf1stLetter);
        colorln(DIVIDER, ANSI_BLUE);
        System.out.println("You've got a following result:");
        colorln(result, ANSI_RED);
        System.out.println("Where (key: value) - 'key' is a book category and 'value' is quantity of books in category.");
    }


    public void runSquareOrSquareRoot() {
        System.out.println("Run task SquareOrSquareRoot.\nPlease input an array of integers:");
        int[] intArr = br.readIntArr();
        int[] answer = member.getEight().squareOrSquareRoot(intArr);
        System.out.println("Result " + Arrays.toString(answer));
    }

    public void runDivisibleBy() {
        System.out.println("Run task DivisibleBy.\nPlease input an array of integers:");
        int[] intArr = br.readIntArr();

        System.out.println("Run task DivisibleBy.\nPlease input divider (integer):");
        int div = br.readInt();

        int[] answer = member.getEight().divisibleBy(intArr, div);
        System.out.println("Result " + Arrays.toString(answer));
    }

    public void runPerimeter() {
        colorln(DIVIDER, ANSI_BLUE);
        colorln("Run task runPerimeter", ANSI_BLUE);
        colorln(DIVIDER, ANSI_BLUE);
        colorln("The function perimeter returns the total perimeter of all the squares.", ANSI_YELLOW);
        System.out.println("Please input some number N where N + 1 is the number of squares: ");
        BigInteger n = br.readBigInteger();
        if (n.compareTo(BigInteger.valueOf(0)) > 0) {
            BigInteger result = member.getFive().perimeter(n);
            colorln("The perimeter you are looking for is equal ", ANSI_YELLOW);
            colorln("" + result, ANSI_RED);
        } else {
            colorln("Please input number larger than 0", ANSI_RED);
            System.out.println();
            runPerimeter();
        }

    }
}

