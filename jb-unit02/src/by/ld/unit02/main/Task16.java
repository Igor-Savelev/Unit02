package by.ld.unit02.main;

//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10). 

public class Task16 {

	public static void main(String[] args) {
		long r,c=0;
		c=1;
		r=1;
		for (int i=1; i<10; i++) {
			c=c+(i+1);
			r=c*r;
			
	}
		System.out.println("r = " + r);
}

	}
