package app.Repository;

import app.Model.DoorGroupReader;

import java.sql.SQLException;
import java.util.List;

public interface IDoorGroupsReadersRepository {
    public int update (int id, DoorGroupReader object) throws SQLException;


    public void create(DoorGroupReader o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public DoorGroupReader find(int id) throws SQLException ;

    public List<DoorGroupReader> findAll() throws SQLException ;
}
