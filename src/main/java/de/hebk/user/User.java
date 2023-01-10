package de.hebk.user;

import de.hebk.user.Person;

public class User extends Person {
    private int points;

    /**
     * Konstruktor
     * @param pName
     * @param pAge
     * @param pPoints
     */
    public User(String pName, int pAge, int pPoints) {
        super(pName, pAge);
        setPoints(pPoints);
    }

    /**
     *
     * @return
     */
    public int getPoints() {
        return points;
    }

    /**
     *
     * @param points
     */
    public void setPoints(int points) {
        this.points = points;
    }
}
