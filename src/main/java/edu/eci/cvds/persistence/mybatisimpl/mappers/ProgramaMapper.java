package edu.eci.cvds.persistence.mybatisimpl.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;


import edu.eci.cvds.entities.Programa;

public interface ProgramaMapper {

	List<Programa> buscarPorDecanatura(@Param("decanatura") int decanaturaId);

}
