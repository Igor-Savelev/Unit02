package by.ld.unit02.main;

import java.util.Scanner;

//—оставить программу дл€ вычислени€ значений функции  F(x) на отрезке [а, b] с шагом h. 
//–езультат представить в виде таблицы, первый столбец которой Ц значени€  аргумента,
//второй - соответствующие значени€ функции: F(x)= sin(x)*sin(x);

public class Task18 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("¬ведите число a: ");
		int a = sca.nextInt();
		
		System.out.print("¬ведите число b: ");
		int b = sca.nextInt();
		
		System.out.print("¬ведите шаг h: ");
		int h = sca.nextInt();
		
		double fx=0;
				
		System.out.println("| x |" + " F(X)              |");
		
		for (int i=a; i<=b; i=i+h) {
			fx= Math.sin(i) * Math.sin(i);
			System.out.print("| " + i + "|");
			System.out.println(fx + "|");
		}

	}

}
