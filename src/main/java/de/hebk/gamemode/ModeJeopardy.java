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
        Queue<Questions> topic = new Queue<>();
        while(!modeJeopardy.isEmpty()){
            if(modeJeopardy.front().getTopic().equals(pTopic)){
                topic.enqueue(modeJeopardy.front());
                modeJeopardy.dequeue();
            }else{
                tmp.enqueue(modeJeopardy.front());
                modeJeopardy.dequeue();
            }
        }
        int j = rand.nextInt(topic.getLenght()+1);
        System.out.println(j);
        for(int i = 0; i <= j;i++){
            System.out.println(topic.front());
            topic.enqueue(topic.front());
            topic.dequeue();
        }
        if(topic.front().getDifficulty() == lvl) {
            currentQuestion = topic.front();
            topic.dequeue();
        }else{
            while(currentQuestion == null){
                if(topic.front().getDifficulty() == lvl) {
                    currentQuestion = topic.front();
                    topic.dequeue();
                }
                topic.enqueue(topic.front());
                topic.dequeue();
            }
        }
        while (!topic.isEmpty()) {
            tmp.enqueue(topic.front());
            topic.dequeue();
        }
        while (!tmp.isEmpty()) {
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


