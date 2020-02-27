package com.example.demo.controller;

import com.example.demo.DBConnect;
import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Properties;

@Controller
public class VoteController {

    @Autowired
    private DBConnect _db;

    @RequestMapping("vote")
    public ModelAndView vote(HttpServletRequest req) {
        Cookie[] cookies= req.getCookies();
        String user = null;
        for (Cookie temp : cookies){
            if (temp.getName().equals("user")) {
                user = temp.getValue();
            }
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("user", user);
        mv.setViewName("vote");
        return mv;
    }

    @PostMapping("vote")
    public ModelAndView AddVote(@RequestParam("user_id") String user_id, @RequestParam("party") String party) {
        if (user_id != null && party != null) {
            System.out.println("INSERT INTO votes (`party`,`user_id`) VALUES ('"+party+"', "+user_id+");");
            _db.excuteQuery("INSERT INTO votes (`party`,`user_id`) VALUES ('"+party+"', "+user_id+");");
        }
        System.out.println(user_id);
        return new ModelAndView("redirect:/voteresults");
    }

    @RequestMapping("voteresults")
    public ModelAndView voteresults() throws SQLException {
        Properties info = new Properties();
        String url;
        url = "jdbc:mysql://localhost:3306/voting";
        info.put("user", "root");
        info.put("password", "root");
        Connection conn = DriverManager.getConnection(url, info);
        String sql = "SELECT  party, count(*) as numOfVotes from votes GROUP BY party";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet mRes = stmt.executeQuery(sql);
        int DA = 0;
        int ANC = 0;
        int EFF = 0;
        int IFP = 0;
        int SACP = 0;
        while (mRes.next()){
            String name = mRes.getString("party");
            int noOfVotes = mRes.getInt("numOfVotes");
            switch (name){
                case "DA":
                    DA = noOfVotes;
                    break;
                case "ANC":
                    ANC = noOfVotes;
                    break;
                case "EFF":
                    EFF = noOfVotes;
                    break;
                case "IFP":
                    IFP = noOfVotes;
                    break;
                case "SACP":
                    SACP = noOfVotes;
                    break;
                default:
                    System.out.println(name);
            }
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("voteresults");
        mv.addObject("ANC", ANC);
        mv.addObject("DA", DA);
        mv.addObject("EFF", EFF);
        mv.addObject("IFP", IFP);
        mv.addObject("SACP", SACP);
        return mv;
    }

    @RequestMapping("voteresultsProv")
    public ModelAndView voteResultsProvince(@RequestParam String prov) throws SQLException {
        Properties info = new Properties();
        String url;
        url = "jdbc:mysql://localhost:3306/voting";
        info.put("user", "root");
        info.put("password", "root");
        Connection conn = DriverManager.getConnection(url, info);
        String sql = "SELECT  votes.party, count(*) as numOfVotes from votes INNER JOIN user ON votes.User_ID = user.User_Id WHERE user.Province = '"+prov+"' GROUP BY party";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet mRes = stmt.executeQuery(sql);
        int DA = 0;
        int ANC = 0;
        int EFF = 0;
        int IFP = 0;
        int SACP = 0;
        while (mRes.next()){
            String name = mRes.getString("party");
            int noOfVotes = mRes.getInt("numOfVotes");
            switch (name){
                case "DA":
                    DA = noOfVotes;
                    break;
                case "ANC":
                    ANC = noOfVotes;
                    break;
                case "EFF":
                    EFF = noOfVotes;
                    break;
                case "IFP":
                    IFP = noOfVotes;
                    break;
                case "SACP":
                    SACP = noOfVotes;
                    break;
                default:
                    System.out.println(name);
            }
        }
        ModelAndView mv = new ModelAndView();
        mv.setViewName("voteresults");
        mv.addObject("ANC", ANC);
        mv.addObject("DA", DA);
        mv.addObject("EFF", EFF);
        mv.addObject("IFP", IFP);
        mv.addObject("SACP", SACP);
        return mv;
    }
}
