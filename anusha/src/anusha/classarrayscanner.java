package anusha;

import java.util.Scanner;

public class classarrayscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the limit");
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<=a.length-1;i++)
{
	a[i]=sc.nextInt();
}
for(int i=0;i<=a.length-1;i++)
{
	System.out.println(a[i]);
}
}

	}


