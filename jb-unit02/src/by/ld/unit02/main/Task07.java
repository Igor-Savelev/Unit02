package by.ld.unit02.main;

//Составить программу, которая определит площадь какого круга меньше.

public class Task07 {

	public static void main(String[] args) {
		double R1,R2;
		double S1,S2;
		
		R1=9;
		R2=11;
		
		S1= Math.PI * R1 * R1;
		S2= Math.PI * R2 * R2;
		
		if (S1 > S2) {
			System.out.println("Площадь круга S2 меньше чем S1");
		}else {
			System.out.println("Площадь круга S1 меньше чем S2");
		}
	}
}
