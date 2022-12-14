package de.hebk.gamemode;


import de.hebk.model.list.List;
import de.hebk.model.queue.Queue;
import de.hebk.model.stack.Stack;

public abstract class Gamemode {
    private Joker[] joker = new Joker[3];
    public List<Questions> modeNormal;
    public Stack<Questions> modeSurvive;
    private Queue<Questions> modeJeopardy;




    public abstract void useJoker(int pInput);

    public abstract void start();

    public abstract void jokerHinzufuegen(Joker pJoker);

    public abstract boolean checkcorrect(String pAnswer);
    public abstract void randomQuestion();

    public abstract void nextQuestion();


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

    public abstract Questions getCurrentQuestion();
    public abstract void setCurrentQuestion(Questions currentQuestion);
}

