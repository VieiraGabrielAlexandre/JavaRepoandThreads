package br.com.brincandocomthreads.thr;

public class BarraDeProgresso implements Runnable{
	
	public void run () {
		int i = 0;
		while (i<=40000) {
			System.err.println("Gera��o em progresso: "+i);
			i++;
			Contador.contador--;
		}
	}

}
