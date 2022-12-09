package de.hebk.gamemode;

import de.hebk.model.list.List;
import java.util.Random;

public class ModeNormal extends Gamemode {
    private int money;
    private int lvl;
    private Questions currentQuestion;
    private int count = 0;
    public ModeNormal(List<Questions> pList){
        setModeNormal(pList);
        setLvl(1);
        setMoney(0);
    }
    public boolean checkCorrect(String pAnswer){
        return pAnswer.equals(currentQuestion.getCorrect());
    }

    /**
     *
     * @return
     */
    public void randomQuestion(){
        Random rand = new Random();
        List<Questions> list = new List<>();
        modeNormal.toFirst();
        while(modeNormal.getObject().getDifficulty() == lvl){
            list.append(modeNormal.getObject());
            modeNormal.remove();
        }
        //List enthällt jetzt nur Fragen der jeweilligen Schwierigkeitsstufe
        list.toFirst();
        int j = rand.nextInt(getModeNormal().getLenght());
        for(int i = 0; i<j;i++){
            //TODO Testen was passiert wenn die Randomzahl = Letztes Objekt in der Liste
            if(list.hasAccess()) {
                list.next();
            }
        }
        currentQuestion = list.getObject();
    }

    /**
     *
     */
    public void nextQuestion(String pAnswer){
        if(checkCorrect(pAnswer)){
            //Todo Money System einbauen & Überprüfung der Antwort
            count++;
            changeLVL();
            randomQuestion();
        }
    }

    public void changeLVL(){
        if(count == 5){
            setLvl(2);
        }else if(count == 10){
            setLvl(3);
        }
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
    public void setCurrentQuestion(Questions currentQuestion) {
        this.currentQuestion = currentQuestion;
    }
}
