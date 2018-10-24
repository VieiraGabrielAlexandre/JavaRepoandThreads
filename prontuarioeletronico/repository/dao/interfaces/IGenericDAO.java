package br.com.prontuarioeletronico.repository.dao.interfaces;

import java.util.List;

import br.com.prontuarioeletronico.domain.Medico;

public interface IGenericDAO<T>{
	
	public void save(T object);
	
	public void update(T object);

	public T findById(Long id);
	
	public T findById(Integer id);

	public List<T> findAll();

	public boolean remove(T object);

	void save(Medico object);
}
