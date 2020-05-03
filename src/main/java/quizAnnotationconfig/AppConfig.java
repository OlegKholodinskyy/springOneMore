package quizAnnotationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import quizAnnotationconfig.model.Question;
import quizAnnotationconfig.service.QuestionService;

@Configuration
public class AppConfig {

    @Bean
    public Question q() {
        return new Question ();
    }

    @Bean
    public quizAnnotationconfig.dao.QuestionDao questionDao() {
        return new quizAnnotationconfig.dao.QuestionDao ("./src/main/resources/questions.csv");
    }

    @Bean
    public QuestionService questionService() {
        return new QuestionService  ("./src/main/resources/questions.csv");
    }

}