package app.Service;

import app.Model.AccessCardAccessLevel;
import app.Repository.AccessCardsAccessLevelsRepository;

import java.sql.SQLException;
import java.util.List;

public class AccessCardAccessLevelService implements IAccessCardAccessLevelService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AccessCardsAccessLevelsRepository repo = new AccessCardsAccessLevelsRepository();

    @Override
    public void add(AccessCardAccessLevel object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public AccessCardAccessLevel findById(int id) throws SQLException {
        return (AccessCardAccessLevel) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, AccessCardAccessLevel object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<AccessCardAccessLevel> findAll() throws SQLException {
        return (List<AccessCardAccessLevel>) repo.findAll();
    }



}
