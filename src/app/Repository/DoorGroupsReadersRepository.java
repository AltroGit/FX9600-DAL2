package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.DoorGroupReader;

import java.sql.SQLException;
import java.util.List;

public class DoorGroupsReadersRepository implements IDoorGroupsReadersRepository{
    @Override
    public int update(int id, DoorGroupReader object) throws SQLException {
        DoorGroupReader tempObject = (DoorGroupReader) __DaoFactory.getInstance().getDoorGroupsReadersDao().queryForId(id);
        tempObject = object;
        //tempObject.setDoorGroupId(id);
        return __DaoFactory.getInstance().getDoorGroupsReadersDao().update(tempObject);
    }
    @Override
    public void create(DoorGroupReader o) throws SQLException {
        __DaoFactory.getInstance().getDoorGroupsReadersDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getDoorGroupsReadersDao().delete(__DaoFactory.getInstance().getDoorGroupsReadersDao().queryForId(id));
    }

    @Override
    public DoorGroupReader find(int id) throws SQLException {
        return (DoorGroupReader) __DaoFactory.getInstance().getDoorGroupsReadersDao().queryForId(id);
    }

    @Override
    public List<DoorGroupReader> findAll() throws SQLException {
        return __DaoFactory.getInstance().getDoorGroupsReadersDao().queryForAll();
    }

}
