package com.noid.backend;

public class Choice {

    private String texte;
    private int nextId;
    public Choice(String texte, int nextId) {
        this.texte = texte;
        this.nextId = nextId;
    }
    public String getTexte() {
        return texte;
    }
    public int getNextId() {
        return nextId;
    }
    public void setTexte(String texte) {
        this.texte = texte;
    }
    public void setNextId(int nextId) {
        this.nextId = nextId;
    }
}
