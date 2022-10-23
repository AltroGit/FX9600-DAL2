package app.Service;

import app.Model.AccessLevel;
import app.Repository.AccessLevelsRepository;

import java.sql.SQLException;
import java.util.List;

public class AccessLevelsService implements IAccessLevelService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AccessLevelsRepository repo = new AccessLevelsRepository();

    @Override
    public void add(AccessLevel object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public AccessLevel findById(int id) throws SQLException {
        return (AccessLevel) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, AccessLevel object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<AccessLevel> findAll() throws SQLException {
        return (List<AccessLevel>) repo.findAll();
    }



}
