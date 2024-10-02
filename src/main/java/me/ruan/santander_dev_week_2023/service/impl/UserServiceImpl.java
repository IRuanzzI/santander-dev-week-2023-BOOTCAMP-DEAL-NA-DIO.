package me.ruan.santander_dev_week_2023.service.impl;

import me.ruan.santander_dev_week_2023.model.User;
import me.ruan.santander_dev_week_2023.repository.UserRepository;
import me.ruan.santander_dev_week_2023.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(long id) throws NoSuchMethodException {
        return userRepository.findById(id).orElseThrow(NoSuchMethodException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
            throw new RuntimeException("Usuário existente!");
        }else{
            return userRepository.save(userToCreate);
        }
    }
}
