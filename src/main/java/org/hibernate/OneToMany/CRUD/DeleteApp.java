package org.hibernate.OneToMany.CRUD;

import org.hibernate.OneToMany.entity.Player;
import org.hibernate.OneToMany.utils.HibernateUtils;
import org.hibernate.Session;

public class DeleteApp {
    public static void main(String[] args){
        Session session = HibernateUtils.getSessionFactory().openSession();

        Player player = session.get(Player.class, 10);

        session.beginTransaction();
        session.delete(player);
        session.getTransaction().commit();
        session.close();

    }

}
