package de.hebk.gamemode;

import de.hebk.gamemode.Gamemode;

import java.util.Random;

public class ModeSurvive extends Gamemode {

    private Questions currentQuestion;
    private int count = 0;
    /**
     * Konstruktor
     */
    public ModeSurvive() {setModeSurvive(getModeSurvive());}
    @Override
    /**
     * Da der Gamemode Joker hat, wird diese Methode nicht verwendet
     */
    public void useJoker(int pInput) {
    }

    @Override
    /**
     * starten den Gamemode
     */
    public void start() {
        if (currentQuestion != null) {
            modeSurvive.pop();
        }
        setCurrentQuestion(modeSurvive.top());
        currentQuestion.randomAnswers();
    }

    @Override
    /**
     * Da der Gamemode Joker hat, wird diese Methode nicht verwendet
     */
    public void jokerHinzufuegen(Joker pJoker) {

    }

    @Override
    /**
     * überprüft den Parameter, ob dieser gleich ist wie die korrekte Antwort der momentanen Frage
     */
    public boolean checkcorrect(String pAnswer) {
        return pAnswer.equals(currentQuestion.getCorrect());
    }

    @Override
    /**
     *
     */
    public void randomQuestion(String pContext) {


    }

    @Override
    /**
     * nöchste Frage
     */
    public void nextQuestion() {
        modeSurvive.pop();
        count++;
    }

    @Override
    /**
     * liefert die momentane Frage zurück
     */
    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    @Override
    /**
     * setzt die momentan Frage
     */
    public void setCurrentQuestion(Questions pCurrentQuestion) {
        currentQuestion=pCurrentQuestion;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
