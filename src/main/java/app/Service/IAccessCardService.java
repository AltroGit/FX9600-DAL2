package app.Service;

import app.Model.AccessCard;

import java.sql.SQLException;
import java.util.List;

public interface IAccessCardService {
    public void add(AccessCard object) throws SQLException;
    public AccessCard findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, AccessCard object) throws SQLException;
    public List<AccessCard> findAll () throws SQLException;
}
