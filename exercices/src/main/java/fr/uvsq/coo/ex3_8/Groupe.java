package fr.uvsq.coo.ex3_8;

import java.util.ArrayList;
import java.util.Iterator;

public class Groupe implements Element
{
	private ArrayList<Element> groupe = new ArrayList<Element>();
	
	public void afficher()
	{
		// Afficher grâce à l'iterator
		Iterator<Element> it = groupe.iterator();
		
		while(it.hasNext())
		{
			Element elt = (Element)it.next();
			elt.afficher();
		}
		
		// Afficher grâce à une boucle "for each"
		
		/*
		 * for(Element elt : groupe)
		 * elt.afficher();
		 */
	}
	
	public void ajouter(Element elt)
	{
		groupe.add(elt);
	}
	
	public void retirer(Element elt)
	{
		groupe.remove(elt);
	}
}