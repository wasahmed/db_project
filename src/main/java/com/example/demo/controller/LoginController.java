package com.example.demo.controller;

import com.example.demo.DBConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import java.sql.*;
import java.util.Properties;

@Controller
public class LoginController {
    @Autowired
    private DBConnect _db;

    @GetMapping(path="/register")
    public ModelAndView GetRegister() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("register");
        return mav;
    }

    @PostMapping(path="/register")
    public ModelAndView addNewUser (@RequestParam("Firstname") String firstname, @RequestParam("Surname") String surname,
                            @RequestParam("Id_Number") String idnum, @RequestParam("Race") String race,
                            @RequestParam("Gender") String gender,@RequestParam("Province") String province)
    {
        _db.excuteQuery("INSERT INTO User (`Firstname`, `Surname`, `Id_Number`, `Gender`, `Race`, `Province`)" +
                "VALUES ('" + firstname +"','" + surname+"','" + idnum+"','"+ gender+"','"+ race+"','" +province+"')");
        System.out.println(firstname);
        return new ModelAndView("redirect:/login");
    }

    @RequestMapping("login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @PostMapping("/login")
    private @ResponseBody ModelAndView login(@RequestParam("Firstname") String Firstname, @RequestParam("id") String id, HttpServletRequest req, HttpServletResponse res) {
        try {
            Properties info = new Properties();
            String url;
            url = "jdbc:mysql://localhost:3306/voting";
            info.put("user", "root");
            info.put("password", "root");
            Connection conn = DriverManager.getConnection(url, info);

            if (Firstname != null && id != null) {
                String sql = "SELECT * FROM User WHERE Firstname='" + Firstname + "' AND Id_Number='" + id + "'";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet mRes = stmt.executeQuery(sql);
                if (mRes.next()) {
                    System.out.println(Firstname);
                    Cookie loginCookie = new Cookie("user",mRes.getString("User_Id"));
                    loginCookie.setMaxAge(30*60);
                    res.addCookie(loginCookie);
                }
                else{
                    System.out.println("failed");
                    new ModelAndView("redirect:/register");
                }
            }
        }
        catch (Exception exp) {
            throw new RuntimeException(exp);
        }finally {
            //
        }
        return new ModelAndView("redirect:/vote");
    }
}
