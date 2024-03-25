package anusha;

import java.util.Scanner;

public class stringvowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int vowel=0;
for(int i=0;i<=s.length()-1;i++)
{
	char c=s.charAt(i);
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	{
		vowel++;
	}
}
System.out.println(vowel);
	}

	}


