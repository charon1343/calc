package kr.co.daegu;

import java.util.Scanner;

public class OperClass {
	
	//AddClass ac;
	SubClass ac;
	NumClass nc;
	
	
	public OperClass(){
		System.out.println("빼기 프로그램");
		ac = new SubClass();
		nc = new NumClass();
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 입력");
		nc.setNum1(sc.nextInt());
		System.out.println("두번째 입력");
		nc.setNum2(sc.nextInt());
		
		
	}
	
	public void printResult() {
		ac.clas(nc);
		
	}

}
