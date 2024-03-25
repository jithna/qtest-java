package anusha;

import java.util.Scanner;

public class stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char c='a';
		String s="anusha";
		System.out.println(s);
		System.out.println(c);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s1=sc.nextLine();
		System.out.println(s1);
		int l=s.length();
		int l1=s1.length();
		System.out.println("length"+l);
		System.out.println("length s1 "+l1);
		System.out.println("length"+s.length());
		String s2=s.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.toUpperCase());
		for(int i=0;i<=s1.length()-1;i++)
		{
			char c1=s1.charAt(i);
			System.out.println(c1);
		}
		
		
		
	}

}
