package com.blz.employee;

import java.util.Random;

public class CalculateWagesTillCondition {

    public static void main(String[] args) {
        Random rd = new Random();
        int FullDayHour = 0;
        int PartTimeHour = 1;
        int WagePerHour = 20;
        int totalWorkingHours = 100;
        int totalWorkingDays = 20;
        int EmpHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int workingDays = 0;

        while (totalEmpHrs <= totalWorkingHours && workingDays < totalWorkingDays) {
            workingDays++;
            int empCheck = rd.nextInt(2);

            switch (empCheck) {
                case 0:
                    EmpHrs = 8;
                    break;
                case 1:
                    EmpHrs = 4;
                    break;
                default:
                    EmpHrs = 0;
            }
            empWage = (EmpHrs * WagePerHour);
            totalEmpWage += empWage;
            System.out.println("empWage = " + empWage);

        }
        System.out.println("totalEmpWage = " + totalEmpWage);
    }
}

