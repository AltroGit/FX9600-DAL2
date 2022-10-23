package app.Service;

import app.Model.Reader;

import java.sql.SQLException;
import java.util.List;

public interface IReaderService {
    public void add(Reader object) throws SQLException;
    public Reader findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, Reader object) throws SQLException;
    public List<Reader> findAll () throws SQLException;
}
