package de.hebk.gamemode;

import de.hebk.model.list.List;
import java.util.Random;

public class ModeNormal extends Gamemode {
    private int money;
    private int lvl;
    private Questions currentQuestion;
    private int count = 0;

    public ModeNormal(){
        setModeNormal(getModeNormal());
        setLvl(1);
        setMoney(0);
    }

    @Override
    public boolean checkcorrect(String pAnswer) {
        return pAnswer.equals(currentQuestion.getCorrect());
    }



    /**
     *
     * @return
     */
    @Override
    public void randomQuestion(String pContext) {
        Random rand = new Random();
        modeNormal.toFirst();
        int j = rand.nextInt(modeNormal.getLenght()+1);
        for(int i = 0; i < j;i++){
            modeNormal.next();
        }
        if(modeNormal.getObject().getDifficulty() == lvl){
            currentQuestion = modeNormal.getObject();
            modeNormal.remove();
        }else{
            randomQuestion(null);
        }
    }


    @Override
    public void nextQuestion() {
        count++;
        changeLVL();
        randomQuestion(null);
    }

    public void changeLVL(){
        if(count == 5){
            setLvl(2);
        }else if(count == 10){
            setLvl(3);
        }
    }

    @Override
    public void useJoker(int pInput) {
        getJoker()[pInput] = null;
        if(pInput == 0){
            String[] arr = new String[2];
            arr[0] = currentQuestion.getCorrect();
            currentQuestion.randomAnswers();
            if(currentQuestion.getAnswers()[1] != currentQuestion.getCorrect()){
                arr[1] = currentQuestion.getAnswers()[1];
            }else{
                useJoker(0);
            }
            currentQuestion.setAnswers(arr);
        }
    }

    @Override
    public void jokerHinzufuegen(Joker pJoker) {
        for(int i = 0; i < getJoker().length; i++){
            if(getJoker()[i] == null) {
                getJoker()[i] = pJoker;
                return;
            }
        }
    }


    /**
     *
     */
    @Override
    public void start() {
        randomQuestion(null);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(Questions currentQuestion){
        this.currentQuestion = currentQuestion;
    }

    @Override
    public Joker[] getJoker() {
        return super.getJoker();
    }

    @Override
    public void setJoker(Joker[] joker) {
        super.setJoker(joker);
    }


}
