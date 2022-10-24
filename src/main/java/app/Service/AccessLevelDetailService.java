package app.Service;

import app.Model.AccessLevelDetail;
import app.Repository.AccessLevelDetailsRepository;

import java.sql.SQLException;
import java.util.List;

public class AccessLevelDetailService implements IAccessLevelDetailService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AccessLevelDetailsRepository repo = new AccessLevelDetailsRepository();

    @Override
    public void add(AccessLevelDetail object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public AccessLevelDetail findById(int id) throws SQLException {
        return (AccessLevelDetail) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, AccessLevelDetail object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<AccessLevelDetail> findAll() throws SQLException {
        return (List<AccessLevelDetail>) repo.findAll();
    }



}
