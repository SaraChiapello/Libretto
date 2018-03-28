package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Model {
	private List<Esame> esami;
	public Model() {
		this.esami=new ArrayList<Esame>();
	}
	/**
	 * aggiunge esame all'elenco
	 * verificando che non sia già stato inserito
	 * @param e
	 * return true se inserito correttamente, false diversamente
	 */
	public boolean addEsame(Esame e) {
		if(!esami.contains(e)) {
			esami.add(e);
			return true;
		} else {
			return false;
		}
		
	}
	/**
	 * guarda se trovi esame dato il codice
	 * @param codice
	 * @return null se non lo trova se no l'esame
	 */
	public Esame trovaEsaem(String codice) {
		int pos=this.esami.indexOf(new Esame(codice,null,null));//non mi serve fare il ciclo, però devo cercare un esame non un codice 
		if(pos==-1)
			return null;
		else
			return esami.get(pos);
	}
}
