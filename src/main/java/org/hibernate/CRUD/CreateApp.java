package org.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.entity.Team;

import static org.hibernate.utils.HibernateUtils.getSessionFactory;

public class CreateApp {
    public static void main(String[] args) {

        //initialize the session object
        Session session = getSessionFactory().openSession();



        Team team = new Team("Qatar","Qatar Coach");

        session.beginTransaction();
        session.save(team);
        session.getTransaction().commit();
        session.close();

        System.out.println("Team Info is Saved.");







        System.out.println("Your Player Info is saved.");

    }
}
