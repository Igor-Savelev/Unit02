package by.ld.unit02.main;

import java.util.Scanner;

//���� �������������� (�) � ����������� (n). ���������: a(a+1)...(a+n-1). 

public class Task17 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("������� �������������� ����� a: ");
		int a = sca.nextInt();
		
		System.out.print("������� ����������� ����� n: ");
		int n = sca.nextInt();

		int rez=0;
		int total=1;
		
		for (int i=0; i<n; i++) {
			rez= a+i;
			total= total*rez;
		}
		System.out.println("��������� ��������� = " + total);
	}

}
