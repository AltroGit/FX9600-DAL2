package app.DAL;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.sql.SQLException;

public class __DBContext {
        public ConnectionSource conectar() throws SQLException {
            //final String URL = "jdbc:sqlite:src/resources/db/AccessController.db";
            final String URL = "jdbc:sqlite:src/resources/db/AccessController.db";
            //Agrege eFalcomm y alli me accesa relativamanete
            ConnectionSource connectionSource = new JdbcConnectionSource(URL);
            return connectionSource;
        }


}
