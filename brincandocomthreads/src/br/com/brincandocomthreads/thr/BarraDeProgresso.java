
package br.com.brincandocomthreads.thr;

public class BarraDeProgresso extends Thread{

	public void run() {
		for (int i = 0; i< 100; i++) {
			System.out.println("Progresso: "+i);
			try {
				Thread.sleep(30001);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}


}
