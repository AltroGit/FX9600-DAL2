package app.Repository;

import app.Model.ScheduleDetail;

import java.sql.SQLException;
import java.util.List;

public interface IScheduleDetailsRepository {
    public int update (int id, ScheduleDetail object) throws SQLException;


    public void create(ScheduleDetail o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public ScheduleDetail find(int id) throws SQLException ;

    public List<ScheduleDetail> findAll() throws SQLException ;
}
