package com.example.multiplechoice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class MultipleChoiceQuestion extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Question model = new Question("What is 2 x 18",
                new String[]{"36", "38", "20", "12"},
                0);
        QuestionView view = new QuestionView(model);
        QuestionController controller = new QuestionController(model,
                view);
        stage.setScene(new Scene(view));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}