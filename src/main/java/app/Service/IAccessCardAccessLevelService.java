package app.Service;

import app.Model.AccessCardAccessLevel;

import java.sql.SQLException;
import java.util.List;

public interface IAccessCardAccessLevelService {
    public void add(AccessCardAccessLevel object) throws SQLException;
    public AccessCardAccessLevel findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, AccessCardAccessLevel object) throws SQLException;
    public List<AccessCardAccessLevel> findAll () throws SQLException;
}
