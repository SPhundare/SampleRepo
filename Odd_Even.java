package java_Program;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		int num;
		Scanner sc =new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("Enter Number to check odd or Even:="+num);
	
			if(num%2==0) {
				System.out.println("Number is Even");
			}
		
		else 
			System.out.println("Number is Odd");
		

	}
		

}
