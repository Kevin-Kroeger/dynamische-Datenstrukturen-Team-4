package de.hebk.gamemode;

import de.hebk.Game;
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
            while(modeNormal.getObject().getDifficulty() == lvl){
                modeNormal.next();
            }
            currentQuestion = modeNormal.getObject();
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
        //50/50 Joker
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
        //Telefon Joker
        }else if(pInput == 1){
            if(currentQuestion.getDifficulty() == 1){
                getCurrentQuestion().setQuestion("Ich tendiere zu der Antwort: " + getCurrentQuestion().getCorrect());
            }else if(currentQuestion.getDifficulty() == 2){
                String[] arr = new String[2];
                arr[0] = getCurrentQuestion().getCorrect();
                arr[1] = getCurrentQuestion().getAnswers()[1];
                String tmp;
                Random rand = new Random();
                int j = rand.nextInt(2);
                tmp = arr[j];
                getCurrentQuestion().setQuestion("Ich bin mir nicht 100% sicher aber ich würde sagen, es ist " + tmp);
            }else if(currentQuestion.getDifficulty() == 3){
                String[] arr = new String[3];
                arr[0] = getCurrentQuestion().getCorrect();
                arr[1] = getCurrentQuestion().getAnswers()[1];
                arr[2] = getCurrentQuestion().getAnswers()[2];
                String tmp;
                Random rand = new Random();
                int j = rand.nextInt(3);
                tmp = arr[j];
                getCurrentQuestion().setQuestion("Ich weiß die Antwort nicht und müsste raten. Ich würde sagen es ist " + tmp);
            }
        //Publikums Joker
        }else if(pInput == 2){
            if(currentQuestion.getDifficulty() == 1){
                String tmp = "";
                for(int i = 0; i < getCurrentQuestion().getAnswers().length; i++){
                    if(getCurrentQuestion().getAnswers()[i] == getCurrentQuestion().getCorrect()){
                        tmp = tmp + "Antwort "+ getCurrentQuestion().getCorrect() + " 88% \n";
                    }else{
                        tmp = tmp + "Antwort" + getCurrentQuestion().getAnswers()[i] + "  3% \n";
                    }
                }
                getCurrentQuestion().setQuestion(tmp);
            }else if(currentQuestion.getDifficulty() == 2){
                String tmp = "";
                for(int i = 0; i < getCurrentQuestion().getAnswers().length; i++){
                    if(getCurrentQuestion().getAnswers()[i] == getCurrentQuestion().getCorrect()){
                        tmp = tmp + "Antwort "+ getCurrentQuestion().getCorrect() + " 70% \n";
                    }else{
                        tmp = tmp + "Antwort" + getCurrentQuestion().getAnswers()[i] + "  10% \n";
                    }
                }
                getCurrentQuestion().setQuestion(tmp);
            }else if(currentQuestion.getDifficulty() == 3){
                String tmp = "";
                for(int i = 0; i < getCurrentQuestion().getAnswers().length; i++){
                    if(getCurrentQuestion().getAnswers()[i] == getCurrentQuestion().getCorrect()){
                        tmp = tmp + "Antwort "+ getCurrentQuestion().getCorrect() + " 40% \n";
                    }else{
                        tmp = tmp + "Antwort" + getCurrentQuestion().getAnswers()[i] + "  20% \n";
                    }
                }
                getCurrentQuestion().setQuestion(tmp);
            }
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
