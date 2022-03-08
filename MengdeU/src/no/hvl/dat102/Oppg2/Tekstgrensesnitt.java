package no.hvl.dat102.Oppg2;

import javax.swing.JOptionPane;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Tekstgrensesnitt {
		
	
	
	public static Medlem lesMedlem() {
		String navn = JOptionPane.showInputDialog("Navn: ");
		MengdeADT<Hobby> mengde = new KjedetMengde<>();
		String [] stringHobby = JOptionPane.showInputDialog("Hobby: ").split("\\W");
		
		for (String i : stringHobby) {
			Hobby hobby = new Hobby (i);
			mengde.leggTil(hobby);
		}
		
		return new Medlem(navn, mengde);
			
		
	}
	
	public static void skrivHobbyListe(Medlem medlem) {
		System.out.println ("Alle hobbyene");
		System.out.println (medlem.getHobbyer().toString());
	
	}
	
	public static void skrivParListe (Datakontakt arkiv) {
		  System.out.printf("%s %20s %n", "PARNAVN", "HOBBYER");
	        TabellMengde<Medlem> medlemmer = arkiv.getMedlemmer();

	        int i = 0, antallPar = 0;
	        //Markerer posisjonen til de medlemmene som er skrevet ut
	        boolean[] skrevetUt = new boolean[arkiv.getMedlemmer().antall()];

	        for (Medlem m : medlemmer) {
	            int m2 = m.getStatusIndeks();

	            if (m2 != -1 && !skrevetUt[i]) {
	                System.out.printf("%s %18s %n", m.getNavn() + " og " + medlemmer.getElement(m2).getNavn(), m.getHobbyer());
	                skrevetUt[m2] = true;
	                antallPar++;
	            }
	            i++;
	        }
	        System.out.println("----------------------------------------------\n" +
	                "Antall par funnet: " + antallPar);
	    
	}
}
