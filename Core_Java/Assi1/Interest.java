package Core_Java.Assi1;

import java.util.*;

public class Interest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        double p, r, t, s_interest, c_interest;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the value of Principal= ");
            p = scanner.nextDouble();
            System.out.println("Enter the Annual Rate of Interest= ");
            r = scanner.nextDouble();
            System.out.println("Enter the Time (years)= ");
            t = scanner.nextDouble();
        }
        s_interest = (p * r * t) / 100;
        c_interest = p * Math.pow(1.0 + r / 100.0, t) - p;
        System.out.println("Simple Interest: " + s_interest);
        System.out.println("Compound Interest: " + c_interest);

    }

}