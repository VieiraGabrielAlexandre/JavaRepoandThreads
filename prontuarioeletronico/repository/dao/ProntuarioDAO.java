package br.com.prontuarioeletronico.repository.dao;

import java.util.List;

import br.com.prontuarioeletronico.domain.Medico;
import br.com.prontuarioeletronico.domain.Prontuario;
import br.com.prontuarioeletronico.repository.RepositoryFactory;
import br.com.prontuarioeletronico.repository.dao.interfaces.IGenericDAO;

public class ProntuarioDAO implements IGenericDAO<Prontuario>{
	
	@Override
	public void save(Prontuario object) {
		RepositoryFactory.getInstanceProntuario().add(object);
	}

	@Override
	public void update(Prontuario prontuario) {
		List<Prontuario> prontuarios = RepositoryFactory.getInstanceProntuario();
		for (Prontuario prontuarioO : prontuarios) {
			if(prontuarioO.getCodigo().
					equals(prontuario.getCodigo())) {
			}				
		}
	}

	@Override
	public Prontuario findById(Long id) {
		List<Prontuario> prontuarios = RepositoryFactory.getInstanceProntuario();
		for (Prontuario prontuario : prontuarios) {
			if(prontuario.getCodigo().equals(id)) {
				return prontuario;
			}				
		}
		return null;
	}

	@Override
	public List<Prontuario> findAll() {
		return RepositoryFactory.getInstanceProntuario();
	}

	@Override
	public boolean remove(Prontuario prontuario) {
		List<Prontuario> prontuarios = RepositoryFactory.getInstanceProntuario();
		for (Prontuario prontuarioO : prontuarios) {
			if(prontuarioO.getCodigo().
					equals(prontuario.getCodigo())) {
				prontuarios.remove(prontuario);
				return true;
			}				
		}
		return false;
	}

	@Override
	public Prontuario findById(Integer id) {		
		return null;
	}

	@Override
	public void save(Medico object) {
		// TODO Auto-generated method stub
		
	}

}
