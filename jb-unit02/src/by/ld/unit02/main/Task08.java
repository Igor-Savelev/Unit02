package by.ld.unit02.main;

//��������� ���������, ������� ��������� ������� ������ ������������ ������. 

public class Task08 {

	public static void main(String[] args) {
		double a,b,c; //������� ������� ������������
		double d,f,g; //������� ������� ������������
		double per1,per2 =0; //������������� �������������
		double s1, s2 =0; //������� �������������
		
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
		
		System.out.println("������� S1 = " + s1);
		System.out.println("������� S2 = " + s2);
		
		if (s1 > s2) {
			System.out.println("������� ������������ S1 ������ ������� ������������ S2");
		}else {
			System.out.println("������� ������������ S2 ������ ������� ������������ S1");
		}
	}
}
