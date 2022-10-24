package app.Repository;

import app.Model.Reader;

import java.sql.SQLException;
import java.util.List;

public interface IReadersRepository {
    public int update (int id, Reader object) throws SQLException;


    public void create(Reader o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public Reader find(int id) throws SQLException ;

    public List<Reader> findAll() throws SQLException ;
}
