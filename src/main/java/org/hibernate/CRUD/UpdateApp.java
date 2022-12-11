package org.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.entity.Player;

import static org.hibernate.utils.HibernateUtils.getSessionFactory;

//Remember for update and Create you have to always create a transaction.
public class UpdateApp {
    public static void main(String[] args){
        //initialize the session object
        Session session = getSessionFactory().openSession();

        Player player = session.get(Player.class, 12);
        //Instead of writting the above line please get the same object of the current stored data.

        player.setPlayerName("Dombani");

        session.beginTransaction();
        session.update(player);
        session.getTransaction().commit();
        session.close();

        //Very Interesting thing -- See you have overriden the data instead of updating.
        //There is a null value in the entity field thats because the Object is not the same.
        //See the updated portion above

    }
}
