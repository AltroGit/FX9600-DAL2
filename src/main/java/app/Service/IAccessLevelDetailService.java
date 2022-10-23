package app.Service;

import app.Model.AccessLevelDetail;

import java.sql.SQLException;
import java.util.List;

public interface IAccessLevelDetailService {
    public void add(AccessLevelDetail object) throws SQLException;
    public AccessLevelDetail findById(int id) throws SQLException;
    public int delete (int id) throws SQLException;
    public int update (int id, AccessLevelDetail object) throws SQLException;
    public List<AccessLevelDetail> findAll () throws SQLException;
}
