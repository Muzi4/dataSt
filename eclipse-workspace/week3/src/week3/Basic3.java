package week3;

import java.util.Scanner;

public class Basic3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		String name;
		System.out.printf("이름 입력 : ");
		name = scn.next();
		if(name.equals("홍길동")) 
			System.out.printf("이름은 %s 입니다.", name);
		else
			System.out.printf("%s이 아니다.", name);
		
		scn.close();

	}

}