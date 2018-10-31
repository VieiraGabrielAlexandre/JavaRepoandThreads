package br.com.brincandocomthreads.interfaces;

import br.com.brincandocomthreads.vo.BoloBaseVO;

public interface IPrepararBolo {

	public void misturarOsIngredientes();
	
	public boolean verificarPontoDoBolo(BoloBaseVO bolo);
	
}
