package Core_Java.Assi1;

import java.util.Scanner;

public class TotalAndAverage {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		int a=0,b=0,c=0;
		for(int i=0;i<3;i++)
		{
		
			System.out.print("Enter Student name :");
			@SuppressWarnings("unused")
			String name=scn.nextLine();
			System.out.println("Enter your 3 subject marks");
			System.out.print("Java :");
			int amark=scn.nextInt();
			a+=amark;
			System.out.print("MongoDB : ");
			int bmark=scn.nextInt();
			b+=bmark;
			System.out.print("HTML : ");
			int cmark=scn.nextInt();
			c+=cmark;
			int total=amark+bmark+cmark;
			double avg=total/3;
			System.out.println("Total Mark "+total);
			System.out.println("Average: "+avg);
			scn.nextLine();
		}
		System.out.println();
		System.out.println("Average of Java "+ a/3);
		System.out.println("Average of MongoDB "+ b/3);
		System.out.println("Average of HTML "+ c/3);
	}
}