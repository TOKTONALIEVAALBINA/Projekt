package company.service.impl;

import company.dao.UserDao;
import company.model.MyException;
import company.model.User;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDao();

    @Override
    public User findById(int id) {
        //userDao.getUsers().stream().filter(x-> x.getId() == id).findFirst().orElseThrow();

        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                return user;
            } else throw new MyException("id is not found! ");
        }
        return null;
    }

    @Override
    public void addAllUsers(User user) {
        userDao.getUsers().add(user);
        System.out.println("user successfully add! ");
    }

    @Override
    public void removeById(int id) {
        for (User user : userDao.getUsers()) {
            if (user.getId() == id) {
                userDao.getUsers().remove(user);
            }
        }
    }


    @Override
    public void getAllUsers() {
        for (User user : userDao.getUsers()) {
            System.out.println(user);
        }
    }

}
