package com.hcl.multi.taskfinal;

public class DH implements Runnable {

	Object obj;

	public DH(Object obj) {
		super();
		this.obj = obj;
	}

	public void run() {
		synchronized (obj) {

			while (GlobalVar.COUNT < GlobalVar.MAX) {

				while (!GlobalVar.ho) {

					try {
						obj.wait();

					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print("HH");
				GlobalVar.COUNT++;
				GlobalVar.ho = false;
				obj.notify();

			}
		}
	}
}