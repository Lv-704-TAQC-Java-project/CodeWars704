package com.org.ita.utils;

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
                runGetVolumeOfCuboid();
            case 2:
                runLiters();
            case 12:
                runFindNb();
                break;
            case 23:
                runSmallest();
            default:
                System.out.println("rest will be done soon");
        }

    }

    public void runLiters() {
        System.out.println("Run task liters.\nPlease input time (double):");
        double a = br.readDouble();
        double answer = member.getEight().liters(a);
        System.out.println("Result " + answer + " hours");
    }

    public void runGetVolumeOfCuboid() {
        System.out.println("Run task getVolumeOfCuboid.\nPlease input length of cuboid (double):");
        double a = br.readDouble();

        System.out.println("Please input width of cuboid (double):");
        double b = br.readDouble();

        System.out.println("Please input height of cuboid (double):");
        double c = br.readDouble();

        double volume = member.getEight().getVolumeOfCuboid(a, b, c);
        System.out.println("Result" + volume + " hours");
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
            if (result >= 0){
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

}

