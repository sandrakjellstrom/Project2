package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/booking")
    public ModelAndView listRooms() throws SQLException {
        return new ModelAndView("/booking")
                .addObject("listRooms", roomInterface.listRooms());



    }
    @PostMapping ("/rooms")
    public ModelAndView nochairs (@RequestParam int nochairs) throws SQLException {
        List<Rooms> rooms=roomInterface.listnochairs(nochairs);
return new ModelAndView("rooms").addObject("listRooms", rooms);
    }
}









