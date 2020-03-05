package by.ld.unit02.main;

// Найти max{min(a, b), min(c, d)}. 

public class Task10 {

	public static void main(String[] args) {
		int a,b,c,d;
		int min1=0;
		int min2=0;
		
		a=4;
		b=9;
		c=11;
		d=2;
		
		if (a < b) {
			min1=a;
		}else {
			min1=b;
		}
		
		if (c < d) {
			min2=c;
		}else {
			min2=d;
		}
		
		if (min1 > min2) {
			
			System.out.println("Максимальное значение из минимумов (a, b) и (c, d) = " + min1);
		} else {
		System.out.println("Максимальное значение из минимумов (a, b) и (c, d) = " + min2);
		          }
		}
		
}
