package Core_Java.Assi1;

import java.util.Scanner;

public class IncomeTax {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal = sc.nextInt();
        int tax = 0;
        if (sal > 0 && sal <= 180000) {
            tax = 0;
            System.out.println("no tax");
        } else if (sal > 180000 && sal <= 300000) {
            tax = sal * 10 / 100;
            System.out.println("Tax is = " + tax);
        } else if (sal > 300001 && sal <= 500000) {
            tax = sal * 20 / 100;
            System.out.println("Tax is = " + tax);
        } else if (sal > 500000 && sal <= 1000000) {
            tax = sal * 30 / 100;
            System.out.println("Tax is = " + tax);
        }

    }

}