package com.example;

import com.example.Rooms;

import java.sql.SQLException;
import java.util.List;

public interface RoomInterface {
    List<Rooms> listRooms();
    Rooms getRooms (int RoomID);

    List<Rooms> listnochairs(int chairs) throws SQLException;

}
