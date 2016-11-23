package project.cis.test;
import java.util.Scanner;
public class CheckPassword {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = input.next();
		if(isValid(password)){
			System.out.println("Valid password");
		}else{System.out.println("Invalid password");}
		
	}
	public static boolean isValid(String password){
		int digit = 0;
		final int minLength = 8;
		final int numDigit = 2;
		if(password.length() >= minLength){
			for(int i = 0; i < password.length(); i++){
				char c = password.charAt(i);
				if(Character.isAlphabetic(c)){
					i++;
				}else if(Character.isDigit(c)){
					i++;
					digit++;
				}else{return false;}
			}if(digit >= numDigit){
				return true;
			}
		}return false;
	}
	
}
