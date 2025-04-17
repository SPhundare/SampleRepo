package java_Program;

import java.util.Scanner;

public class Exchange_without_third_Veriable {

	public static void main(String[] args) {
		int a, b;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter first number ="+a);//30
		b=sc.nextInt();
		System.out.println("Enter second number ="+b);//40
		
		a=a+b;//30+40=70
		b=a-b;//70-40=30
		a=a-b;//70-30=40
		System.out.println("Exchange number without third veriable="+a);
		System.out.println("Exchange number without third veriable="+b);

	}

}
