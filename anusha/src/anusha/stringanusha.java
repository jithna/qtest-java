package anusha;

import java.util.Scanner;

public class stringanusha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.nextLine();
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			System.out.println(c);
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			char c=s.charAt(i);
			System.out.println(c);
		}
		}
	}


