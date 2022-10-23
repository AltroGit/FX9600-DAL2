package app.Repository;

import app.Model.PendingCommand;

import java.sql.SQLException;
import java.util.List;

public interface IPendingCommandsRepository {
    public int update (int id, PendingCommand object) throws SQLException;


    public void create(PendingCommand o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public PendingCommand find(int id) throws SQLException ;

    public List<PendingCommand> findAll() throws SQLException ;
}
