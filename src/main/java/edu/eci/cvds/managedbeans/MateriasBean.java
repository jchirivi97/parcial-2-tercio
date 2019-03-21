package edu.eci.cvds.managedbeans;


import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.entities.Materia;
import edu.eci.cvds.entities.Programa;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Bean para la interfaz de usuario de las decanaturas
 */
@SuppressWarnings("deprecation")
@ManagedBean(name = "materiaBean")
@RequestScoped




public class MateriasBean extends BasePageBean {
	
	private static final long serialVersionUID = -1071897882966043904L;

	@Inject
	private DecanaturaServices decanaturaServices;

	@ManagedProperty(value = "#{param.programa}")

	private Integer ProgramaId;
	
	public List<Materia> getMaterias() throws Exception {
		try {
			if (ProgramaId == null) {
				return decanaturaServices.buscarMateriasPorPrograma();
			} else {
				return decanaturaServices.buscarMateriasPorPrograma(ProgramaId);
			}
		} catch (ServicesException ex) {

			throw ex;
		}
	}

}
