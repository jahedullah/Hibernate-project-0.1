package org.hibernate.OneToMany.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.OneToMany.entity.Answer;
import org.hibernate.OneToMany.entity.Question;

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
