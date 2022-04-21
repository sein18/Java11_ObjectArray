package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectTest {
	public static void main(String[] args) {

		
		// 객체 생성
		Book bk1 = new Book("이것이 자바다", "신용권", "한빛미디어", 30000);
		Book bk2 = new Book("HTML5웹프로그래밍 입문", "윤인성", "한빛아카데미", 26000);
		Book bk3 = new Book("자바 으ㅔㅂ을 다루는 기술", "이병승", "길벗", 35000);

		// 출력
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());

		// 도서 검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String searchTitle = sc.nextLine();

		if (bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1.information());
		} else if (bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2.information());
		} else if (bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3.information());
		} else {
			System.out.println("책이 존재하지 않습니다");
		}

	}

}
