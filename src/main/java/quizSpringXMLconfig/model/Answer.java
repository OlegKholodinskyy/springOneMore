package quizSpringXMLconfig.model;

public class Answer {
    public Answer(String text){
        this.text=text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String  text;

}
