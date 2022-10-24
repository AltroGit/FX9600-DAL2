package app.Service;

import app.Model.DoorGroup;
import app.Repository.DoorGroupsRepository;

import java.sql.SQLException;
import java.util.List;

public class DoorGroupService implements IDoorGroupService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    DoorGroupsRepository repo = new DoorGroupsRepository();

    @Override
    public void add(DoorGroup object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public DoorGroup findById(int id) throws SQLException {
        return (DoorGroup) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, DoorGroup object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<DoorGroup> findAll() throws SQLException {
        return (List<DoorGroup>) repo.findAll();
    }



}
