package no.hvl.dat102.Junit.test;

import no.hvl.dat102.Junit.ADT.ADTtest;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;



class KjedetMengdeTest extends ADTtest {

	@Override
	protected MengdeADT<String> reset() {
		return new KjedetMengde<String>();
	}
}
