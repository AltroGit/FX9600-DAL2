package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.DoorGroup;

import java.sql.SQLException;
import java.util.List;

public class DoorGroupsRepository implements IDoorGroupsRepository{
    @Override
    public int update(int id, DoorGroup object) throws SQLException {
        DoorGroup tempObject = (DoorGroup) __DaoFactory.getInstance().getDoorGroupsDao().queryForId(id);
        tempObject = object;
       // tempObject.setId(id);
        return __DaoFactory.getInstance().getDoorGroupsDao().update(tempObject);
    }
    @Override
    public void create(DoorGroup o) throws SQLException {
        __DaoFactory.getInstance().getDoorGroupsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getDoorGroupsDao().delete(__DaoFactory.getInstance().getDoorGroupsDao().queryForId(id));
    }

    @Override
    public DoorGroup find(int id) throws SQLException {
        return (DoorGroup) __DaoFactory.getInstance().getDoorGroupsDao().queryForId(id);
    }

    @Override
    public List<DoorGroup> findAll() throws SQLException {
        return __DaoFactory.getInstance().getDoorGroupsDao().queryForAll();
    }

}
