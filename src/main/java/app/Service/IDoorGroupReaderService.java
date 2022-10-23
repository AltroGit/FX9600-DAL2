package app.Service;

import app.Model.DoorGroupReader;

import java.sql.SQLException;
import java.util.List;

public interface IDoorGroupReaderService {
    public void add(DoorGroupReader object) throws SQLException;
    public DoorGroupReader findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, DoorGroupReader object) throws SQLException;
    public List<DoorGroupReader> findAll () throws SQLException;
}
