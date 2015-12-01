package fr.uvsq.coo.ex3_4;

public class Employe
{
	private int salaire = 1500;
	private int anneeAnciennete;
	
	public Employe(int anneeAnciennete)
	{
		this.anneeAnciennete = anneeAnciennete;
	}
	
	public int getSalaire()
	{
		return salaire;
	}
	
	public int getAnneeAnciennete()
	{
		return this.anneeAnciennete;
	}
	
	public int calculSalaire()
	{
		return this.salaire + (20 * this.anneeAnciennete);
	}
}