package by.ld.unit02.main;

import java.util.Scanner;

//Ñîñòàâèòü ïðîãðàììó äëÿ âû÷èñëåíèÿ çíà÷åíèé ôóíêöèè  F(x) íà îòðåçêå [à, b] ñ øàãîì h. 
//Ðåçóëüòàò ïðåäñòàâèòü â âèäå òàáëèöû, ïåðâûé ñòîëáåö êîòîðîé – çíà÷åíèÿ  àðãóìåíòà,
//âòîðîé - ñîîòâåòñòâóþùèå çíà÷åíèÿ ôóíêöèè: F(x)= sin(x)*sin(x);

public class Task18 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("Ââåäèòå ÷èñëî a: ");
		int a = sca.nextInt();
		
		System.out.print("Ââåäèòå ÷èñëî b: ");
		int b = sca.nextInt();
		
		System.out.print("Ââåäèòå øàã h: ");
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
// Неплохо, значимых замечаний нет. Только смотри на форматирование кода, оно иногда у тебя плавает.
