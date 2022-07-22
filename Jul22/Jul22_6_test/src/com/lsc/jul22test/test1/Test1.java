package com.lsc.jul22test.test1;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		String random[]= {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ"};
		int rand;
		while(true) {
			rand=ran.nextInt(5);
			System.out.println(random[rand]);
			if(random[rand].equals("ㅁ")) {
				break;
			}
			
		}
	}

}
