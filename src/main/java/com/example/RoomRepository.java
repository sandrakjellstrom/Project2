package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
@Component
public class RoomRepository implements RoomInterface {

    @Autowired
    private javax.sql.DataSource dataSource;

    public List<Rooms> listRooms() {
        try (Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM CONFBOOKING.ROOMS")) {
                    List<Rooms> listRooms = new ArrayList<>();
                    while (rs.next()) listRooms.add(rsRooms(rs));
                    return listRooms;

        } catch (SQLException e) {
            throw new RoomRepositoryException(e);
        }
    }

    @Override
    public Rooms getRooms(int RoomID) {
        return null;
    }

    private Rooms rsRooms(ResultSet rs) throws SQLException {
            return new Rooms(rs.getInt("RoomID"), rs.getString("Name"), rs.getInt("Chairs"), rs.getString("Accessories"));
    }

}
