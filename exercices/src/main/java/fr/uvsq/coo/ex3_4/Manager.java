package fr.uvsq.coo.ex3_4;

public class Manager extends Employe
{
	private int nbSubordonnes = 0;
	
	public Manager(int anneeAnciennete, int nbSubordonnes)
	{
		super(anneeAnciennete);
		this.nbSubordonnes = nbSubordonnes;
	}

	@Override
	public int calculSalaire()
	{
		return this.getSalaire() + (20 * this.getAnneeAnciennete()) + (100 * this.nbSubordonnes);
	}
}