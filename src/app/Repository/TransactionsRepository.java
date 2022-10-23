package app.Repository;

import app.DAL.__DaoFactory;
import app.Model.Transaction;

import java.sql.SQLException;
import java.util.List;

public class TransactionsRepository implements ITransactionsRepository{
    @Override
    public int update(int id, Transaction object) throws SQLException {
        Transaction tempObject = (Transaction) __DaoFactory.getInstance().getTransactionsDao().queryForId(id);
        tempObject = object;
        //tempObject.setId(id);
        return __DaoFactory.getInstance().getTransactionsDao().update(tempObject);
    }
    @Override
    public void create(Transaction o) throws SQLException {
        __DaoFactory.getInstance().getTransactionsDao().create(o);

    }

    @Override
    public int delete(int id) throws SQLException {

        return __DaoFactory.getInstance().getTransactionsDao().delete(__DaoFactory.getInstance().getTransactionsDao().queryForId(id));
    }

    @Override
    public Transaction find(int id) throws SQLException {
        return (Transaction) __DaoFactory.getInstance().getTransactionsDao().queryForId(id);
    }

    @Override
    public List<Transaction> findAll() throws SQLException {
        return __DaoFactory.getInstance().getTransactionsDao().queryForAll();
    }

}
