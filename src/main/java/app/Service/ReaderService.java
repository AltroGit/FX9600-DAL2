package app.Service;

import app.Model.Reader;
import app.Repository.ReadersRepository;

import java.sql.SQLException;
import java.util.List;

public class ReaderService implements IReaderService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    ReadersRepository repo = new ReadersRepository();

    @Override
    public void add(Reader object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public Reader findById(int id) throws SQLException {
        return (Reader) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, Reader object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<Reader> findAll() throws SQLException {
        return (List<Reader>) repo.findAll();
    }



}
