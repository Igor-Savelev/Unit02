package by.ld.unit02.main;

//���� ��� �����. ���������� �����, �������� � ������ ��� ������� ��� � ������� �����. 

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.print("������� ������ �����: ");
		int a = sca.nextInt();
		
		System.out.print("������� ������ �����: ");
		int b = sca.nextInt();
				
		String len = "";
		String len2 = "";
		len = Integer.toString(a);
		len2 = Integer.toString(b);
		
		for(int i=0; i<len.length(); i++) {
		for(int j=0; j<len2.length(); j++) {
            if(len.charAt(i) == len2.charAt(j))
            	System.out.println(len.charAt(i));
            }
		
	}
}
	}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
