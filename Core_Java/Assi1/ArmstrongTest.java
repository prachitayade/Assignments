package Core_Java.Assi1;
import java.util.Scanner;

/*
  Simple Java Program to check or find if a number is Armstrong number or not.
  An Armstrong number of three digit is a number whose sum of cubes of its
  digit is equal
  to its number. For example 153 is an Armstrong number
  of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
 */
public class ArmstrongTest {

    public static void main(String args[]) {

        
        System.out.println("Please enter a 3 digit number to find if its an Armstrong number:");
        int number = new Scanner(System.in).nextInt();

        if (isArmStrong(number)) {
            System.out.println("Number : " + number
                    + " is an Armstrong number");
        } else {
            System.out.println("Number : " + number
                    + " is not an Armstrong number");
        }
    }

    private static boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while (number != 0) {
            int remainder = number % 10;
            result = result + remainder * remainder * remainder;
            number = number / 10;
        }
        
        if (orig == result) {
            return true;
        }

        return false;
    }
}
