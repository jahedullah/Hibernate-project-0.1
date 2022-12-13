package org.hibernate.OneToOne.CRUD;

import org.hibernate.OneToOne.entity.Question;
import org.hibernate.OneToOne.utils.HibernateUtils;
import org.hibernate.Session;

public class ReadApp {
    public static void main(String[] args){
        //initialize the session object
        Session session = HibernateUtils.getSessionFactory().openSession();


        Question q = (Question) session.get(Question.class, 103);
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswer().getAnswer());



    }
}
