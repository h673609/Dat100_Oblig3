package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {
    
    // Objektvariabel for URL til bildet
    private String url;

    // Konstruktør uten likes
    public Bilde(int id, String bruker, String dato, String tekst, String url) {
        super(id, bruker, dato, tekst); // Kaller superklassens konstruktør
        this.url = url;
    }

    // Konstruktør med likes
    public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
        super(id, bruker, dato, likes, tekst); // Kaller superklassens konstruktør
        this.url = url;
    }

    // Get- og set-metoder for url
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    // Overriding toString-metode
    @Override
    public String toString() {
        return "BILDE\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n" + url + "\n";
    }
}