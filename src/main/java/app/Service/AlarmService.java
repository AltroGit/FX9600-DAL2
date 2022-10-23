package app.Service;

import app.Model.Alarm;
import app.Repository.AlarmsRepository;

import java.sql.SQLException;
import java.util.List;

public class AlarmService implements IAlarmService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    AlarmsRepository repo = new AlarmsRepository();

    @Override
    public void add(Alarm object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public Alarm findById(int id) throws SQLException {
        return (Alarm) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, Alarm object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<Alarm> findAll() throws SQLException {
        return (List<Alarm>) repo.findAll();
    }



}
