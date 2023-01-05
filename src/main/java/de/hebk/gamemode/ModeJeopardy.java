package de.hebk.gamemode;

import de.hebk.gamemode.Gamemode;
import de.hebk.model.queue.Queue;

import java.util.Random;

public class ModeJeopardy extends Gamemode {
    @Override
    public void useJoker(int pInput) {

    }

    @Override
    public void start() {

    }

    @Override
    public void jokerHinzufuegen(Joker pJoker) {

    }

    @Override
    public boolean checkcorrect(String pAnswer) {
        return false;
    }

    @Override
    public void randomQuestion() {

    }

    @Override
    public void nextQuestion() {

    }

    @Override
    public Questions getCurrentQuestion() {
        return null;
    }

    @Override
    public void setCurrentQuestion(Questions currentQuestion) {

    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

}


