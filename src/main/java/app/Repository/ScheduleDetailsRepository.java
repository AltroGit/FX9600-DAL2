package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.ScheduleDetail;

import java.sql.SQLException;
import java.util.List;

public class ScheduleDetailsRepository implements IScheduleDetailsRepository{
    @Override
    public int update(int id, ScheduleDetail object) throws SQLException {
        ScheduleDetail tempObject = (ScheduleDetail) __DaoFactory.getInstance().getScheduleDetailsDao().queryForId(id);
        tempObject = object;
       // tempObject.setId(id);
        return __DaoFactory.getInstance().getScheduleDetailsDao().update(tempObject);
    }
    @Override
    public void create(ScheduleDetail o) throws SQLException {
        __DaoFactory.getInstance().getScheduleDetailsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getScheduleDetailsDao().delete(__DaoFactory.getInstance().getScheduleDetailsDao().queryForId(id));
    }

    @Override
    public ScheduleDetail find(int id) throws SQLException {
        return (ScheduleDetail) __DaoFactory.getInstance().getScheduleDetailsDao().queryForId(id);
    }

    @Override
    public List<ScheduleDetail> findAll() throws SQLException {
        return __DaoFactory.getInstance().getScheduleDetailsDao().queryForAll();
    }

}
