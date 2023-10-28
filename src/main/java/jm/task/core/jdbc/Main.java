package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Vik", "Kaneki", (byte) 22);
        userService.saveUser("Zak", "Shelby", (byte) 21);
        userService.saveUser("Lolly", "Candy", (byte) 18);
        userService.saveUser("Tom", "Hiber", (byte) 25);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
