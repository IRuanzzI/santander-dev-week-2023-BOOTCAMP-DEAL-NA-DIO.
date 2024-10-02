package me.ruan.santander_dev_week_2023.service;

import me.ruan.santander_dev_week_2023.model.User;

public interface UserService {
    User findById(long id) throws NoSuchMethodException;

    User create(User userToCreate);


}
