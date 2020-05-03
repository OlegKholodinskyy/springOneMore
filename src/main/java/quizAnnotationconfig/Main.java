package quizAnnotationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import quizAnnotationconfig.service.QuestionService;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean(QuestionService.class).startTest();
    }
}
