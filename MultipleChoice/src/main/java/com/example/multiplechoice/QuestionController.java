package com.example.multiplechoice;

public class QuestionController {
    private Question model;
    private QuestionView view;
    public QuestionController(Question model, QuestionView view) {
        this.model = model;
        this.view = view;

        view.answerButtons[model.getCorrectAnswer()].selectedProperty().addListener
        ((observable, oldValue, newValue) -> {
            if (newValue) {
                System.out.println("Correct answer selected");
            } else {
                System.out.println("Incorrect answer selected");
            }
        });
    }
}