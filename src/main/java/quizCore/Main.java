package quizCore;

import quizCore.dao.QuestionDao;
import quizCore.model.Question;
import quizCore.service.QuestionService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        QuestionService questionService = new QuestionService("./src/main/resources/questions.csv");

        questionService.startTest();
    }
}
