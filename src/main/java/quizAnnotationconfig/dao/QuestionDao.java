package quizAnnotationconfig.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import quizAnnotationconfig.model.Question;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class QuestionDao {

    private List<Question> questions;
    private List<String> questionsList;

    public QuestionDao(String path) {
        fillStringArr(path);
        parseQuastion();
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestionsAsString(String filePath) {
        questionsList = fillStringArr(filePath);
    }

    public void parseQuastion() {
        questions = new ArrayList<>();
        for (String s : questionsList) {
            String[] parsed = s.trim().split(",");
            Question q = new Question();
            q.setTextQuestion(parsed[0]);
            q.setCorrectAnswer(Integer.parseInt(parsed[parsed.length - 1]));
            List<String> answ = new ArrayList<>();
            for (int i = 1; i < (parsed.length - 1); i++) {
                answ.add(parsed[i]);
            }
            q.setAnswers(answ);
            questions.add(q);
        }

        int i = 1;
        for (Question question : questions) {
            System.out.println(i + ": " + question.toString());
            i++;
        }

    }

    private List<String> fillStringArr(String filePath) {
        List<String> lines = new ArrayList<String>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                lines.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        questionsList = lines;
        return questionsList;

    }
}