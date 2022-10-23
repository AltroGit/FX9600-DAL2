package app.Service;

import app.Model.ScheduleDetail;
import app.Repository.ScheduleDetailsRepository;

import java.sql.SQLException;
import java.util.List;

public class ScheduleDetailService implements IScheduleDetailService{
    //Aqui se deberían codificar los servicios que excedan las funcionalidades básicas del CRUD
    //Pej = "Obtener fichadas inválidas entre fechas

    ScheduleDetailsRepository repo = new ScheduleDetailsRepository();

    @Override
    public void add(ScheduleDetail object) throws SQLException {
        //repo.add(object);
        repo.create(object);
    }

    @Override
    public ScheduleDetail findById(int id) throws SQLException {
        return (ScheduleDetail) repo.find(id);
    }

    @Override
    public int delete(int id) throws SQLException {
        return repo.delete(id);
    }

    @Override
    public int update(int id, ScheduleDetail object) throws SQLException {
        return repo.update(id, object);
    }

    @Override
    public List<ScheduleDetail> findAll() throws SQLException {
        return (List<ScheduleDetail>) repo.findAll();
    }



}
