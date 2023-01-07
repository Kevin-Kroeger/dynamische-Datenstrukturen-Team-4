package de.hebk.gamemode;

import de.hebk.gamemode.Gamemode;

import java.util.Random;

public class ModeSurvive extends Gamemode {

    private Questions currentQuestion;
    public ModeSurvive() {setModeSurvive(getModeSurvive());}
    @Override
    public void useJoker(int pInput) {

    }

    @Override
    public void start() {
        if (currentQuestion != null) {
            modeSurvive.pop();
        }
        setCurrentQuestion(modeSurvive.top());
        currentQuestion.randomAnswers();
    }

    @Override
    public void jokerHinzufuegen(Joker pJoker) {

    }

    @Override
    public boolean checkcorrect(String pAnswer) {
        return pAnswer.equals(currentQuestion.getCorrect());
    }



    @Override
    public void randomQuestion() {
        // Nicht für Stack Anwendbar
    }




    @Override
    public void nextQuestion() {
        modeSurvive.pop();
    }

    @Override
    public Questions getCurrentQuestion() {
        return currentQuestion;
    }

    @Override
    public void setCurrentQuestion(Questions pCurrentQuestion) {
        currentQuestion=pCurrentQuestion;
    }
}
