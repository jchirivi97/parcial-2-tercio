package edu.eci.cvds.tests;

import static org.quicktheories.generators.SourceDSL.strings;

import org.quicktheories.core.Gen;

import edu.eci.cvds.entities.Decanatura;

public class Generators {
	static private int nextUserID = 0;
	
	static public Gen<Decanatura> decanaturas() {
		return strings().basicLatinAlphabet().ofLengthBetween(10, 50)
				.zip(strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						strings().basicLatinAlphabet().ofLengthBetween(10, 50),
						(nombre, decano, paginaWeb) -> {
							nextUserID++;
							return new Decanatura(nextUserID, nombre, decano, paginaWeb);	
						});
	}
}
