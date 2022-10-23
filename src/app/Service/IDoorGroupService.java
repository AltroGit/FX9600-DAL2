package app.Service;

import app.Model.DoorGroup;

import java.sql.SQLException;
import java.util.List;

public interface IDoorGroupService {
    public void add(DoorGroup object) throws SQLException;
    public DoorGroup findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, DoorGroup object) throws SQLException;
    public List<DoorGroup> findAll () throws SQLException;
}
