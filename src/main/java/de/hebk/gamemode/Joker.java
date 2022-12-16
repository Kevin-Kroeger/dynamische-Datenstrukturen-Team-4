package de.hebk.gamemode;

public class Joker {
    private String name;

    public void createJoker(String pName){
        setName(pName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
