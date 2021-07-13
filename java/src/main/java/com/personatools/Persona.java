package com.personatools;

public class Persona {

    private String personaName;
    private String personaArcana;
    private int personaLevel;

    public Persona() {};

    public Persona(String personaName, String personaArcana, int personaLevel) {
        this.personaName = personaName;
        this.personaArcana = personaArcana;
        this.personaLevel = personaLevel;
    }

    public String getPersonaName() {
        return personaName;
    }

    public String getPersonaArcana() {
        return personaArcana;
    }

    public int getPersonaLevel() {
        return personaLevel;
    }

    public void setPersonaName(String personaName) {
        this.personaName = personaName;
    }

    public void setPersonaArcana(String personaArcana) {
        this.personaArcana = personaArcana;
    }

    public void setPersonaLevel(int personaLevel) {
        this.personaLevel = personaLevel;
    }
}
