package anusha;

import java.util.Scanner;

public class classarrayreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner	sc=new Scanner(System.in);
System.out.println("enter the limit");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<=a.length-1;i++)
{
	a[i]=sc.nextInt();
}

System.out.println("revers of array is");
//int a2[]=new int[n];
for(int i=a.length-1;i>=0;i--) 
{
	//a2=a;
	System.out.println(a[i]);
}
}
	}

