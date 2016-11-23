package edu.gsu.cis.ch3;
import java.util.Scanner;

public class Question19 {
	public static void main(String[]args){
		
		Scanner input= new Scanner(System.in);
		int p;
		System.out.println("Enter three edges of a triangle");
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		if(a+b>c&&b+c>a&&a+c>b){
			 p = a+b+c;
		System.out.println("The perimeter of the triangle is  "+p);}
		
		else
			System.out.println("invalid input");
		
		//Brooke was here
		
	}

}
