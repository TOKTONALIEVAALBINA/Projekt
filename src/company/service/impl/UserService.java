package company.service.impl;

import company.model.User;

public interface UserService {
    User findById(int id);

    void addAllUsers(User user);

    void removeById(int id);

    void getAllUsers();
}
