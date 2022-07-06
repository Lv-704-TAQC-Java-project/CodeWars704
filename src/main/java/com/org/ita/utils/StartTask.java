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
                break;  
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
            case 13:
                runFindNb();
                break;
            case 16:
                runRainfall();
                break;
            case 19:
                runArtificialRain();
                break;
            case 20:
                runGap();
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
    
    public void runFindNb() {
        System.out.println("Run task findNb.");
        System.out.println("This method should return you the number n that belongs to the function - n^3 + (n-1)^3 + ... + 1^3 = m");
        System.out.println("Please enter positive number (long):");
        long n = br.readLong();
        if (n > 0) {
            long result = member.getSix().findNb(n);
            System.out.println("You have entered " + n);
            if (result >= 0) {
                System.out.println("Your number n is: " + result);
            } else {
                System.out.println("There is no such n");
            }
        } else {
            System.out.println("Please enter a positive number greater than 0");
            runFindNb();
        }
        System.out.println();
    }

    public void runSolveSum() {
        System.out.println("Run task solveSum.");
        System.out.println("This method returns the value of x from the sequence U(n, x) = x + 2x**2 + 3x**3 + .. + nx**n");
        System.out.println("Please input m > 0 (double) :");
        double a = br.readDouble();
        if (a > 0) {
            System.out.println("You have entered " + a);
            double result = member.getFive().solveSum(a);
            System.out.println("The number x is equal: " + result);
        } else {
            System.out.println("Please input m larger then 0");
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

    public void runArtificialRain() {
        System.out.println("Run task artificialRain.");
        System.out.println("Methods of deriving the number that conveys the maximum coverage of the array section");
        System.out.println("Please input an array of integers:");
        int[] intArr = br.readIntArr();
        int result = member.getFive().artificialRain(intArr);
        System.out.println("The maximum number of numbers that will be covered by artificial rain is equal to " + result);
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
}

