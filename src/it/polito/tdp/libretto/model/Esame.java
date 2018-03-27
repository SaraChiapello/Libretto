package it.polito.tdp.libretto.model;

import java.time.LocalDate;

/**
 * oggetto semplice che contiene i dati relativi ad 
 * un singolo esame.
 * POJO-plain old java object
 * dati privati)propriet�)
 * costruttore
 * get/set
 *
 */
public class Esame {
	private String codice;
	private String titolo;
	private String docente;
//	private Docente docente;
	private boolean superato;
	private int voto;
	private LocalDate dataSuperamento;
	public Esame(String codice, String titolo, String docente) {
		super();
		this.codice = codice;
		this.titolo = titolo;
		this.docente = docente;
		this.superato=false;
	}
	public String getCodice() {
		return codice;
	}
	public void setCodice(String codice) {
		this.codice = codice;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getDocente() {
		return docente;
	}
	public void setDocente(String docente) {
		this.docente = docente;
	}
	public boolean isSuperato() {
		return superato;
	}
	private void setSuperato(boolean superato) {
		this.superato = superato;
	}
	public int getVoto() {
		if(!this.superato) {
			throw new IllegalStateException("Esame"+this.codice+"gi� superato");

		}
		return voto;
	}
	private void setVoto(int voto) {
		this.voto = voto;
	}
	public LocalDate getDataSuperamento() {
		if(!this.superato) {
			throw new IllegalStateException("Esame"+this.codice+"gi� superato");

		}
		return dataSuperamento;
	}
	public void setDataSuperamento(LocalDate dataSuperamento) {
		this.dataSuperamento = dataSuperamento;
	}
	@Override
	public String toString() {
		return "Esame [codice=" + codice + ", titolo=" + titolo + ", docente=" + docente + ", superato=" + superato
				+ ", voto=" + voto + ", dataSuperamento=" + dataSuperamento + "]";
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Esame other = (Esame) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}
	/**
	 * se l'esame non � ancora superato, lo considera
	 * superato con il voto e la data specificati.
	 * se invece l'esame era gi� superato, genera eccezione
	 * @param voto
	 * @param data
	 */
	public void supera(int voto,LocalDate data) {
		if(!this.superato) {
			this.superato=true;
			this.voto=voto;
			this.dataSuperamento=data;
		} else {
			throw new IllegalStateException("Esame"+this.codice+"gi� superato");
		}
		
	}
	
	
}