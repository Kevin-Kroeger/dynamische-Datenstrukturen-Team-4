package de.hebk.user;

public abstract class Person {
    private String name;
    private int age;

    /**
     * Konstruktor
     * @param pName
     * @param pAge
     */
    public Person(String pName, int pAge){
        setAge(pAge);
        setName(pName);
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}