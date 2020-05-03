package quizSpringXMLconfig.service;

import quizSpringXMLconfig.model.Person;
import quizSpringXMLconfig.model.Question;

import java.util.List;
import java.util.Scanner;

public class TestingServiceImpl implements TestingService {
    private QuestionService questionService;

    public TestingServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public void startTest()  {
        System.out.println("Имя:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        System.out.println("Фамилия:");

        String surName = scanner.nextLine();
        Person person = new Person(name, surName);

        System.out.println("Начинаем тест.");
        int score = 0;
        List<Question> list = questionService.getQuestions();
        for (Question question : list) {
            System.out.println(question.getText());

            for (int i = 0; i < question.getAnswers().size(); i++) {
                System.out.println(i + 1 + ". " + question.getAnswers().get(i).getText());
            }
            int userAnswer;

            do {
                System.out.println("Введите номер ответа: ");
                userAnswer = scanner.nextInt();
            } while ((userAnswer < 1) || (userAnswer > question.getAnswers().size()));
            if (userAnswer == question.getCorrectAnswer())
                score++;

        }
        System.out.println("Итоговый балл:" + score);

    }
}