package by.ld.unit02.main;

// Проверить введенную пользователем строку на наличие недопустимых символов. 
//В качестве первого символа допустимы только буквы и знак подчеркивания. 
//Остальные символы могут быть буквами, цифрами и знаком подчеркивания. 

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		System.out.print("Введите строку символов: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //строка символов
		String n = s.substring(0, 1); //первый символ
				
		if (n.matches("[a-zA-Z_]+")) { 
			if (s.matches("[a-zA-Z0-9_]+"))	{	
			System.out.println(s); 
						}}else {
			System.out.println("Недопустимый символ");
		
		
						}
	}
}
