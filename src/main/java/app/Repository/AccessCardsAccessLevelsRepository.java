package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.AccessCardAccessLevel;

import java.sql.SQLException;
import java.util.List;

public class AccessCardsAccessLevelsRepository implements IAccessCardsAccessLevelsRepository{
    @Override
    public int update(int id, AccessCardAccessLevel object) throws SQLException {
        AccessCardAccessLevel tempObject = (AccessCardAccessLevel) __DaoFactory.getInstance().getAccessCardsAccessLevelsDao().queryForId(id);
        tempObject = object;
        //tempObject.setDoorGroupId(id);
        return __DaoFactory.getInstance().getAccessCardsAccessLevelsDao().update(tempObject);
    }
    @Override
    public void create(AccessCardAccessLevel o) throws SQLException {
        __DaoFactory.getInstance().getAccessCardsAccessLevelsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getAccessCardsAccessLevelsDao().delete(__DaoFactory.getInstance().getAccessCardsAccessLevelsDao().queryForId(id));
    }

    @Override
    public AccessCardAccessLevel find(int id) throws SQLException {
        return (AccessCardAccessLevel) __DaoFactory.getInstance().getAccessCardsAccessLevelsDao().queryForId(id);
    }

    @Override
    public List<AccessCardAccessLevel> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAccessCardsAccessLevelsDao().queryForAll();
    }

}
