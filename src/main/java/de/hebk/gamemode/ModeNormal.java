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
    public void randomQuestion() {
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
            randomQuestion();
        }
        System.out.println(currentQuestion.getDifficulty());
    }


    @Override
    public void nextQuestion() {
        count++;
        changeLVL();
        randomQuestion();
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

    }

    @Override
    public void jokerHinzufuegen(Joker pJoker) {

    }




    /**
     *
     */
    @Override
    public void start() {
        randomQuestion();
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    public int getLvl() {
        return lvl;
    }
    public void setLvl(int lvl) {
        this.lvl = lvl;
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
