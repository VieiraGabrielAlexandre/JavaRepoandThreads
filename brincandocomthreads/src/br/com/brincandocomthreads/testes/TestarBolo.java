package br.com.brincandocomthreads.testes;

import br.com.brincandocomthreads.controller.PrepararBoloBase;
import br.com.brincandocomthreads.controller.PrepararBoloChocolate;
import br.com.brincandocomthreads.interfaces.IPrepararBolo;

public class TestarBolo {
	public static void main(String[] args) {
		
		//PrepararBoloBase bolo1 = new PrepararBoloBase();
		IPrepararBolo bolo1 = new PrepararBoloBase();
				
		//PrepararBoloChocolate bolo2 = new PrepararBoloChocolate();
		IPrepararBolo bolo2 = new PrepararBoloChocolate();
		
		bolo2.misturarOsIngredientes();

		
	}
}
