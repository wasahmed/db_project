package com.example.demo.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.demo.model.User;
import com.example.demo.model.UserRepository;
@Service
@Transactional
public class UserServiceImpl {
    @Autowired
    UserRepository UserRepository;


    public List<User> getAllUsers() {
        return (List<User>) UserRepository.findAll();
    }


    public User geUserById(int User_Id) {
        return UserRepository.findById((int) User_Id).get();
    }


    public void saveOrUpdate(User user) {
        UserRepository.save(user);
    }


    public void deleteArticle(int User_Id) {
        UserRepository.deleteById((int) User_Id);
    }
}
