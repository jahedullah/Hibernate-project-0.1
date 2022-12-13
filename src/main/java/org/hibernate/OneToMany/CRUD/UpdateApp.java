package org.hibernate.OneToMany.CRUD;

import org.hibernate.OneToMany.entity.Player;
import org.hibernate.OneToMany.utils.HibernateUtils;
import org.hibernate.Session;

//Remember for update and Create you have to always create a transaction.
public class UpdateApp {
    public static void main(String[] args){
        //initialize the session object
        Session session = HibernateUtils.getSessionFactory().openSession();

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
