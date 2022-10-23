package app.Service;

import app.Model.PendingCommand;

import java.sql.SQLException;
import java.util.List;

public interface IPendingCommandService {
    public void add(PendingCommand object) throws SQLException;
    public PendingCommand findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, PendingCommand object) throws SQLException;
    public List<PendingCommand> findAll () throws SQLException;
}
