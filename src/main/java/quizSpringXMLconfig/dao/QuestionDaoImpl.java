package quizSpringXMLconfig.dao;

import quizSpringXMLconfig.model.Answer;
import quizSpringXMLconfig.model.Question;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuestionDaoImpl implements QuestionDao {


    private String fileName;

    public QuestionDaoImpl(String fileName) {

        this.fileName = fileName;
    }

    public List<Question> getQuestions() {

        List<Question> list = new ArrayList<>();
        ClassLoader classLoader = getClass().getClassLoader();
        List<String> lines =
                new BufferedReader(
                        new InputStreamReader(classLoader.getResourceAsStream(fileName)))
                        .lines()
                        .collect(Collectors.toList());

        for (int lineNum = 0; lineNum < lines.size(); lineNum++) {

            final String line = lines.get(lineNum);
            String[] elements = line.split(",");

            Question question = new Question();
            question.setText(elements[0]);
            question.setCorrectAnswer(Integer.parseInt(elements[elements.length - 1]));
            question.setAnswers(getAnswers(elements));

            list.add(question);
        }

        return list;
    }

    private List<Answer> getAnswers(String[] elements) {
        List<Answer> list = new ArrayList<>();
        for (int i = 1; i < elements.length - 1; i++) {
            list.add(new Answer(elements[i]));
        }
        return list;
    }
}