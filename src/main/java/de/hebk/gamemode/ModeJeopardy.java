package de.hebk.gamemode;

import de.hebk.gamemode.Gamemode;
import de.hebk.model.queue.Queue;

import java.util.Random;

public class ModeJeopardy extends Gamemode {
    private int lvl;
    private Questions currentQuestion;

    public ModeJeopardy(){
        setModeJeopardy(getModeJeopardy());
    }
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
        return pAnswer.equals(currentQuestion.getCorrect());
    }

    @Override
    public void randomQuestion(String pTopic) {
        Queue<Questions> q1 = new Queue<>();
        Queue<Questions> tmp = new Queue<>();
        while(!modeJeopardy.isEmpty()) {
            if(modeJeopardy.front().getTopic().equals(pTopic)){
                q1.enqueue(modeJeopardy.front());
            }
            tmp.enqueue(modeJeopardy.front());
            modeJeopardy.dequeue();
        }
        while(!q1.isEmpty() && getCurrentQuestion() == null){
            if(q1.front().getDifficulty() == lvl) {
                setCurrentQuestion(q1.front());
            }
            q1.dequeue();
        }
    }

    @Override
    public void nextQuestion() {

    }

    @Override
    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    @Override
    public void setCurrentQuestion(Questions pCurrentQuestion) {
        currentQuestion = pCurrentQuestion;
    }

    @Override
    public int getLvl() {
        return lvl;
    }

    @Override
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}


