package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.AccessCard;

import java.sql.SQLException;
import java.util.List;

public class AccessCardsRepository implements IAccessCardsRepository{
    @Override
    public int update(int id, AccessCard object) throws SQLException {
        AccessCard tempObject = (AccessCard) __DaoFactory.getInstance().getAccessCardsDao().queryForId(id);
        tempObject = object;
        //tempObject.setId(id);
        return __DaoFactory.getInstance().getAccessCardsDao().update(tempObject);
    }
    @Override
    public void create(AccessCard o) throws SQLException {
        __DaoFactory.getInstance().getAccessCardsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getAccessCardsDao().delete(__DaoFactory.getInstance().getAccessCardsDao().queryForId(id));
    }

    @Override
    public AccessCard find(int id) throws SQLException {
        return (AccessCard) __DaoFactory.getInstance().getAccessCardsDao().queryForId(id);
    }

    @Override
    public List<AccessCard> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAccessCardsDao().queryForAll();
    }

}
