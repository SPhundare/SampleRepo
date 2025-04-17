package java_Program;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String rev=" ",name;
		Scanner sc=new Scanner(System.in);
		name=sc.nextLine();
		System.out.println("Enter a string to reverse=" +name);
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		
		System.out.println("Reverse String is="+rev);
	}

}
