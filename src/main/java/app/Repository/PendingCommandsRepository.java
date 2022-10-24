package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.PendingCommand;

import java.sql.SQLException;
import java.util.List;

public class PendingCommandsRepository implements IPendingCommandsRepository{
    @Override
    public int update(int id, PendingCommand object) throws SQLException {
        PendingCommand tempObject = (PendingCommand) __DaoFactory.getInstance().getPendingCommandsDao().queryForId(id);
        tempObject = object;
       // tempObject.setId(id);
        return __DaoFactory.getInstance().getPendingCommandsDao().update(tempObject);
    }
    @Override
    public void create(PendingCommand o) throws SQLException {
        __DaoFactory.getInstance().getPendingCommandsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getPendingCommandsDao().delete(__DaoFactory.getInstance().getPendingCommandsDao().queryForId(id));
    }

    @Override
    public PendingCommand find(int id) throws SQLException {
        return (PendingCommand) __DaoFactory.getInstance().getPendingCommandsDao().queryForId(id);
    }

    @Override
    public List<PendingCommand> findAll() throws SQLException {
        return __DaoFactory.getInstance().getPendingCommandsDao().queryForAll();
    }

}
