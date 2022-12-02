package de.hebk.gamemode;

import de.hebk.model.list.List;

public class ModeNormal extends Gamemode {

    private List<Questions> questions;
    private int money;

    public List<Questions> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
