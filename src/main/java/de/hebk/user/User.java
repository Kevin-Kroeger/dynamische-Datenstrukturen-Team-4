package de.hebk.user;

import de.hebk.user.Person;

public class User extends Person {
    private int points;
    private int count;

    /**
     * Konstruktor
     * @param pName
     * @param pAge
     * @param pPoints
     */
    public User(String pName, int pAge, int pPoints,int pCount) {
        super(pName, pAge);
        setPoints(pPoints);
        setPoints(pCount);
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
