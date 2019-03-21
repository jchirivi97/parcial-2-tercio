package edu.eci.cvds.tests;

import static org.quicktheories.QuickTheory.qt;

import java.sql.SQLException;

import org.junit.Test;

import com.google.inject.Inject;

import edu.eci.cvds.entities.Decanatura;
import edu.eci.cvds.services.DecanaturaServices;
import edu.eci.cvds.services.ServicesException;

/**
 * Clase de prueba para {@link DecanaturaServices}
 */
public class DecanaturaServicesTest extends TestBase {

	@Inject
	private DecanaturaServices decanaturaServices;

	@Test
	public void pruebaCeroTest() throws SQLException, ServicesException {
		qt().forAll(Generators.decanaturas()).check((decanatura) -> {
			try {
				decanaturaServices.crearDecanatura(decanatura);

				for (Decanatura dec : decanaturaServices.listarDecanaturas()) {
					if (decanatura.getNombre().equals(dec.getNombre())) {
						return true;
					}
				}

				return false;
			} catch (ServicesException ex) {
				ex.printStackTrace();
				return false;
			}

		});
	}
}
