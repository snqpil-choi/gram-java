package com.uni.first; // 유사한 클래스를 묶어주는 패키지를 선언

public class HelloWorld {
	
	// 주석 : 소스코드와 무관, 코드로 인식이 안됨 (단축키 : Ctrl + /)
	/*  전체주석 : 글을 적고 범위를 지정해서 Ctrl + shift + / */

	//public : 메인메소드는 외부에서 호출할 수 있다.
	//static : 객체를 생성하지 않고도 실행 시킬 수 있다.
	//void : 반환값이 없다. (실행만 하고 끝)
	//String[] args : 파라미터, 실행 명령어 외에 인자를 받을 수 있는데 스트링 배열로 들어간다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub 메인메소드 하나는 있어야함
		System.out.println("Hi~~~");
		
		System.out.println(args[0]); // hi
		System.out.println(args[1]); // 1 (string으로 가져온다)
		
		System.out.print("안녕하세요 \n"); // \n : 줄바꿈
		System.out.print("반갑습니다");
	}

}
