package com.blz.employee;

import java.util.Random;

public class DailyEmployeeWage {
    public static void main(String[] args) {
        Random rd = new Random();
        int num =rd.nextInt(2);
        int wagePerHour = 20;
        int isFullTime = 1;
        int empHrs ;
        int empWages ;

        if (num ==isFullTime){
            empHrs=8;
        }
        else {
            empHrs=0;
        }
        empWages = (wagePerHour * empHrs);
        System.out.println("The employee Wages are : " +empWages);
    }
}
