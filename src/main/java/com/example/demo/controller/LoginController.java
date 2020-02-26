package com.example.demo.controller;

import com.example.demo.DBConnect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.*;
import java.sql.*;
import java.util.Properties;

@Controller
public class LoginController {
    @Autowired
    private DBConnect _db;

    @RequestMapping("login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");
        return mv;
    }

    @PostMapping("/login")
    private @ResponseBody void login(@RequestParam("Firstname") String Firstname, @RequestParam("id") String id) {
        try {
            Properties info = new Properties();
            String url;
            url = "jdbc:mysql://localhost:3306/voting";
            info.put("user", "root");
            info.put("password", "admin");
            Connection conn = DriverManager.getConnection(url, info);

            if (Firstname != null && id != null) {
                String sql = "SELECT * FROM User WHERE Firstname='" + Firstname + "' AND Id_Number='" + id + "'";
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet mRes = stmt.executeQuery(sql);
                if (mRes.next()) {
                    System.out.println(Firstname);
                }
                else System.out.println("failed");
            }
        }
        catch (Exception exp) {
            throw new RuntimeException(exp);
        }finally {
            //
        }
        return ;
    }
}
