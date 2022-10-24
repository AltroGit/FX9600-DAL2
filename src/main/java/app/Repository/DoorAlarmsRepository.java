package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.DoorAlarm;

import java.sql.SQLException;
import java.util.List;

public class DoorAlarmsRepository implements IDoorAlarmsRepository{
    @Override
    public int update(int id, DoorAlarm object) throws SQLException {
        DoorAlarm tempObject = (DoorAlarm) __DaoFactory.getInstance().getDoorAlarmsDao().queryForId(id);
        tempObject = object;
       // tempObject.setId(id);
        return __DaoFactory.getInstance().getDoorAlarmsDao().update(tempObject);
    }
    @Override
    public void create(DoorAlarm o) throws SQLException {
        __DaoFactory.getInstance().getDoorAlarmsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getDoorAlarmsDao().delete(__DaoFactory.getInstance().getDoorAlarmsDao().queryForId(id));
    }

    @Override
    public DoorAlarm find(int id) throws SQLException {
        return (DoorAlarm) __DaoFactory.getInstance().getDoorAlarmsDao().queryForId(id);
    }

    @Override
    public List<DoorAlarm> findAll() throws SQLException {
        return __DaoFactory.getInstance().getDoorAlarmsDao().queryForAll();
    }

}
