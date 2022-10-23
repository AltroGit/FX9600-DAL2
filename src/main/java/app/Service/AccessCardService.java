package app.Service;

import app.Model.AccessCard;
import app.Repository.AccessCardsRepository;

import java.sql.SQLException;
import java.util.List;

public class AccessCardService implements IAccessCardService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AccessCardsRepository repo = new AccessCardsRepository();

    @Override
    public void add(AccessCard object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public AccessCard findById(int id) throws SQLException {
        return (AccessCard) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, AccessCard object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<AccessCard> findAll() throws SQLException {
        return (List<AccessCard>) repo.findAll();
    }



}
