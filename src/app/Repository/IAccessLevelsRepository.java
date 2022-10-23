package app.Repository;

import app.Model.AccessLevel;

import java.sql.SQLException;
import java.util.List;

public interface IAccessLevelsRepository {
    public int update (int id, AccessLevel object) throws SQLException;


    public void create(AccessLevel o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public AccessLevel find(int id) throws SQLException ;

    public List<AccessLevel> findAll() throws SQLException ;
}
