package quizCore.service;

import quizCore.dao.QuestionDao;
import quizCore.model.Question;

import java.util.Scanner;

public class QuestionService {
    QuestionDao questionDao;

    public QuestionService(String path) {
        this.questionDao = new QuestionDao(path);
    }


    public void startTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Имя:");
        String name = scanner.nextLine();


        System.out.println("Фамилия:");
        String surName = scanner.nextLine();

        for (Question q : questionDao.getQuestions()) {
            System.out.println(q.getTextQuestion());
            int i = 1;
            for (String answ : q.getAnswers()) {
                System.out.println(i + " " + answ);
                i++;
            }
            int userAnswer = scanner.nextInt();
            if (q.getCorrectAnswer() == userAnswer) {
                System.out.println("YESSS!!!!");
            }
        }
    }
}
