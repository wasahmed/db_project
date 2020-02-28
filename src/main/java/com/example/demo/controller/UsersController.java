package com.example.demo.controller;
import com.example.demo.Service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.model.User;
public class UsersController {
    @Autowired
    UserService userService;

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public ModelAndView list() {
        ModelAndView model = new ModelAndView("User_list");
        List<User> usersList = userService.getAllUsers();
        model.addObject("User_list", usersList);

        return model;
    }

    @RequestMapping(value="/updateForm/{id}", method=RequestMethod.GET)
    public ModelAndView editUser(@PathVariable int User_Id) {
        ModelAndView model = new ModelAndView();

        User user = userService.getUserById(User_Id);
        model.addObject("UserForm", user);
        model.setViewName("User_form");

        return model;
    }

    @RequestMapping(value="/saveUser", method=RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("UserForm") User user) {
        userService.saveOrUpdate(user);

        return new ModelAndView("redirect:/users/list");
    }

//    @RequestMapping(value="/deleteArticle/{id}", method=RequestMethod.GET)
//    public ModelAndView delete(@PathVariable("id") long id) {
//        userService.DeleteUser(User_Id);
//
//        return new ModelAndView("redirect:/article/list");
//    }
}


