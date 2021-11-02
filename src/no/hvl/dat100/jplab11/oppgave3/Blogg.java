package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtab;
	private int nesteledig;

	public Blogg() {
		this.innleggtab = new Innlegg[20];
		this.nesteledig = 0;
	}

	public Blogg(int lengde) {
		this.innleggtab = new Innlegg[lengde];
		this.nesteledig=0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtab;

	}
	
	public int finnInnlegg(Innlegg finninnlegg) {
		int x = 0;
		boolean a = false;
		int i = 0;
		while (a==false && i<nesteledig){
			 x = innleggtab[i].getId();
			if (x==finninnlegg.getId())
				a = true;
			i++;
		}
		return i;
		
	}

	public boolean finnes(Innlegg innlegg) {
		boolean a = false;
		int i = 0;
		while (a==false&&i<nesteledig) {
			int x = innleggtab[i].getId();
			if(x==innlegg.getId())
				a = true;
			i++;
		}
		return a;
		}

	public boolean ledigPlass() {
		boolean a = true;
		if (nesteledig>=innleggtab.length)
			a = false;
		return a;

	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean a = false;
		if(ledigPlass() == true) {
			innleggtab[nesteledig] = innlegg;
			nesteledig++;
			a = true;
			
		}
		return a;
	}
	
	public String toString() {
		String str = nesteledig + "";
		for (int i =0; i<nesteledig; i++) {
			str += innleggtab[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		Innlegg[] nytab = new Innlegg[innleggtab.length*2];
		for (int i =0; i<nesteledig; i++) {
			nytab[i] = innleggtab[i];
		}
		innleggtab = nytab;
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
		boolean a = false;
		if (ledigPlass()==false)
			utvid();
if(finnes(innlegg)==false) {
	 a = true;
	leggTil(innlegg);}
	return a;
}
	
		
	
	
	public boolean slett(Innlegg innlegg) {
Innlegg[] tempsam = innleggtab;
boolean a = false;
for (int i = 0; i< innleggtab.length; i++) {
	if (innlegg.erLik(innleggtab[i])==true) {
		innleggtab[i] = null;
		nesteledig--;
		a=true;
	}
	if (a == true && i < innleggtab.length-1) {
		tempsam[i] = innleggtab[i+1];
	}
}
innleggtab = tempsam;
return a;
}

	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}
