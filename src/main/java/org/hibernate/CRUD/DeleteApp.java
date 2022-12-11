package org.hibernate.CRUD;

import org.hibernate.Session;
import org.hibernate.entity.Player;
import static org.hibernate.utils.HibernateUtils.getSessionFactory;

public class DeleteApp {
    public static void main(String[] args){
        Session session = getSessionFactory().openSession();

        Player player = session.get(Player.class, 10);

        session.beginTransaction();
        session.delete(player);
        session.getTransaction().commit();
        session.close();

    }

}
