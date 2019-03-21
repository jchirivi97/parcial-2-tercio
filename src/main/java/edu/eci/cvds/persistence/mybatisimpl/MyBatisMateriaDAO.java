package edu.eci.cvds.persistence.mybatisimpl;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.persistence.MateriaDAO;
import edu.eci.cvds.persistence.mybatisimpl.mappers.MateriaMapper;


public class MyBatisMateriaDAO implements MateriaDAO {
	@Inject
	private MateriaMapper materiaMapper;

	@Override
	public List<Materia> buscarTodos() throws edu.eci.cvds.persistence.PersistenceException {
		try {
			return materiaMapper.buscarMateriaPorPrograma();
		} catch (Exception e) {
			throw new PersistenceException("Load all persistence error");
		}
	}

	@Override
	public void guardar(Materia p) throws edu.eci.cvds.persistence.PersistenceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Materia p) throws edu.eci.cvds.persistence.PersistenceException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Materia buscar(String mnemonico) throws edu.eci.cvds.persistence.PersistenceException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Materia> buscarPorPrograma(int programa) throws edu.eci.cvds.persistence.PersistenceException {
		try {
			return materiaMapper.buscarMateriaPorPrograma(programa);
		} catch (Exception e) {
			throw new PersistenceException("Load all persistence error");
		}
	}

	
}
