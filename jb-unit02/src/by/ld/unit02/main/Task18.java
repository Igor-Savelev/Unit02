package by.ld.unit02.main;

import java.util.Scanner;

//��������� ��������� ��� ���������� �������� �������  F(x) �� ������� [�, b] � ����� h. 
//��������� ����������� � ���� �������, ������ ������� ������� � ��������  ���������,
//������ - ��������������� �������� �������: F(x)= sin(x)*sin(x);

public class Task18 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("������� ����� a: ");
		int a = sca.nextInt();
		
		System.out.print("������� ����� b: ");
		int b = sca.nextInt();
		
		System.out.print("������� ��� h: ");
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
