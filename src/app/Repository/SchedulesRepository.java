package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.Schedule;

import java.sql.SQLException;
import java.util.List;

public class SchedulesRepository implements ISchedulesRepository{
    @Override
    public int update(int id, Schedule object) throws SQLException {
        Schedule tempObject = (Schedule) __DaoFactory.getInstance().getSchedulesDao().queryForId(id);
        tempObject = object;
       // tempObject.setId(id);
        return __DaoFactory.getInstance().getSchedulesDao().update(tempObject);
    }
    @Override
    public void create(Schedule o) throws SQLException {
        __DaoFactory.getInstance().getSchedulesDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getSchedulesDao().delete(__DaoFactory.getInstance().getSchedulesDao().queryForId(id));
    }

    @Override
    public Schedule find(int id) throws SQLException {
        return (Schedule) __DaoFactory.getInstance().getSchedulesDao().queryForId(id);
    }

    @Override
    public List<Schedule> findAll() throws SQLException {
        return __DaoFactory.getInstance().getSchedulesDao().queryForAll();
    }

}
