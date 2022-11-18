package de.hebk.user;

import de.hebk.user.Person;

public class User extends Person {
    private int points;

    public User(String pName, int pAge, int pPoints) {
        super(pName, pAge);
        setPoints(pPoints);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
