package kr.co.daegu;

import java.util.Scanner;

public class OperClass {
	
	//AddClass ac;
	SubClass ac;
	NumClass nc;
	
	
	public OperClass(){
		System.out.println("���� ���α׷�");
		ac = new SubClass();
		nc = new NumClass();
	}
	
	public void inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° �Է�");
		nc.setNum1(sc.nextInt());
		System.out.println("�ι�° �Է�");
		nc.setNum2(sc.nextInt());
		
		
	}
	
	public void printResult() {
		ac.clas(nc);
		
	}

}
