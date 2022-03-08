package no.hvl.dat102.Junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import no.hvl.dat102.Junit.ADT.ADTtest;
import no.hvl.dat102.mengde.adt.MengdeADT;
import no.hvl.dat102.mengde.kjedet.KjedetMengde;

class TabellMengdeTest extends ADTtest {

	@Override
	protected MengdeADT<String> reset() {
		return new KjedetMengde<String>();
	}
}
