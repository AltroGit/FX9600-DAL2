package app.Service;

import app.Model.DoorAlarm;
import app.Repository.DoorAlarmsRepository;

import java.sql.SQLException;
import java.util.List;

public class DoorAlarmService implements IDoorAlarmService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    DoorAlarmsRepository repo = new DoorAlarmsRepository();

    @Override
    public void add(DoorAlarm object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public DoorAlarm findById(int id) throws SQLException {
        return (DoorAlarm) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, DoorAlarm object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<DoorAlarm> findAll() throws SQLException {
        return (List<DoorAlarm>) repo.findAll();
    }



}
