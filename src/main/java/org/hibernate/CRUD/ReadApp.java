package org.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.entity.Player;

import static org.hibernate.utils.HibernateUtils.getSessionFactory;

public class ReadApp {
    public static void main(String[] args){
        //initialize the session object
        Session session = getSessionFactory().openSession();

        Player player = session.load(Player.class, 12);

        System.out.println(player);

    }
}
