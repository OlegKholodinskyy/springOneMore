package quizSpringXMLconfig.model;


import java.util.List;

public class Question {


    private String text;
    private List<Answer> answers;
    private int correctAnswer;

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}