package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
//		int age=26;
//		int b=24;
//		System.out.println(age+b+"나이");
		int year=0;
		int age=14;
		System.out.println(year);
		System.out.println(age);
		year=age+2000;
		age=age+1;
		
		System.out.println(year);
		System.out.println(age);
		
		int x=10;
		int y=20;
		int c;
		
		c=x;
		x=y;
		y=c;
		
		System.out.println("x :"+ x);
		System.out.println("y :"+ y);
	
		Scanner scanner=new Scanner(System.in);
		
		
		
		System.out.println("두자리 정수를 하나 입력해주세요");
		String input=scanner.nextLine();
		int num=Integer.parseInt(input);
		
		System.out.println("입력내용"+input);
		System.out.println("num"+num);
		
		
		int a=1000000;
		int b=2000000;
		
		long d=a*b;
		
		System.out.println(d);
		
	}

}
