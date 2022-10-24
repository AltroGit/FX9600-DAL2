package app.Service;

import app.Model.Transaction;

import java.sql.SQLException;
import java.util.List;

public interface ITransactionService {
    public void add(Transaction object) throws SQLException;
    public Transaction findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, Transaction object) throws SQLException;
    public List<Transaction> findAll () throws SQLException;
}
