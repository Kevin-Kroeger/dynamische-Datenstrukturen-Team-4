package de.hebk.gamemode;

public class Joker {
    private String name;

    /**
     * Konstruktor
     * @param pName
     */
    public Joker(String pName){
        setName(pName);
    }

    /**
     * liefert den Wert des Joker namens zurück
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * setzt den Namen des Jokers
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}