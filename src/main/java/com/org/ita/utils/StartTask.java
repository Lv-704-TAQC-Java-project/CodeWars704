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
                runLiters();
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

        System.out.println("Run task getVolumeOfCuboid.\nPlease input width of cuboid (double):");
        double b = br.readDouble();

        System.out.println("Run task getVolumeOfCuboid.\nPlease input height of cuboid (double):");
        double c = br.readDouble();

        double volume = member.getEight().getVolumeOfCuboid(a, b, c);
        System.out.println("Result" + volume + " hours");
    }

    public void runSmallest() {
        System.out.println("Run task getVolumeOfCuboid.\nPlease enter positive number (long):");
        long n = br.readLong();

        long[] resultArr = member.getFive().smallest(n);
        System.out.println("You have entered " + n);
        System.out.println("The smallest number you got by one swap is: " + resultArr[0]);
        System.out.println("You can get this number by taking digit from index " + resultArr[1] + " and inserting it at index " + resultArr[2]);
    }
}

