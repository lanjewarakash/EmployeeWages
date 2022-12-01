package com.blz.employee;

import java.util.Random;

public class PartTime {
    public static void main(String[] args) {
        Random rd = new Random();
        int empCheck = rd.nextInt(2);
        int fullDayHour = 0;
        int partTimeHour = 1;
        int wagePerHour = 20;
        int empHrs;
        int dailyWage;

        if (empCheck == fullDayHour){
            empHrs=8;
        }
        else if (empCheck == partTimeHour) {
            empHrs = 4;
        }
        else {
            empHrs=0;
        }
        dailyWage = (wagePerHour * empHrs);
        System.out.println("The employee Wages are : " +dailyWage);

        }
    }