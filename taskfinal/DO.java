package com.hcl.multi.taskfinal;

public class DO implements Runnable {

	Object obj;

	public DO(Object obj) {
		super();
		this.obj = obj;
	}

	public void run() {

		synchronized (obj) {

			while (GlobalVar.COUNT < GlobalVar.MAX) {

				while (GlobalVar.ho) {

					try {
						obj.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.print("O");
				GlobalVar.COUNT++;
				GlobalVar.ho = true;
				obj.notify();

			}
		}
	}
}
