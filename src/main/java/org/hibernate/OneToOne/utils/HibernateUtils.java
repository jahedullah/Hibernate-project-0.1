package org.hibernate.OneToOne.utils;

import org.hibernate.OneToOne.entity.Answer;
import org.hibernate.OneToOne.entity.Question;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//Make the class Singleton so that it returns the same object always.
public class HibernateUtils {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        //create configuration
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Answer.class);
            configuration.addAnnotatedClass(Question.class);

            //create session factory
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
