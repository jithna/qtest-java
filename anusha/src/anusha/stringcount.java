package anusha;

import java.util.Scanner;

public class stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the number");
int a=sc.nextInt();
System.out.println(a);
int reverse=0,reminder=0;
while(a!=0)
{
	reminder=a%10;
reverse=reverse*10+reminder;
a=a/10;

}
System.out.println(reverse);
}

	}
