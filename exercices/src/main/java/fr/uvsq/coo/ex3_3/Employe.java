package fr.uvsq.coo.ex3_3;

public class Employe
{
	private final String nom;
	private final String adresse;
	private double salaire = 0;
	
	public Employe(String nom, String adresse)
	{
		this.nom = nom;
		this.adresse = adresse;
	}
	
	public String getNom()
	{
		return nom;
	}
	
	public String getAdresse()
	{
		return adresse;
	}
	
	public double getSalaire()
	{
		return salaire;
	}
	
	public static void main(String args[])
	{
		Employe e1 = new Employe("Roger", "avenue de Paris");
		AfficheEmploye ae1 = new AfficheEmploye(e1);
	}
}