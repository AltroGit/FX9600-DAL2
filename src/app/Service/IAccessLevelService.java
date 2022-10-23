package app.Service;

import app.Model.AccessLevel;

import java.sql.SQLException;
import java.util.List;

public interface IAccessLevelService {
    public void add(AccessLevel object) throws SQLException;
    public AccessLevel findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, AccessLevel object) throws SQLException;
    public List<AccessLevel> findAll () throws SQLException;
}
