package com.lsc.jul25ej.main;

import com.lsc.jul25ej.cal.Calculator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String a= new String("오늘날시참좋네");
			
			//5번째 글자
			System.out.println(a.charAt(4));
			
			//"오늘"로 시작하는지?
			System.out.println(a.equals("오늘%"));
			//2~5번째 글자
			System.out.println(a.substring(1, 5));
			//총 몇 글자 인지
			System.out.println(a.length());
			//오늘-> 내일 
			System.out.println(a.replace("오늘", "내일"));
			
	}

}
