package by.ld.unit02.main;

//Найдите наибольшую цифру данного натурального числа.

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
	int n=158746;
	int max = 0;
	 while (n > 0) {
		            if (n % 10 > max) { max =n % 10;
		            n/=10;}
		            else {n/=10;  }
	 
		        	 }System.out.println("Максимальная цифра: " + max);
	}
}



