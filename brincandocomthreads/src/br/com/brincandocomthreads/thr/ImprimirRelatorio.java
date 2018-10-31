package br.com.brincandocomthreads.thr;

public class ImprimirRelatorio {
	public static void main(String[] args) throws Exception{
		
		BarraDeProgresso barra = new BarraDeProgresso();
		
		GerarPDF pdf = new GerarPDF();
		
		pdf.start();
		pdf.start();
		
		Runnable r = ()->{
			for (int i = 0; i <200;i++) {
				System.out.println("Classe anonima Thread");
				try {
					Thread.sleep(10001);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					((Throwable) e).printStackTrace();
				}
			}
		};
		Thread t3 = new Thread(r);
		t3.start();
		
		new Thread (()->{
			System.out.println("Teste");
		}).start();
		System.out.println("Numero do contador: "+Contador.contador);

	}
}
