package com.company;

import java.util.Scanner;

public class MultipleChoise extends Question {
    static String question1 = "What color is the sky?" + "\na.red\nb.blue\nc.black\nd.yellow";

    public MultipleChoise(String aQuestion, String aAnswer){
        super(aQuestion,aAnswer);

    }
    static Question[] questions = {
            new MultipleChoise(question1, "b")

    };

    public static void quiz(Question[] questions){

        Scanner input = new Scanner(System.in);
        int score =0;
        for(int i =0; i< questions.length;i++){

            System.out.println(questions[i].question);
            String answer = input.nextLine();
            if(answer.equals(questions[i].answer)){
                score++;
            }
        }
        System.out.println(score + "/" + questions.length);
    }

    public static void main(String[] args){

        MultipleChoise.quiz(questions);
    }
}
