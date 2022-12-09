package de.hebk.gamemode;


import de.hebk.model.list.List;
import de.hebk.model.queue.Queue;
import de.hebk.model.stack.Stack;

public abstract class Gamemode {
    private Joker[] joker = new Joker[3];
    public List<Questions> modeNormal;
    public Stack<Questions> modeSurvive;
    private Queue<Questions> modeJeopardy;


    public void useJoker(int pInput){
        if(joker[pInput] != null) {
            if(joker[pInput].getName().equals("fiftyfifty")){
                joker[pInput] = null;
            }else if(joker[pInput].getName().equals("telephone")){
                joker[pInput] = null;
            }else if(joker[pInput].getName().equals("audience")){
                joker[pInput] = null;
            }

        }
    }

    public abstract void start();

    public void jokerHinzufuegen(Joker pJoker){
        for(int i = 0; i < joker.length; i++){
            if(joker[i] == null);{
                joker[i] = pJoker;
                return;
            }
        }
    }

    public Joker[] getJoker() {
        return joker;
    }

    public void setJoker(Joker[] joker) {
        this.joker = joker;
    }

    public List<Questions> getModeNormal() {
        return modeNormal;
    }

    public void setModeNormal(List<Questions> modeNormal) {
        this.modeNormal = modeNormal;
    }

    public Stack<Questions> getModeSurvive() {
        return modeSurvive;
    }

    public void setModeSurvive(Stack<Questions> modeSurvive) {
        this.modeSurvive = modeSurvive;
    }

    public Queue<Questions> getModeJeopardy() {
        return modeJeopardy;
    }

    public void setModeJeopardy(Queue<Questions> modeJeopardy) {
        this.modeJeopardy = modeJeopardy;
    }
}

