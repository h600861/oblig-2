package no.hvl.dat102.tabell;
import no.hvl.dat102.adt.*;
import no.hvl.dat102.adt.Parantesjekker;
import no.hvl.dat102.kjedet.KjedetStabel;

public class MainSjekker implements Parantesjekker {
	
	public MainSjekker () {
		
	}
	
	
	public  boolean erVenstreparentes(char p) {
		
		if (p == '('|| p == '[' ||  p == '{') {
			return true;
		}else
		
		return false;
	}

	@Override
	public boolean erHogreparentes(char p) {
		if (p == ')'|| p == ']' ||  p == '}') {
			return true;
		}else
		
		return false;
	}

	@Override
	public boolean erParentes(char p) {
		if (erHogreparentes(p) || erVenstreparentes(p)) {
			return true;
		}else
		 return false;
	}

	@Override
	public boolean erPar(char venstre, char hogre) {

		
		if(venstre == '('&& hogre ==')') {
			 return true;
		 }else if(venstre == '['&& hogre ==']') {
			 return true;
		 }else if(venstre == '{'&& hogre =='}') {
			 return true;
		 }
		 return false;
	}

	@Override
	public boolean erBalansert(String s) {
		StabelADT<Character> stabell = new TabellStabel<>();
		
		 
		 for (int i=0; i<s.length(); i++) 
		 {
			 char c = s.charAt(i);
			if(erVenstreparentes(c)) 
			{
				stabell.push(c);
			}else if(erHogreparentes(c))
			{
				if(stabell.erTom()||!erPar(stabell.pop(), c)) {
					return false;
				}
			}
				
		 }
		 
		 if(!stabell.erTom()) {
			 return false;
		 }
			 return true;
			 
		 }
		
	
	public static void main (String [] args) {
		MainSjekker main = new MainSjekker();
		String s = "(heihei)";
		String b = "(heihei(";
		String g = "({[]})";
		
		System.out.println(main.erBalansert(s));
		System.out.println(main.erBalansert(g));
		System.out.println(main.erBalansert(b));
	}

}




