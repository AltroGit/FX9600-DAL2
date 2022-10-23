package app.Repository;

import app.Model.Schedule;

import java.sql.SQLException;
import java.util.List;

public interface ISchedulesRepository {
    public int update (int id, Schedule object) throws SQLException;


    public void create(Schedule o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public Schedule find(int id) throws SQLException ;

    public List<Schedule> findAll() throws SQLException ;
}
