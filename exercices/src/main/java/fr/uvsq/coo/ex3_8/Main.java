package fr.uvsq.coo.ex3_8;

import java.time.LocalDate;

public class Main
{
	public static void main(String args[])
	{
		// Création sur une ligne
		
		/*
		 * Personnel p1 = new Personnel.Builder("D", "Jacques", LocalDate.parse("2015-01-03")).build();
		 * Personnel p2 = new Personnel.Builder("M", "Bob", LocalDate.parse("2011-03-07")).build();
		 * Personnel p3 = new Personnel.Builder("S", "John", LocalDate.parse("2006-11-18")).build();
		 */
		
		// Création sur plusieurs lignes
		Personnel.Builder b = new Personnel.Builder("D", "Jacques", LocalDate.parse("2015-01-03"));
		b.fonction("Directeur");
		Personnel p1 = b.build();
		b = new Personnel.Builder("M", "Bob", LocalDate.parse("2011-03-07"));
		b.fonction("Chargé de mission");
		Personnel p2 = b.build();
		b = new Personnel.Builder("S", "John", LocalDate.parse("2006-11-18"));
		b.fonction("Assistant administratif");
		Personnel p3 = b.build();
		
		Groupe g1 = new Groupe();
		Groupe g2 = new Groupe();
		
		g1.ajouter(p1);
		g1.ajouter(p3);
		g2.ajouter(p2);
		
		System.out.println("GROUPE 1");
		System.out.println();
		g1.afficher();
		
		System.out.println("GROUPE 2");
		System.out.println();
		g2.afficher();
	}
}