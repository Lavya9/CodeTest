package com.hcl.multi.taskfinal;

public class DHO {

	static int count = 1;
	static int max = 4;

	public static void main(String[] args) throws InterruptedException {

		Object obj = new Object();
		DH dh = new DH(obj);
		DO doo = new DO(obj);

		Thread t1 = new Thread(dh, "dh");
		Thread t2 = new Thread(doo, "do");

		t1.start();
		t2.start();

		t1.join();
		t2.join();
	}
}
