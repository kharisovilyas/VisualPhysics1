package com.example.visualphysics;

import java.util.Map;

public class Question {
    private final String text;
    private final Map<String, NextStep> answers;

    public Question(String text, Map<String, NextStep> answers) {
        this.text = text;
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public String[] getAnswers(){
        return answers.keySet().toArray(new String[0]);
    }

    public NextStep getNextStep(String answer){
        return answers.get(answer);
    }

    private class NextStep {
        private Question question;
        private Characteristics delta;
    }
}
