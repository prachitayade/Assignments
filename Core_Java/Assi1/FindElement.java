package Core_Java.Assi1;

import java.util.Scanner;

public class FindElement {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to be searched");
	int n=sc.nextInt();
	int [] a= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
	for(int i=0;i<a.length;i++) {
		if(n==a[i]) {
			System.out.println("Yes Found");
		}
		}
}
}