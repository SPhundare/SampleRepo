package java_Program;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int no,rem,temp,rev=0;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		temp=no;
		while(no!=0) {
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;

	}
		if(temp==rev) {
			System.out.println("Number is Palindrom");
		}
		else
			System.out.println("Number is not Palindrom");
}
}