package app.Repository;

import app.Model.Transaction;

import java.sql.SQLException;
import java.util.List;

public interface ITransactionsRepository {
    public int update (int id, Transaction object) throws SQLException;


    public void create(Transaction o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public Transaction find(int id) throws SQLException ;

    public List<Transaction> findAll() throws SQLException ;
}
