package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;

@Controller
public class RoomController {


    @Autowired
    private RoomInterface roomInterface;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userid, @RequestParam String password, HttpSession session) {
        if (userid.equals("admin") && password.equals("admin")) {
            session.setAttribute("user", userid);
            return "admin";
        }
        return "login";
    }

    @GetMapping("admin")
    public String secret(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "admin";
        }
        else
            return "login";
    }

    @PostMapping("/logout")
    public String logout(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "logout";
        }
        return "login";
    }

    @GetMapping("/booking")
    public ModelAndView listRooms() throws SQLException {
        return new ModelAndView("/booking")
                .addObject("listRooms", roomInterface.listRooms());

    }
}









