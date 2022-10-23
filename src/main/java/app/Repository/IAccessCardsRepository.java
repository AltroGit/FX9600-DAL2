package app.Repository;

import app.Model.AccessCard;

import java.sql.SQLException;
import java.util.List;

public interface IAccessCardsRepository {
    public int update (int id, AccessCard object) throws SQLException;


    public void create(AccessCard o) throws SQLException ;


    public int delete(int id) throws SQLException ;

    public AccessCard find(int id) throws SQLException ;

    public List<AccessCard> findAll() throws SQLException ;
}
