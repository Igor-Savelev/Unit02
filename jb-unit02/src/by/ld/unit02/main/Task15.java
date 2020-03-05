package by.ld.unit02.main;

//Найдите количество четных цифр данного натурального числа. 

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Введите число: ");
		int a = sca.nextInt();
		int k=0;
		int chetn=0;
		String len = "";
		
		len = Integer.toString(a);
		
		for (int i=0; i<len.length(); i++) {
			chetn= (a%10);
			if (chetn%2==0) {
				k=k+1;
			}
			a=a/10;
		}
		System.out.println("Количество чётных цифр = " + k);
		}
	}
