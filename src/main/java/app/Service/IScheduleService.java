package app.Service;

import app.Model.Schedule;

import java.sql.SQLException;
import java.util.List;

public interface IScheduleService {
    public void add(Schedule object) throws SQLException;
    public Schedule findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, Schedule object) throws SQLException;
    public List<Schedule> findAll () throws SQLException;
}
