package app.Service;

import app.Model.Schedule;
import app.Repository.SchedulesRepository;

import java.sql.SQLException;
import java.util.List;

public class ScheduleService implements IScheduleService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    SchedulesRepository repo = new SchedulesRepository();

    @Override
    public void add(Schedule object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public Schedule findById(int id) throws SQLException {
        return (Schedule) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, Schedule object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<Schedule> findAll() throws SQLException {
        return (List<Schedule>) repo.findAll();
    }



}
