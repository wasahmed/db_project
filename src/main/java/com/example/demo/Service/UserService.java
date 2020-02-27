package com.example.demo.Service;
import java.util.List;
import com.example.demo.model.User;
public interface UserService {

    public List<User> getAllUsers();

    public User getUserById(int User_Id);

    public void saveOrUpdate(User user);

    public void deleteUser(int User_Id);
}
