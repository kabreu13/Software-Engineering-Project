package com.example.multiplechoice;

import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.VBox;

public class QuestionView extends VBox {
    private Label questionLabel;
    RadioButton[] answerButtons;
    public QuestionView(Question question) {
        questionLabel = new Label(question.getQuestion());
        answerButtons = new RadioButton[question.getAnswers().length];
        for (int i = 0; i < answerButtons.length; i++) {
            answerButtons[i] = new RadioButton(question.getAnswers()[i]);
        }
        getChildren().add(questionLabel);
        getChildren().addAll(answerButtons);
    }
}