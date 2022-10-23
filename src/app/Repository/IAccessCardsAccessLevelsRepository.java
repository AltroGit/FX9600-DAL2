package app.Repository;

import app.Model.AccessCardAccessLevel;

import java.sql.SQLException;
import java.util.List;

public interface IAccessCardsAccessLevelsRepository {
    public int update (int id, AccessCardAccessLevel object) throws SQLException;


    public void create(AccessCardAccessLevel o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public AccessCardAccessLevel find(int id) throws SQLException ;

    public List<AccessCardAccessLevel> findAll() throws SQLException ;
}
