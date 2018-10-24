package br.com.brincandocomthreads.thr;

public class BarraDeProgresso implements Runnable{
	
	public void run () {
		int i = 0;
		while (i<=100) {
			System.err.println("Geração em progresso: "+i);
			i++;
			Contador.contador--;
		}
		System.out.println("Numero do Contador B: "+Contador.contador);

	}

}
