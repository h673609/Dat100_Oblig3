package no.hvl.dat100.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.oppgave3.Blogg;

public class SkrivBlogg {

    public static boolean skriv(Blogg samling, String mappe, String filnavn) {
        try {
            // Opprett filobjekt og PrintWriter for å skrive til filen
            File fil = new File(mappe, filnavn);
            PrintWriter skriver = new PrintWriter(fil);
            
            // Skriver samlingen til fil ved hjelp av toString-metoden
            skriver.print(samling.toString());
            
            // Lukker PrintWriter og returnerer true for å indikere suksess
            skriver.close();
            return true;
            
        } catch (FileNotFoundException e) {
            // Håndterer unntak hvis filen ikke finnes eller ikke kan opprettes
            System.out.println("Kunne ikke skrive til filen: " + e.getMessage());
            return false;
        }
    }
}
