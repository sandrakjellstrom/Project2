package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.sql.SQLException;
import java.util.List;

@Controller
public class RoomController {


    @Autowired
    private RoomInterface roomInterface;


    /*@GetMapping("/hej")
    public ModelAndView rooms () {
        return new ModelAndView("/index");
    }*/

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String userid, @RequestParam String password, HttpSession session) {
        if (userid.equals("admin") && password.equals("admin")) {
            session.setAttribute("user", userid);
            return "booking";
        }
        return "login";
    }

    @GetMapping("admin")
    public String secret(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "admin";
        } else
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
    public ModelAndView listRooms(HttpSession session) throws SQLException {
        if (session.getAttribute("user") != null) {
            return new ModelAndView("/booking")
                    .addObject("listRooms", roomInterface.listRooms());
        }
        return new ModelAndView("login");
    }

    @GetMapping("/rooms")
    public String rooms(HttpSession session) {
        if (session.getAttribute("user") != null) {
            return "rooms";
        } else
            return "login";
    }


    @PostMapping("/rooms")
    public ModelAndView nochairs(@RequestParam int nochairs, HttpSession session) throws SQLException {
        List<Rooms> rooms = roomInterface.listnochairs(nochairs);
        if (session.getAttribute("user") != null) {
            return new ModelAndView("rooms").addObject("listRooms", rooms);
        }
        return new ModelAndView("login");
    }
}









