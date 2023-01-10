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
        Random rand = new Random();
        Queue<Questions> tmp = new Queue<>();
        int j = rand.nextInt(modeJeopardy.getLenght()+1);
        for(int i = 0; i < j;i++){
            tmp.enqueue(modeJeopardy.front());
            modeJeopardy.enqueue(modeJeopardy.front());
            modeJeopardy.dequeue();
        }
        if(modeJeopardy.front().getDifficulty() == lvl){
            currentQuestion = modeJeopardy.front();
            modeJeopardy.dequeue();
        }else{
            randomQuestion(pTopic);
        }
        while(!tmp.isEmpty()){
            modeJeopardy.enqueue(tmp.front());
            tmp.dequeue();
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


