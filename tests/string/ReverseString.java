package string;

import java.util.Scanner;
import java.lang.String;

public class ReverseString {
	public void method1_ReverseIteration(String inputString) {
		char[] ch = inputString.toCharArray();
		String revstr = "";
		for (int i = ch.length - 1; i >= 0; i--) {
			revstr = revstr+ch[i];
		}
		System.out.println(revstr);
	}
	public void method2() {
		Scanner read = new Scanner(System.in);
        String str = read.nextLine();
		
	        String reverse = "";
	        
	        
	        for(int i = str.length() - 1; i >= 0; i--)
	        {
	            reverse = reverse + str.charAt(i);
	        }
	        
	        System.out.println("Reversed string is:");
	        System.out.println(reverse);
	}
	public void method3_Stringbuilder(String inputString) {
		StringBuilder sb= new StringBuilder(inputString);
		   sb.reverse();  
		   String reverse =	 sb.toString();
		 System.out.println(reverse);
	}
	public void method4_Stringbuilder(String inputString) {
		StringBuilder sb= new StringBuilder();
		   sb.append(inputString);  
		   sb=	 sb.reverse(); 
		 System.out.println(sb);
		
	}
	public void method5_Stringbuilder(String inputString) {
	
		 System.out.println((new StringBuilder(inputString)).reverse().toString());
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		ReverseString obj = new ReverseString();
/*		obj.method1_ReverseIteration(inputString);		 
		obj.method2();
		obj.method3_Stringbuilder(inputString);*/
		obj.method5_Stringbuilder(inputString);
	}
}
