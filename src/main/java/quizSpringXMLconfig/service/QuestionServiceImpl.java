package quizSpringXMLconfig.service;

import quizSpringXMLconfig.dao.QuestionDao;
import quizSpringXMLconfig.model.Question;

import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    QuestionDao questionDao;

    public QuestionServiceImpl(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public List<Question> getQuestions()  {

        return questionDao.getQuestions();
    }
}