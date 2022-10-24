package app.Service;

import app.Model.Transaction;
import app.Repository.TransactionsRepository;

import java.sql.SQLException;
import java.util.List;

public class TransactionService implements ITransactionService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    TransactionsRepository repo = new TransactionsRepository();

    @Override
    public void add(Transaction object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public Transaction findById(int id) throws SQLException {
        return (Transaction) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, Transaction object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<Transaction> findAll() throws SQLException {
        return (List<Transaction>) repo.findAll();
    }



}
