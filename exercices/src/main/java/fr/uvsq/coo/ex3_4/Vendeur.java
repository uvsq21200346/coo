package fr.uvsq.coo.ex3_4;

public class Vendeur extends Employe
{
	private int commission = 0;
	
	public Vendeur(int anneeAnciennete, int commission)
	{
		super(anneeAnciennete);
		this.commission = commission;
	}

	@Override
	public int calculSalaire()
	{
		return this.getSalaire() + (20 * this.getAnneeAnciennete()) + this.commission;
	}
}