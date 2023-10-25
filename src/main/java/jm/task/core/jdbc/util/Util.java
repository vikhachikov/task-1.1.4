package jm.task.core.jdbc.util;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class Util {
    // реализуйте настройку соеденения с БД
    private static SessionFactory factory;

    public Util() {
    }
    public static SessionFactory getConnection() {
        factory = new Configuration().addAnnotatedClass(User.class).buildSessionFactory();
        return factory;
    }
    public static void closeConnection() {
        if (factory != null)
            factory.close();
    }
}
