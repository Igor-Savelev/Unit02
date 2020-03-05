package by.ld.unit02.main;

//Даны три действительных числа. Возвести в квадрат те из них, значения которых неотрицательны, и в четвертую степень — отрицательные.

public class Task09 {

	public static void main(String[] args) {
		int a,b,c;
		
		a= 2;
		b=-3;
		c= -4;
		
		if (a > 0) {
			System.out.println("Квадрат числа a = " + a*a);
		}else{
			System.out.println("Чётвертая степень числа a = " + a*a*a*a);
		}
		if (b > 0) {
			System.out.println("Квадрат числа b = " + b*b);
		}else{
			System.out.println("Чётвертая степень числа b = " + b*b*b*b);
		}
		if (c > 0) {
			System.out.println("Квадрат числа c = " + c*c);
		}else{
			System.out.println("Чётвертая степень числа c = " + c*c*c*c);
		}
	}

}
