package fr.uvsq.coo.ex3_7;

import java.time.LocalDateTime;

public class UneClasseMetier
{
	public void uneMethodeMetier()
	{
		// Log message
		Log.afficher(LocalDateTime.now() + ": Début de uneMethodeMetier");
		
		// Traitements métiers
		
		// Log message
		Log.afficher(LocalDateTime.now() + ": Fin de uneMethodeMetier");
	}
	
	public static void main(String args[])
	{		
		UneClasseMetier a = new UneClasseMetier();
		
		a.uneMethodeMetier();
	}
}