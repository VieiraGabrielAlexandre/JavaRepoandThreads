package br.com.brincandocomthreads.thr;

public class GerarPDF implements Runnable{
	
	public void run () {
		for (int i=0; i<=100; i++) {
			System.out.println("Gerando PDF:"+i);
			Contador.contador=+2;
		}

	}
}
