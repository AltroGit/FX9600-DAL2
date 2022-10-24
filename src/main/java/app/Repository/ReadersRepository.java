package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.Reader;

import java.sql.SQLException;
import java.util.List;

public class ReadersRepository implements IReadersRepository{
    @Override
    public int update(int id, Reader object) throws SQLException {
        Reader tempObject = (Reader) __DaoFactory.getInstance().getReadersDao().queryForId(id);
        tempObject = object;
      // tempObject.setId(id);
        return __DaoFactory.getInstance().getReadersDao().update(tempObject);
    }
    @Override
    public void create(Reader o) throws SQLException {
        __DaoFactory.getInstance().getReadersDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getReadersDao().delete(__DaoFactory.getInstance().getReadersDao().queryForId(id));
    }

    @Override
    public Reader find(int id) throws SQLException {
        return (Reader) __DaoFactory.getInstance().getReadersDao().queryForId(id);
    }

    @Override
    public List<Reader> findAll() throws SQLException {
        return __DaoFactory.getInstance().getReadersDao().queryForAll();
    }

}
