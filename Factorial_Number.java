package java_Program;

import java.util.Scanner;

public class Factorial_Number {

	public static void main(String[] args) {
		int no,fact=1;
		Scanner sc=new Scanner(System.in);
		no=sc.nextInt();
		
		for(int i=1;i<=no;i++) {
				fact=fact*i;
			}
		
			System.out.println("Factorial of number="+fact);
		}
		

	}

		
	


