package edu.eci.cvds.persistence;

import java.util.List;

import edu.eci.cvds.entities.Materia;


public interface MateriaDAO {
	public List<Materia> buscarTodos() throws PersistenceException;

	public void guardar(Materia p) throws PersistenceException;

	public void actualizar(Materia p) throws PersistenceException;

	public Materia buscar(String mnemonico) throws PersistenceException;

	public List<Materia> buscarPorPrograma(int programa) throws PersistenceException;
}
