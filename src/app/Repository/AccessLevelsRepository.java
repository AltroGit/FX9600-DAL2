package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.AccessLevel;

import java.sql.SQLException;
import java.util.List;

public class AccessLevelsRepository implements IAccessLevelsRepository{
    @Override
    public int update(int id, AccessLevel object) throws SQLException {
        AccessLevel tempObject = (AccessLevel) __DaoFactory.getInstance().getAccessLevelsDao().queryForId(id);
        tempObject = object;
        tempObject.setId(id);
        return __DaoFactory.getInstance().getAccessLevelsDao().update(tempObject);
    }
    @Override
    public void create(AccessLevel o) throws SQLException {
        __DaoFactory.getInstance().getAccessLevelsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getAccessLevelsDao().delete(__DaoFactory.getInstance().getAccessLevelsDao().queryForId(id));
    }

    @Override
    public AccessLevel find(int id) throws SQLException {
        return (AccessLevel) __DaoFactory.getInstance().getAccessLevelsDao().queryForId(id);
    }

    @Override
    public List<AccessLevel> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAccessLevelsDao().queryForAll();
    }

}
