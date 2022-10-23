package app.DAL;

import app.Model.*;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

public class __DaoFactory {
    private static __DaoFactory instance;

    public static __DaoFactory getInstance() throws SQLException {
        if (instance == null) {
            instance = new __DaoFactory();
        }
        return instance;
    }

//    boolean creado1 = false;
//    boolean creado2 = false;
    static __DBContext context = new __DBContext();

    static ConnectionSource conn;

    static {
        try {
            conn = context.conectar();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//public Dao get<Name>Dao()






    public Dao getAccessCardsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, AccessCard.class);
    }
    public Dao getAccessCardsAccessLevelsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, AccessCardAccessLevel.class);
    }
    public Dao getAccessLevelDetailsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, AccessLevelDetail.class);
    }

    public Dao getAccessLevelsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, AccessLevel.class);
    }
    public Dao getAlarmsDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Alarm.class);
    }
    public Dao getDoorAlarmsDao() throws SQLException {
        return DaoManager.createDao((ConnectionSource) conn, DoorAlarm.class);
    }
    public Dao getDoorGroupsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, DoorGroup.class);
    }

    public Dao getDoorGroupsReadersDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, DoorGroupReader.class);
    }
    public Dao getPendingCommandsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, PendingCommand.class);
    }

    public Dao getReadersDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Reader.class);
    }
    public Dao getScheduleDetailsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, ScheduleDetail.class);
    }
    public Dao getSchedulesDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Schedule.class);
    }

    public Dao getTransactionsDao() throws  SQLException {
        return DaoManager.createDao((ConnectionSource) conn, Transaction.class);
    }









}
