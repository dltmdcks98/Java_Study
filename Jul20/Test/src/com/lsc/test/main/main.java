package com.lsc.test.main;

import java.util.Random;
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r= new Random();
		Scanner input = new Scanner(System.in);
		int num = r.nextInt(100)+1;
		
		int cnt =1;
		
		while(true) {
			int i = Integer.parseInt(input.nextLine());
			if(i>num) {
				cnt++;
				System.out.println("좀 더 작은 값을 입력하세요");
			}else if (i < num) {
				cnt++;
				System.out.println("좀 더 큰 값을 입력하세요 ");
			}else {
				System.out.println("총"+cnt+"번에 맞췄습니다.");
				System.out.println(num);
				break;
			}	
		}
		
	}
}

