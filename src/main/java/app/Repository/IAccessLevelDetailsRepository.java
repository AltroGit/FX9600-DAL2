package app.Repository;

import app.Model.AccessLevelDetail;

import java.sql.SQLException;
import java.util.List;

public interface IAccessLevelDetailsRepository {
    public int update (int id, AccessLevelDetail object) throws SQLException;


    public void create(AccessLevelDetail o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public AccessLevelDetail find(int id) throws SQLException ;

    public List<AccessLevelDetail> findAll() throws SQLException ;
}
