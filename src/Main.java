import company.dao.UserDao;
import company.model.Gender;
import company.model.User;
import company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User("albina", 24, 1, Gender.FEMALE);
        User user1 = new User("Oleg", 28, 2, Gender.MALE);
        User user2 = new User("Anna", 23, 3, Gender.FEMALE);

        UserServiceImpl userService = new UserServiceImpl();
        userService.addAllUsers(user);
        userService.addAllUsers(user1);
        userService.addAllUsers(user2);

        System.out.println(userService.findById(3));


        //userService.removeById(3);
        userService.getAllUsers();


    }
}