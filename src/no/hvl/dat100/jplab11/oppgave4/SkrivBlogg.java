package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.Blogg;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean a = true;
		try {
 PrintWriter skriver = new PrintWriter(filnavn);
 skriver.print(samling.toString());
 skriver.close();}
 
 catch(FileNotFoundException e) {
	  a = false;
	 System.out.println("Fil ikkje funnet");
 }

return a;	
}
}
