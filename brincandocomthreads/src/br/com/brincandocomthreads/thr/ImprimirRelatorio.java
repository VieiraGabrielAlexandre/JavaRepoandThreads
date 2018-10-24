package br.com.brincandocomthreads.thr;

public class ImprimirRelatorio {

	public static void main (String[] args) {
		
		BarraDeProgresso barra = new BarraDeProgresso();
		
		GerarPDF pdf = new GerarPDF();
		
		Thread t1 = new Thread(barra);
		Thread t2 = new Thread(pdf);
		
		t1.start();
		t2.start();
		
		System.out.println("Numero do Contador: "+Contador.contador);
	}
}
