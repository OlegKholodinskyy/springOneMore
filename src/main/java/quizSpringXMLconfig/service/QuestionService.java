package quizSpringXMLconfig.service;

import quizSpringXMLconfig.model.Question;

import java.util.List;

public interface QuestionService {
    List<Question> getQuestions();
}