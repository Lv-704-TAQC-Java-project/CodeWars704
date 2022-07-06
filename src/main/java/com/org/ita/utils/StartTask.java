package com.org.ita.utils;

import java.util.Arrays;

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
            case 2:
                runGetVolumeOfCuboid();
                break;
            case 3:
                runMpgToKPM();
                break;
            case 5:
                runCountPositivesSumNegatives();
                break;
            case 10:
                runNewAvg();
                break;
            case 11:
                runSeriesSum();
                break;
            case 16:
                runRainfall();
                break;
            case 17:
                runNbaCup();
                break;
            case 20:
                runGap();
                break;
            case 23:
                runSmallest();
                break;
            default:
                System.out.println("rest will be done soon");
        }

    }

    public void runLiters() {
        System.out.println("Run task liters.\nPlease input time (double):");
        double a = br.readDouble();
        double answer = member.getEight().liters(a);
        System.out.println("Result - " + answer + " hours");
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
    public void runZeros(){
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
        System.out.println("Run task CountPositivesSumNegatives.\nPlease input an array of integers:");
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

    public void runSeriesSum(){
        System.out.println("Run task seriesSum.\nPlease input the number (int):");
        int n = br.readInt();
        String answer = member.getSeven().seriesSum(n);
        System.out.println("The sum of following series " + answer);
    }

    public void runNewAvg() {
        System.out.println("Run task newAvg.\nPlease input an array of numbers (double)");
        double[] arr = br.readDoubleArr();
        System.out.println("Please input average navg (double):");
        double nabg = br.readDouble();
        double result = member.getSeven().newAvg(arr, nabg);
        System.out.println("The expected donation is " + result + " $");
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
}

