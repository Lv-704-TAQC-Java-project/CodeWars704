package com.org.ita.utils;

import com.org.ita.kata.Eight;
import com.org.ita.kata.Seven;

import java.io.IOException;

public class RunTask {

    private static Eight eight;
    private static Seven seven;
    private Group member;

    public void setMember(Group member) {
        this.member = member;
        switch (member) {
            case MEMBER_4:
                eight = new com.org.ita.kata.implementation.MyroslavaVynokur.EigthImpl();
                seven = new com.org.ita.kata.implementation.MyroslavaVynokur.SevenImpl();
                break;
            default:
                System.out.println("Rest will be imlemented soon");
        }
    }

    public static void runLiters() throws IOException {
        System.out.println("Run task liters.\nPlease input time:");
        double a = Double.parseDouble(Buffer.br.readLine());
        double answer = eight.liters(a);
        System.out.println(answer);
    }

    public void runTask(int taskId) {
        switch (taskId) {
            case 1:
                try {
                    RunTask.runLiters();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            default:
                System.out.println("rest will be done soon");
        }


    }
}
