package com.blz.employee;

import java.util.Random;

public class EmployeeAttendance {
    public static void main(String[] args) {
        Random rd = new Random();
        int num = rd.nextInt(2);
        if ( num == 0){
            System.out.println("Employee Is Present ");
        }
        else {
            System.out.println("Employee Is Absent");
        }
    }
}
