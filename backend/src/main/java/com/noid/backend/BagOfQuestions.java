package com.noid.backend;

import java.util.HashMap;
import java.util.Map;

public class BagOfQuestions {

    private int compteur=0;
    private Map<Integer, Question> questionsMap;
    public BagOfQuestions() {
        questionsMap = new HashMap<>();
    }

    public Map<Integer, Question> getQuestionsMap() {
        return questionsMap;
    }

    public void addQuestion(Question question) {
        questionsMap.put(compteur, question);
        this.compteur++;
    }

    public Question getQuestion(int id) {
        return questionsMap.get(id);
    }

    public void setQuestionsMap(Map<Integer, Question> questionsMap) {
        questionsMap = questionsMap;
    }

    public int removeQuestion(int id) {
        try{
            questionsMap.remove(id);
            return 0;
        }catch(NullPointerException e){
            return -1;
        }
    }
}
