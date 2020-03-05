package by.ld.unit02.main;

//Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х. 

public class Task04 {
	public static void main(String[] agrs) {
		int a,b,c,x;
		int rez=0;
		
		a=3;
		b=-9;
		c=-60;
		x=4;
		
		rez=a * x * x + b * x + c;
		
		if (rez < 0) {
			System.out.println("Модуль1 = " + rez*(-1));
			}else {if (rez > 0) {
				System.out.println("Модуль2 = " + rez);
			}
			}
	}

}
