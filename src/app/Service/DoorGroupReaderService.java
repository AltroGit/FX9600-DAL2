package app.Service;

import app.Model.DoorGroupReader;
import app.Repository.DoorGroupsReadersRepository;

import java.sql.SQLException;
import java.util.List;

public class DoorGroupReaderService implements IDoorGroupReaderService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    DoorGroupsReadersRepository repo = new DoorGroupsReadersRepository();

    @Override
    public void add(DoorGroupReader object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public DoorGroupReader findById(int id) throws SQLException {
        return (DoorGroupReader) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, DoorGroupReader object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<DoorGroupReader> findAll() throws SQLException {
        return (List<DoorGroupReader>) repo.findAll();
    }



}
