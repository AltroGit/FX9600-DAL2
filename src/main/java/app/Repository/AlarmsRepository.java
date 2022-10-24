package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.Alarm;

import java.sql.SQLException;
import java.util.List;

public class AlarmsRepository implements IAlarmsRepository{
    @Override
    public int update(int id, Alarm object) throws SQLException {
        Alarm tempObject = (Alarm) __DaoFactory.getInstance().getAlarmsDao().queryForId(id);
        tempObject = object;
        //tempObject.setId(id);
        return __DaoFactory.getInstance().getAlarmsDao().update(tempObject);
    }
    @Override
    public void create(Alarm o) throws SQLException {
        __DaoFactory.getInstance().getAlarmsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getAlarmsDao().delete(__DaoFactory.getInstance().getAlarmsDao().queryForId(id));
    }

    @Override
    public Alarm find(int id) throws SQLException {
        return (Alarm) __DaoFactory.getInstance().getAlarmsDao().queryForId(id);
    }

    @Override
    public List<Alarm> findAll() throws SQLException {
        return __DaoFactory.getInstance().getAlarmsDao().queryForAll();
    }

}
