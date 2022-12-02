package de.hebk.gamemode;

import de.hebk.model.list.List;
import de.hebk.model.node.Node;

import java.util.Random;

public class ModeNormal extends Gamemode {

    private List<Questions> questions;
    private int money;
    private int lvl;

    public ModeNormal(List<Questions> pList){
        setQuestions(pList);
        setLvl(1);
    }

    /**
     * 
     * @return
     */
    public Questions randomQuestion(){
        Random rand = new Random();
        List<Questions> list = new List<>();
        questions.toFirst();
        while(questions.getObject().getDifficulty() == lvl){
            list.append(questions.getObject());
            questions.remove();
        }
        //List enthällt jetzt nur Fragen der jeweilligen Schwierigkeitsstufe
        list.toFirst();
        int j = rand.nextInt(list.getLenght());
        for(int i = 0; i<j;i++){
            //TODO Testen was passiert wenn die Randomzahl = Letztes Objekt in der Liste
            if(list.hasAccess()) {
                list.next();
            }
        }
        return list.getObject();
    }

    public void nextQuestion(){

    }

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

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
