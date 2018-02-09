package kr.co.daegu;

public class AddClass implements Hap {

	public void clas(NumClass nc) {
		System.out.println(nc.getNum1() + "+" + nc.getNum2() + "=" + (nc.getNum1() + nc.getNum2()));
	}
}