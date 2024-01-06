package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q028 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* 근무 년수를 입력받아 아래와 같이 출력하시오.
		  - 1 ~ 4년차: 초급 개발자
		  - 5 ~ 9년차: 중급 개발자
		  - 10년차 이상: 고급 개발자
		  - 유효성 검사를 하시오.(1 미만 입력 예외 처리)
		  
		 */
		

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("근무 년수: ");
		int year = Integer.parseInt(reader.readLine());
		
		
		if (year >= 1 && year <= 4) {
			System.out.printf("%d년차 초급 개발자입니다.\n", year);
			
			int next = 5 - year;
			System.out.printf("앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.", next);

		} else if (year >= 5 && year <= 9) {
			System.out.printf("%d년차 중급 개발자입니다.\n", year);
			
			int junior = 4;
			int past = year - junior;
			System.out.printf("당신은 %d년 전까지 초급 개발자였습니다.\n", past);
			
			int next = 10 - year;
			System.out.printf("앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.", next);
		
		} else if (year >= 10) {
			System.out.printf("%d년차 고급 개발자입니다.\n", year);
			
			int mid = 9;
			int past = year - mid;
			System.out.printf("당신은 %d년 전까지 중급 개발자였습니다.", past);
			
		} else {
			System.out.println("입력한 값이 올바르지 않습니다. 1 이상의 값을 입력하시오.");
		
		}
		
	}

}
