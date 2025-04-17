package java_Program;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num<=1) {
			System.out.println("Smallest prime number is 2");
		}
		for( i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("Number not Prime");
				break;
			}
		}
		if(num==i)
		{
			System.out.println("Prime");
		}
		
			
	
	}
	

	}


