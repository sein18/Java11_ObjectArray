package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectTest {
	public static void main(String[] args) {

		
		// ��ü ����
		Book bk1 = new Book("�̰��� �ڹٴ�", "�ſ��", "�Ѻ��̵��", 30000);
		Book bk2 = new Book("HTML5�����α׷��� �Թ�", "���μ�", "�Ѻ���ī����", 26000);
		Book bk3 = new Book("�ڹ� ���Ĥ��� �ٷ�� ���", "�̺���", "���", 35000);

		// ���
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// ���� �˻�
		Scanner sc = new Scanner(System.in);
		System.out.print("�˻��� å ����: ");
		String searchTitle = sc.nextLine();

		if (bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.information());
		} else if (bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.information());
		} else if (bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.information());
		} else {
			System.out.println("å�� �������� �ʽ��ϴ�");
		}

	}

}
