package quizSpringXMLconfig.dao;

import quizSpringXMLconfig.model.Question;

import java.util.List;

public interface QuestionDao {
    List<Question> getQuestions();
}