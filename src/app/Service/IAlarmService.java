package app.Service;

import app.Model.Alarm;

import java.sql.SQLException;
import java.util.List;

public interface IAlarmService {
    public void add(Alarm object) throws SQLException;
    public Alarm findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, Alarm object) throws SQLException;
    public List<Alarm> findAll () throws SQLException;
}
