package no.hvl.dat100.jplab11.oppgave2;


public class Bilde extends Tekst {

	int id;
	String bruker;
	String dato;
	int likes;
	String tekst;
	String url;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		
		this(id, bruker, dato, 0, tekst, url);
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		
		super(id, bruker, dato, likes, tekst);
		
		this.url = url;
	}
	
	public String getUrl() {
		
		return url;

	}

	public void setUrl(String url) {
		
		this.url = url;
		
	}

	@Override
	public String toString() {
		
		return "BILDE\n" + this.getId() + "\n" + this.getBruker() + "\n" + this.getDato() + "\n" + this.getLikes() + "\n" + this.getTekst() + "\n" + url + "\n";
		

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		return toString();
				
	}
}
