package by.ld.unit02.main;

// ������� �� ����� ������������ ����� ��������� � �� ���������� �������������
//� ������ ���������� (������� ASCII). 

public class Task19 {

	public static void main(String[] args) {
		int code, ch;
		
		for (int i=0; i<256; i++) {
		code=i;
		ch= (char)code;
		System.out.println((char)code + " | " + ch); 
		}
		}

}
