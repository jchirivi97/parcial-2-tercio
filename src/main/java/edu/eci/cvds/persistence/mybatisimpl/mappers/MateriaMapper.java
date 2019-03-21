package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import edu.eci.cvds.entities.Materia;


public interface MateriaMapper {

	
	public List<Materia> buscarMateriaPorPrograma(@Param("programa") int id );
	
	public List<Materia> buscarMateriaPorPrograma();
}