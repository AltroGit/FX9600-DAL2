package app.DAL;

import com.j256.ormlite.dao.BaseDaoImpl;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.DatabaseTableConfig;

import java.sql.SQLException;

public class _GenericDaoImpl extends BaseDaoImpl<Object, Long> implements _GenericDao
{
    public _GenericDaoImpl(ConnectionSource connectionSource) throws SQLException {
        super(connectionSource, Object.class);
    }
    public _GenericDaoImpl(ConnectionSource connectionSource, DatabaseTableConfig<Object> tableConfig) throws SQLException
    {
        super(connectionSource, tableConfig);
    }
}