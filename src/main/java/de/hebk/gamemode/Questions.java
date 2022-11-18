package de.hebk.gamemode;
import java.util.Random;


public class Questions {
    private String question;
    private String[] answers = new String[4];
    private String correct;
    private int difficulty;


    public Questions(String pQuestion, String[] pAnswers, String pCorrect, int pDifficulty){
        setQuestion(pQuestion);
        setAnswers(pAnswers);
        setCorrect(pCorrect);
        setDifficulty(pDifficulty);
    }
    public boolean checkCorrect(String pAnswer){
        return pAnswer.equals(correct);
    }

    public void randomAnswers(){
        Random rand = new Random();
        for (int i = 0; i < getAnswers().length; i++) {
            int randomIndexToSwap = rand.nextInt(getAnswers().length);
            String temp = getAnswers()[randomIndexToSwap];
            getAnswers()[randomIndexToSwap] = getAnswers()[i];
            getAnswers()[i] = temp;
        }
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setAnswers(String[] answers) {
        this.answers = answers;
    }

    public String toString(){
        String ret = "";
        for(int i = 0; i < answers.length; i++){
            ret = ret + answers[i] + " ";
        }
        return ret;
    }
}
