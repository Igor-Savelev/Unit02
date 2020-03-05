package by.ld.unit02.main;

//Найдите все четырехзначные числа, сумма цифр каждого из которых равна 15. 

public class Task14 {

	public static void main(String[] args) {
		int n,sum = 0;
		
		n=9999;
		
		for (int i=1000; i<=n; i++) {
			sum= i%10 + (i/10)%10 + (i/100)%10 + (i/1000)%10;	
			if (sum == 15)
				System.out.println(i);
		}
		}
	}


