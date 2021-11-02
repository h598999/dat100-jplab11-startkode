package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
			
	}
	
	public Innlegg(int id, String bruker, String dato) {

this.id = id;
this.bruker = bruker;
this.dato = dato;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

this.id=id;
this.bruker = bruker;
this.dato=dato;
this.likes=likes;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String brukernavn) {
		bruker = brukernavn;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String nydato) {
		dato = nydato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg nyinnlegg) {
	boolean a = false;
	if (nyinnlegg.getId()==getId())
		a = true;
return a;
	}
	
	@Override
	public String toString() {
		
	String tostring = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
	return tostring;			
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
