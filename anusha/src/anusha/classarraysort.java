package anusha;

import java.util.Scanner;

public class classarraysort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter the array limit");
int a=sc.nextInt();
System.out.println("enter the array");
int [] a1=new int[a];
for(int i=0;i<=a1.length-1;i++)
{
	a1[i]=sc.nextInt();}
for(int i=0;i<=a1.length-1;i++)
{
	for(int j=i+1;j<=a1.length-1;j++)
	{
		if(a1[i]>a1[j])
		{
			temp=a1[i];
			a1[i]=a1[j];
			a1[j]=temp;
		}
	}
}
System.out.println("the ascending of array is");
for(int i=0;i<=a1.length-1;i++)
{
	System.out.println(a1[i]);
}
System.out.println("the smallest element is"+a1[0]);
System.out.println("the largest element is"+a1[a1.length-1]);
			
		}
	
			
	

	}


