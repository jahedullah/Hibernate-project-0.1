package org.hibernate.OneToMany.CRUD;

import org.hibernate.OneToMany.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.OneToMany.entity.Question;

public class ReadApp {
    public static void main(String[] args){
        //initialize the session object
        Session session = HibernateUtils.getSessionFactory().openSession();


        Question q = (Question) session.get(Question.class, 103);
        System.out.println(q.getQuestion());
        System.out.println(q.getAnswers());



    }
}
