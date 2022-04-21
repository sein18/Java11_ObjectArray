package com.test01.run;

import java.util.Scanner;

import com.test01.model.dto.Book;

public class ObjectArrayTest {

	public static void main(String[] args) {
		
		/*Book bk[] = new Book[3];
		bk[0] = new Book("이것이 자바다", "신용권", "한빛미디어", 30000);
		bk[1] = new Book("HTML5웹프로그래밍 입문", "윤인성", "한빛아카데미", 26000);
		bk[2] = new Book("자바 으ㅔㅂ을 다루는 기술", "이병승", "길벗", 35000);
		 */
		 Book bk[] = {
			 new Book("이것이 자바다", "신용권", "한빛미디어", 30000),
			 new Book("HTML5웹프로그래밍 입문", "윤인성", "한빛아카데미", 26000),
			 new Book("자바 으ㅔㅂ을 다루는 기술", "이병승", "길벗", 35000)
		 }; 
		 /*
		 System.out.println(bk);  				//Book[]
		 System.out.println(bk[0]);				//Book객체 주소값
		 System.out.println(bk[0].getPrice());	//int
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 책 제목: ");
		String searchTitle = sc.nextLine();

		for (int i = 0; i < bk.length; i++) {
			if (bk[i].getTitle().equals(searchTitle)) {
				System.out.println(bk[i].information());
			}
		}

	}

}
