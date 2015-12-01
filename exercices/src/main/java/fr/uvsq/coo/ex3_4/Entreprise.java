package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

public class Entreprise
{	
	private ArrayList<Employe> entreprise = new ArrayList<Employe>();
	
	public void ajouter(Employe e)
	{
		entreprise.add(e);
	}
	
	public void retirer(Employe e)
	{
		entreprise.remove(e);
	}
	
	public int sommeSalaire()
	{
		int sommeSalaire = 0;
		
		for(Employe e : entreprise)
		{
			sommeSalaire += e.calculSalaire();
		}
		
		return sommeSalaire;
	}
	
	public static void main(String args[])
	{
		Employe e1 = new Employe(2);
		Employe e2 = new Employe(5);
		Vendeur v1 = new Vendeur(4, 20);
		Manager m1 = new Manager(3, 3);
		Entreprise ent1 = new Entreprise();
		
		ent1.ajouter(e1);
		ent1.ajouter(e2);
		ent1.ajouter(v1);
		ent1.ajouter(m1);
		
		System.out.println("sommeSalaire ent1 : " + ent1.sommeSalaire());
	}
}