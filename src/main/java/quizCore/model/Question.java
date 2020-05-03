package quizCore.model;

import java.util.List;

public class Question {

    private String textQuestion;
    private List<String> answers;
    private int correctAnswer;

    public String getTextQuestion() {
        return textQuestion;
    }

    public void setTextQuestion(String textQuestion) {
        this.textQuestion = textQuestion;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "Question{"  + textQuestion +
                ", answers=" + answers +
                ", correctAnswer='" + correctAnswer + '\'' +
                '}';
    }
}
