package com.example.springapi.service;

import com.example.springapi.model.User;
import com.example.springapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService
{
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

    public void addUser(User user)
    {
        userRepository.insert(user);
    }

    public void updateUser(User user)
    {
        User savedUser = userRepository.findById(user.get_id())
                .orElseThrow(() -> new RuntimeException(
                        String.format("Cannot Find User by ID %s", user.get_id())));
        savedUser.setFirstName(user.getFirstName());
        savedUser.setLastName(user.getLastName());
        savedUser.setJob(user.getJob());
        savedUser.setCompany(user.getCompany());

        userRepository.save(user);
    }

    public List<User> getAllUsers()
    {
        return userRepository.findAll();
    }

    public User getUserByName(String name)
    {
        return userRepository.findByName(name)
                .orElseThrow(() -> new RuntimeException(String.format("Cannot Find Expense by Name - %s", name)));
    }


    public void deleteUser(String _id)
    {
        userRepository.deleteById(_id);
    }
}
