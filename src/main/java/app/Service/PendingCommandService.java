package app.Service;

import app.Model.PendingCommand;
import app.Repository.PendingCommandsRepository;

import java.sql.SQLException;
import java.util.List;

public class PendingCommandService implements IPendingCommandService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    PendingCommandsRepository repo = new PendingCommandsRepository();

    @Override
    public void add(PendingCommand object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public PendingCommand findById(int id) throws SQLException {
        return (PendingCommand) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, PendingCommand object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<PendingCommand> findAll() throws SQLException {
        return (List<PendingCommand>) repo.findAll();
    }



}
