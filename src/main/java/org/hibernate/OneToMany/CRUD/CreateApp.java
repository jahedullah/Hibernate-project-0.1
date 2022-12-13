package org.hibernate.OneToMany.CRUD;

import org.hibernate.OneToMany.entity.Answer;
import org.hibernate.OneToMany.entity.Question;
import org.hibernate.OneToMany.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class CreateApp {
    public static void main(String[] args) {

        //initialize the session object
        Session session = HibernateUtils.getSessionFactory().openSession();


//        Question question = new Question();
//        question.setId(103);
//        question.setQuestion("What is Python?");
//
//        Answer answer = new Answer();
//        answer.setaId(301);
//        answer.setAnswer("Python is a Programming Language.");
//        answer.setQuestion(question);
//
//        Answer answer1 = new Answer();
//        answer1.setaId(302);
//        answer1.setAnswer("It is One of the most famous Languages.");
//        answer1.setQuestion(question);
//
//        Answer answer2 = new Answer();
//        answer2.setaId(303);
//        answer2.setAnswer("It is Growing So fast");
//        answer2.setQuestion(question);
//
//        List<Answer> answers = new ArrayList<Answer>();
//        answers.add(answer);
//        answers.add(answer1);
//        answers.add(answer2);
//
//        question.setAnswers(answers);
//
        session.beginTransaction();
//        session.save(question);
//        session.save(answer);
//        session.save(answer1);
//        session.save(answer2);


        Question q = (Question) session.load(Question.class, 103);


//        System.out.println(q.getAnswers());
//        for(Answer a: q.getAnswers()){
//            System.out.println(a.getAnswer());
//
//        }

        q.setQuestion("What is updated Python?");
        q.setQuestion("What is updated >> Python?");
        q.setQuestion("What is updated >>>>>> Python?");
        System.out.println(q.getQuestion());
        session.getTransaction().commit();



        session.close();


    }
}
