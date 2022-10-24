package app.Repository;

import app.Model.DoorAlarm;

import java.sql.SQLException;
import java.util.List;

public interface IDoorAlarmsRepository {
    public int update (int id, DoorAlarm object) throws SQLException;


    public void create(DoorAlarm o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public DoorAlarm find(int id) throws SQLException ;

    public List<DoorAlarm> findAll() throws SQLException ;
}
