package org.hibernate;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        //create configuration
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        //create session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        //initialize the session object
        Session session = sessionFactory.openSession();

        Player player = new Player();
        player.setPlayerId(7);
        player.setPlayerName("Christiano");
        player.setPlayerOrigin("Portugal");

        session.save(player);

    }
}
