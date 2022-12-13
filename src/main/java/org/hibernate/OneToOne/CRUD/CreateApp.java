package org.hibernate.OneToOne.CRUD;

import org.hibernate.OneToOne.entity.Answer;
import org.hibernate.OneToOne.entity.Question;
import org.hibernate.OneToOne.utils.HibernateUtils;
import org.hibernate.Session;

public class CreateApp {
    public static void main(String[] args) {

        //initialize the session object
        Session session = HibernateUtils.getSessionFactory().openSession();


        Question question = new Question();
        question.setqId(103);
        question.setQuestion("What is Python");

        Answer answer = new Answer();
        answer.setaId(1003);
        answer.setAnswer("Python is a Programming Language.");

        answer.setQuestion(question);
        question.setAnswer(answer);

        Question question1 = new Question();
        question1.setqId(203);
        question1.setQuestion("What is Laravel?");

        Answer answer1 = new Answer();
        answer1.setaId(2003);
        answer1.setAnswer("Laravel is a framework.");


        answer1.setQuestion(question1);
        question1.setAnswer(answer1);



        session.beginTransaction();
        session.save(question);
        session.save(question1);

        session.save(answer);
        session.save(answer1);


        session.getTransaction().commit();


        Question q = (Question) session.get(Question.class, 301);
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().getAnswer());

        session.close();

        System.out.println("Your Data has been saved.");

    }
}
