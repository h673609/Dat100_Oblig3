package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

private Innlegg[] innleggtabell;
private int nesteledig; 


	public Blogg() {
		innleggtabell = new Innlegg[20]
		nesteledig = 0;

}

	public Blogg(int lengde) {
		inleggtavell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig; 
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell; 
	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i = 0; i < nesteledig; i++) {
			if (innleggtavell[i].erLik(innlegg))
			return i; 
		}
	
	}
		return -1;
}

	public boolean finnes(Innlegg innlegg) {
		return finnInnlegg(innlegg) != -1;
	}

	public boolean ledigPlass() {
		return nesteledig < innleggtavell.lenght; 

	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (!finnes(innlegg) && ledigPlass()) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}

		return false;

	}
	
	public String toString() {
		Stringbuiler sb = new StringBuilder();
		sb.append(nesteledig)-append("\n");
		for (int i = 0; i < nesteledig; i++) {
			sb.append(innleggtabell[i].toString());

		}
		return sb.toString();
	}

