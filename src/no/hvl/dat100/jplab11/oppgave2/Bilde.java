package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;

public class Bilde extends Tekst {

	private String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
	super(id, bruker, dato, likes, tekst);
	this.url = url;
	}
	
	public String getUrl() {
		return url;

	}

	public void setUrl(String nyurl) {
	url = nyurl;
	}

	@Override
	public String toString() {
		String str = super.toString().replace("TEKST", "BILDE") + url + "\n";
		return str;

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
