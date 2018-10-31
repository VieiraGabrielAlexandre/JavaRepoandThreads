package br.com.brincandocomthreads.thr;

public class GerarPDF extends Thread {

	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Gerando PDF: " + i);
		}
		try {
			Thread.sleep(30001);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
