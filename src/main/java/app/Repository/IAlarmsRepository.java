package app.Repository;

import app.Model.Alarm;

import java.sql.SQLException;
import java.util.List;

public interface IAlarmsRepository {
    public int update (int id, Alarm object) throws SQLException;


    public void create(Alarm o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public Alarm find(int id) throws SQLException ;

    public List<Alarm> findAll() throws SQLException ;
}
