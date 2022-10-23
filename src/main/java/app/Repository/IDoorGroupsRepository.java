package app.Repository;

import app.Model.DoorGroup;

import java.sql.SQLException;
import java.util.List;

public interface IDoorGroupsRepository {
    public int update (int id, DoorGroup object) throws SQLException;


    public void create(DoorGroup o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public DoorGroup find(int id) throws SQLException ;

    public List<DoorGroup> findAll() throws SQLException ;
}
