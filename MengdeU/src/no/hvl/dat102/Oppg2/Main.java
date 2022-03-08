package no.hvl.dat102.Oppg2;

import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;
import no.hvl.dat102.mengde.tabell.TabellMengde;

public class Main {

	

	public static void main (String [] args) {
	Datakontakt ny = new Datakontakt (5);
	Medlem Lars = new Medlem ("Lars");
	Medlem Tom = new Medlem ("Tom");
    Medlem Lasse = new Medlem ("Lasse");
    Hobby Frisbeegolf = new Hobby ("Frisbeegolf");
    MengdeADT<Hobby> hobbyer = new TabellMengde<>();
    
    hobbyer.leggTil(Frisbeegolf);
    
    ny.leggTilMedlem(Lars);
    ny.leggTilMedlem(Tom);
    ny.leggTilMedlem(Lasse);
    
    Lars.setHobbyer(hobbyer);
    Tom.setHobbyer(hobbyer);
    Lasse.setHobbyer(hobbyer);
	
    System.out.println (ny.finnPartnerFor(Lasse));
    System.out.println (ny.finnPartnerFor(Lars));
    System.out.println (ny.finnPartnerFor(Tom));
   
    System.out.println(ny);
    
    System.out.println ("");
    Tekstgrensesnitt.skrivParListe(ny);
    
    System.out.print(ny);
    
	}
}