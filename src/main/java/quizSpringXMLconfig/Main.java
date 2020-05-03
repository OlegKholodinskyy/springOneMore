package quizSpringXMLconfig;


import org.springframework.context.support.ClassPathXmlApplicationContext;
import quizSpringXMLconfig.service.TestingService;

public class Main {
    public static void main(String[] args)  {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        TestingService service = context.getBean(TestingService.class);
        service.startTest();
    }
}