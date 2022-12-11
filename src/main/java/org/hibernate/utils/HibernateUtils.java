package org.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.entity.Player;
import org.hibernate.entity.Team;

//Make the class Singleton so that it returns the same object always.
public class HibernateUtils {

    private static SessionFactory sessionFactory = null;

    public static SessionFactory getSessionFactory() {
        //create configuration
        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Player.class);
            configuration.addAnnotatedClass(Team.class);

            //create session factory
            sessionFactory = configuration.buildSessionFactory();
        }
        return sessionFactory;
    }
}
