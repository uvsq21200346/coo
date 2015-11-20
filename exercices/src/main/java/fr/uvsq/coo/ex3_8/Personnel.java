package fr.uvsq.coo.ex3_8;

import java.time.LocalDate;

public class Personnel implements Element
{
	private final String nom;
	private final String prenom;
	private final LocalDate dateNaissance;
	
	private final String telephone;
	private final String fonction;
	
	public static class Builder
	{
		// Paramètres requis
		private final String nom;
		private final String prenom;
		private final LocalDate dateNaissance;
		
		// Paramètres optionnels
		private String telephone = "00 00 00 00 00";
		private String fonction = "Pas de fonction";
		
		public Builder(String nom, String prenom, LocalDate dateNaissance)
		{
			this.nom = nom;
			this.prenom = prenom;
			this.dateNaissance = dateNaissance;
		}
		
		public Builder telephone(String telephone)
		{
			this.telephone = telephone;
			return this;
		}
		
		public Builder fonction(String fonction)
		{
			this.fonction = fonction;
			return this;
		}
		
		public Personnel build()
		{
			return new Personnel(this);
		}
	}
	
	private Personnel(Builder builder)
	{
		// Paramètres requis
		this.nom = builder.nom;
		this.prenom = builder.prenom;
		this.dateNaissance = builder.dateNaissance;
		
		// Paramètres optionnels
		this.telephone = builder.telephone;
		this.fonction = builder.fonction;
	}
	
	public void afficher()
	{
		System.out.println("Nom : " + this.nom);
		System.out.println("Prénom : " + this.prenom);
		System.out.println("Date de naissance : " + this.dateNaissance);
		System.out.println("Numéro de téléphone : " + this.telephone);
		System.out.println("Fonction : " + this.fonction);
		System.out.println();
	}
}