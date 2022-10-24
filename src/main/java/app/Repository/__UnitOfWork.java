package app.Repository;

import app.Model.*;
import app.Service.*;

public class __UnitOfWork {
    private static __UnitOfWork instance;

    public static __UnitOfWork getInstance() {
        if (instance == null) {
            instance = new __UnitOfWork();
        }
        return instance;
    }
    //Problemas al usar get<Name>Service() => Nombre overloaded, cambie a get<Name>Services() para no sobrecargar la funcion y evitar ese rror

    public AccessCardService getAccessCardsService() {
        return new AccessCardService();
    }
    public AccessLevelDetailService getAccessLevelDetailsService() {
        return new AccessLevelDetailService();
    }
    public AccessLevelsService getAccessLevelsService() {
        return new AccessLevelsService();
    }
public AccessCardAccessLevelService getAccessCardsAccessLevels() {         return new AccessCardAccessLevelService();
}

    public AlarmService getAlarmsService() {
        return new AlarmService();
    }
    public DoorAlarmService getDoorAlarmsService() {         return new DoorAlarmService();     }
    public DoorGroupService getDoorGroupsService() {
        return new DoorGroupService();
    }
    public DoorGroupReaderService getDoorGroupsReadersService() {
        return new DoorGroupReaderService();
    }
    public PendingCommandService getPendingCommandsService() {
        return new PendingCommandService();
    }
    public ReaderService getReadersService() {
        return new ReaderService();
    }

    public ScheduleDetailService getScheduleDetailsService() {
        return new ScheduleDetailService();
    }
    public ScheduleService getSchedulesService() {
        return new ScheduleService();
    }


    public TransactionService getTransactionsService() {   return new TransactionService();     }

}
