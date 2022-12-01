package com.blz.employee;

import java.util.Random;

public class EmpWageMonth {
    public static void main(String[] args) {
        Random rd = new Random();
        int empCheck = rd.nextInt(2);
        int fullDayHour = 0;
        int partTimeHour = 1;
        int wagePerHour = 20;
        int workingDays = 20;
        int empHrs;
        int empWage;
        int totalEmpWage =0;

        for(int Day = 0; Day<workingDays; Day++){

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
            empWage=(empHrs*wagePerHour);
            totalEmpWage +=empWage;
            System.out.println("empWage = " +empWage);

        }
        System.out.println("TotalEmpWage = " +totalEmpWage);
    }
}
