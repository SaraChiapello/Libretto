package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestEsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Esame tdp=new Esame("abd","Tecniche","corno");
		System.out.println(tdp);
		Esame pwr=new Esame("cfs","progr","lioy");
		System.out.println(pwr);
		
		tdp.supera(30, LocalDate.now());
		System.out.println(tdp);
		tdp.supera(18, LocalDate.now());
		System.out.println(tdp);

	}

}
