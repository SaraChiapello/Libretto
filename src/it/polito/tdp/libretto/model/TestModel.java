package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestModel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model m=new Model();
		System.out.println(m.addEsame(new Esame("abd","Tecniche","corno")));
		System.out.println(m.addEsame(new Esame("cfs","progr","lioy")));

		System.out.println(m.trovaEsaem("abd"));
		System.out.println(m.trovaEsaem("cfs"));
		System.out.println(m.trovaEsaem("cacca"));

	
	}

}
