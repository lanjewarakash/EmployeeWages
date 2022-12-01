package com.blz.employee;

import java.util.Random;

public class PartTimeSwitch {
    public static void main(String[] args) {
        Random rd = new Random();
        int empCheck = rd.nextInt(2);
        int fullDayHour = 0;
        int partTimeHour = 1;
        int wagePerHour = 20;
        int empHrs=0;
        int dailyEmpWage=0;

        switch(empCheck){
            case 0:
                empHrs=8;
                break;
            case 1:
                empHrs=4;
                break;
            default:
              empHrs=0;
        }
        dailyEmpWage =(wagePerHour*empHrs);
        System.out.println("Emp Wages are " +dailyEmpWage);
    }
}
