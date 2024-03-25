package anusha;

import java.util.Scanner;

public class stringwithoutspace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 int count=0;
 for( int i=0;i<=s.length()-1;i++)
 {
	 char c=s.charAt(i);
	 if(c!= ' ')
	 {
	count++;
	 }
 }
 System.out.println(count);
	
	 }
	 
	 
 

	}

