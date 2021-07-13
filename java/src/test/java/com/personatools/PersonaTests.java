package com.personatools;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTests {

    @Test
    public void getPersonaName_returns_correct_value() {
        Persona persona = new Persona("Loki", "Fool", 64);
        String expected = "Loki";

        String result = persona.getPersonaName();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getPersonaArcana_returns_correct_value() {
        Persona persona = new Persona("Loki", "Fool", 64);
        String expected = "Fool";

        String result = persona.getPersonaArcana();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void getPersonaLevel_returns_correct_value() {
        Persona persona = new Persona("Loki", "Fool", 64);
        int expected = 64;

        int result = persona.getPersonaLevel();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void setPersonaName_returns_correct_value() {
        Persona persona = new Persona();
        String expected = "Thor";

        persona.setPersonaName("Thor");

        String result = persona.getPersonaName();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void setPersonaArcana_returns_correct_value() {
        Persona persona = new Persona();
        String expected = "Chariot";

        persona.setPersonaArcana("Chariot");

        String result = persona.getPersonaArcana();

        Assert.assertEquals(expected, result);
    }

    @Test
    public void setPersonaLevel_returns_correct_value() {
        Persona persona = new Persona();
        int expected = 65;

        persona.setPersonaLevel(65);

        int result = persona.getPersonaLevel();

        Assert.assertEquals(expected, result);
    }

}
