package anusha;

import java.util.Scanner;

public class classarraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc1=new Scanner(System.in);
System.out.println("enter the limit");
int n=sc1.nextInt();
int a[]=new int[n];
for(int i=0;i<=a.length-1;i++)
{
	a[i]=sc1.nextInt();
	}
int b[]=new int[n];
for(int i=0;i<=a.length-1;i++)
{
	b[i]=a[i];
	}
for(int i=0;i<=a.length-1;i++)
{
System.out.println(b[i]);
        }
}
	}


