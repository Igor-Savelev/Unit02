package by.ld.unit02.main;

// ��������� ��������� ������������� ������ �� ������� ������������ ��������. 
//� �������� ������� ������� ��������� ������ ����� � ���� �������������. 
//��������� ������� ����� ���� �������, ������� � ������ �������������. 

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		System.out.print("������� ������ ��������: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //������ ��������
		String n = s.substring(0, 1); //������ ������
				
		if (n.matches("[a-zA-Z_]+")) { 
			if (s.matches("[a-zA-Z0-9_]+"))	{	
			System.out.println(s); 
						}}else {
			System.out.println("������������ ������");
		
		
						}
	}
}
