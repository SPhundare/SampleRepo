package java_Program;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		int no,rev=0,rem;
		
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		while(no!=0) {
			
		rem=no%10;
		rev=rev*10+rem;
		no=no/10;
		}
		System.out.println("Reverse no is="+rev);	
		

	}

}
