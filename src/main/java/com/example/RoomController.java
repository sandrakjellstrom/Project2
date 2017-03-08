package com.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLException;

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
}









