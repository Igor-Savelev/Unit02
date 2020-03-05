package by.ld.unit02.main;

//Составить программу, которая определит площадь какого треугольника больше. 

public class Task08 {

	public static void main(String[] args) {
		double a,b,c; //стороны первого треугольника
		double d,f,g; //стороны второго треугольника
		double per1,per2 =0; //полупериметры треугольников
		double s1, s2 =0; //площади треугольников
		
		a=3;
		b=4;
		c=2;
		
		d=8;
		f=9;
		g=5;
		
		per1= (a + b + c)/2;
		per2= (d + f + g)/2;
		
		s1= Math.sqrt(per1 * (per1 - a) * (per1 - b) * (per1 - c));
		s2= Math.sqrt(per2 * (per2 - d) * (per2 - f) * (per2 - g));
		
		System.out.println("Площадь S1 = " + s1);
		System.out.println("Площадь S2 = " + s2);
		
		if (s1 > s2) {
			System.out.println("Площадь треугольника S1 больше площади треугольника S2");
		}else {
			System.out.println("Площадь треугольника S2 больше площади треугольника S1");
		}
	}
}
