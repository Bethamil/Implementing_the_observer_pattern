package model;

/**
 * @author Emiel Bloem
 * <p>
 * Dit doet het programma
 */
public class Huis {
    private String naam;

    public Huis(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return String.format("%s", this.naam);
    }
}
