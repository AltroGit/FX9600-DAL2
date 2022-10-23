package app.Service;

import app.Model.ScheduleDetail;

import java.sql.SQLException;
import java.util.List;

public interface IScheduleDetailService {
    public void add(ScheduleDetail object) throws SQLException;
    public ScheduleDetail findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, ScheduleDetail object) throws SQLException;
    public List<ScheduleDetail> findAll () throws SQLException;
}
