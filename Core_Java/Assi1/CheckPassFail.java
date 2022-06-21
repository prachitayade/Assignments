package Core_Java.Assi1;

import java.util.*;

public class CheckPassFail {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter english marks =");
        int eng = sc.nextInt();
        System.out.println("Enter math marks =");
        int math = sc.nextInt();
        System.out.println("Enter science marks =");
        int sci = sc.nextInt();
        if (eng >= 60 && math >= 60 && sci >= 60) {
            System.out.println("Passed");
        } else if ((eng > 60 && math > 60) || (eng > 60 && sci > 60) || (math > 60 && sci > 60)) {
            System.out.println("Promoted");
        } else if ((eng > 60 && math < 60 && sci < 60) || (eng < 60 && math > 60 && sci < 60)
                || (eng < 60 && math < 60 && sci > 60) || (eng < 60 && math < 60 && sci < 60)) {
            System.out.println("fail");
        }
    }
}