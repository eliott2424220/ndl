package com.noid.backend;

public class Question {

    public void setQuestion(String question) {
        this.question = question;
    }
    private String question;
    private Choice[] choices;

    public Question(String question, Choice[] choices) {
        this.question = question;
        this.choices = choices;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestions(String question) {
        this.question = question;
    }

    public Choice[] getChoices() {
        return choices;
    }

    public void setChoices(Choice[] choices) {
        this.choices = choices;
    }

    public void setChoiceIndex(int index,Choice reponse) {
        this.choices[index] = reponse;
    }
}
