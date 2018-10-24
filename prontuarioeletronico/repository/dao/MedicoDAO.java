package br.com.prontuarioeletronico.repository.dao;

import java.util.List;

import br.com.prontuarioeletronico.domain.Medico;
import br.com.prontuarioeletronico.domain.Prontuario;
import br.com.prontuarioeletronico.repository.RepositoryFactory;
import br.com.prontuarioeletronico.repository.dao.interfaces.IGenericDAO;

public class MedicoDAO implements IGenericDAO<Medico> {

	@Override
	public void save(Medico object) {

	}

	@Override
	public void update(Medico object) {
		RepositoryFactory.getInstanceMedico();
	}

	@Override
	public Medico findById(Long id) {
		List<Medico> especialidades = RepositoryFactory.getInstanceMedico();
		Object prontuarios;
		for (Medico medico : especialidades) {
			if(medico.getCodigo().equals(id)) {
				return medico;
			}				
		}
			return null;
	}



	private void getInstanceMedico() {
		// TODO Auto-generated method stub

	}

	@Override
	public Medico findById(Integer id) {

		return null;
	}

	@Override
	public List<Medico> findAll() {

		return null;
	}

	@Override
	public boolean remove(Medico object) {
		return false;
	}
}