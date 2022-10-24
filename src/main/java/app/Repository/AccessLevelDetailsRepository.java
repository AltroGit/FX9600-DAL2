package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.AccessLevelDetail;

import java.sql.SQLException;
import java.util.List;

public class AccessLevelDetailsRepository implements IAccessLevelDetailsRepository{
    @Override
    public int update(int id, AccessLevelDetail object) throws SQLException {
        AccessLevelDetail tempObject = (AccessLevelDetail) __DaoFactory.getInstance().getAccessLevelDetailsDao().queryForId(id);
        tempObject = object;
       // tempObject.setId(id);
        return __DaoFactory.getInstance().getAccessLevelDetailsDao().update(tempObject);
    }
    @Override
    public void create(AccessLevelDetail o) throws SQLException {
        __DaoFactory.getInstance().getAccessLevelDetailsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getAccessLevelDetailsDao().delete(__DaoFactory.getInstance().getAccessLevelDetailsDao().queryForId(id));
    }

    @Override
    public AccessLevelDetail find(int id) throws SQLException {
        return (AccessLevelDetail) __DaoFactory.getInstance().getAccessLevelDetailsDao().queryForId(id);
    }

    @Override
    public List<AccessLevelDetail> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAccessLevelDetailsDao().queryForAll();
    }

}
