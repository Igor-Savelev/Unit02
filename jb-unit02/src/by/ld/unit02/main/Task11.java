package by.ld.unit02.main;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа. 

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Введите первое число: ");
		int a = sca.nextInt();
		
		System.out.print("Введите второе число: ");
		int b = sca.nextInt();
				
		String len = "";
		String len2 = "";
		len = Integer.toString(a);
		len2 = Integer.toString(b);
		
		for(int i=0; i<len.length(); i++) {
		for(int j=0; j<len2.length(); j++) {
            if(len.charAt(i) == len2.charAt(j))
            	System.out.println(len.charAt(i));
            }
		
	}
}
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
