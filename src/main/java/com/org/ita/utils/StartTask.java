package com.org.ita.utils;

import java.sql.SQLOutput;
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
            case 5:
                runCountPositivesSumNegatives();
                break;
            case 16:
                runRainfall();
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

        System.out.println("Please input width of cuboid (double):");
        double b = br.readDouble();

        System.out.println("Please input height of cuboid (double):");
        double c = br.readDouble();

        double volume = member.getEight().getVolumeOfCuboid(a, b, c);
        System.out.println("Result - " + volume + " volume");
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

    public void runCountPositivesSumNegatives() {
        System.out.println("Run task CountPositivesSumNegatives.\nPlease input an array of integers:");
        int[] intArr = br.readIntArr();
        int[] answer = member.getEight().countPositivesSumNegatives(intArr);
        System.out.println("Result " + Arrays.toString(answer));
    }
}

