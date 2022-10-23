## Scripts para los Crud's
****
### Alarms & DoorAlarms

**Crear Alarmas**

``` 
        Alarm alarmTest = new Alarm();
        alarmTest.setAcAlarm(true);
        alarmTest.setBatteryAlarm(true);
        alarmTest.setClientId(56);
        alarmTest.setTamperAlarm(false);
        alarmTest.setConfirmed(true);
        alarmTest.setConfirmationError(false);
        alarmTest.setControllerId(88);
        alarmTest.setTimeStamp("2022-10-21 14:50:55");
        __UnitOfWork.getInstance().getAlarmsService().add(alarmTest);
```

**Crear Door Alarms de la Alarm**

```

Creo 3 door alarm para Alarm
        Alarm alarmTest = new Alarm();
        alarmTest.setAcAlarm(true);
        alarmTest.setBatteryAlarm(true);
        alarmTest.setClientId(56);
        alarmTest.setTamperAlarm(false);
        alarmTest.setConfirmed(true);
        alarmTest.setConfirmationError(false);
        alarmTest.setControllerId(88);
        alarmTest.setTimeStamp("2022-10-21 14:50:55");
        __UnitOfWork.getInstance().getAlarmsService().add(alarmTest);
        
        DoorAlarm _dAlarmTest = new DoorAlarm();
        dAlarmTest.setAlarms(_alarm);
        dAlarmTest.setDoorForced(true);
        dAlarmTest.setReaderId(12);
        dAlarmTest.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().add(dAlarmTest);

        DoorAlarm dAlarmTest2 = new DoorAlarm();
        dAlarmTest2.setAlarms(_alarm);
        dAlarmTest2.setDoorForced(true);
        dAlarmTest2.setReaderId(13);
        dAlarmTest2.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().add(dAlarmTest2);

        DoorAlarm dAlarmTest3 = new DoorAlarm();
        dAlarmTest3.setAlarms(_alarm);
        dAlarmTest3.setDoorForced(true);
        dAlarmTest3.setReaderId(14);
        dAlarmTest3.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().add(dAlarmTest3);

```

```
Update de una Door Alarm.
        Alarm _alarm = new Alarm();
        DoorAlarm updatedTest = __UnitOfWork.getInstance().getDoorAlarmsService().findById(2);
        updatedTest.setAlarms(_alarm);
        updatedTest.setDoorForced(true);
        updatedTest.setReaderId(99);
        updatedTest.setDoorLeftOpened(true);
        __UnitOfWork.getInstance().getDoorAlarmsService().update(2,_updated);

```

```
Borrar una Alarm
 __UnitOfWork.getInstance().getAlarmsService().delete(12);


```

```
Encontrar una Alarm
 Alarms alarmaShow = __UnitOfWork.getInstance().getAlarmsService().findById(13);
        System.out.println(alarmaShow.getControllerId() +" - "+ alarmaShow.getConfirmationCount());
        for (DoorAlarms da:alarmaShow.getDoorAlarms())
        {
            System.out.println(da.getId());
        }

```

## Crear una Transactions Con un Readers y AccessCards -

```

   Transaction transactionsTest= new Transaction();
        transactionsTest.setClientId(3);
        transactionsTest.setControllerId(1);
        transactionsTest.setReaderId(__UnitOfWork.getInstance().getReadersService().findById(1));
        transactionsTest.setMessageId(1);
        transactionsTest.setEventCode(1);
        transactionsTest.setEventDateTime("Prueba11:19");
        transactionsTest.setAccessCardId(__UnitOfWork.getInstance().getAccessCardsService().findById(1));
        // transactionsTest.setExtra("PruebaAltro");
        // transactionsTest.setConfirmationCount(1);
        // transactionsTest.setConfirmed(true);
        // transactionsTest.setConfirmationError(false);
        transactionsTest.setTimeStamp("2022-10-13 14:50:55");
        __UnitOfWork.getInstance().getTransactionsService().add(transactionsTest);

```
## Crear una PendingCommands -

```
  PendingCommand pendingCommandsTest= new PendingCommand();
          pendingCommandsTest.setCommandAckId(1);
        pendingCommandsTest.setControllerId(1);
        pendingCommandsTest.setReaderId(__UnitOfWork.getInstance().getReadersService().findById(1));
        pendingCommandsTest.setCommand("ValorPrueba");
        pendingCommandsTest.setExecutionCount(1);
        pendingCommandsTest.setExecuted(true);
        pendingCommandsTest.setExecutionError(false);
        pendingCommandsTest.setConfirmationCount(1);
        pendingCommandsTest.setConfirmed(true);
        pendingCommandsTest.setConfirmationError(true);
        pendingCommandsTest.setTimeStamp("2022-10-13 14:50:55");
        __UnitOfWork.getInstance().getPendingCommandsService().add(pendingCommandsTest);

      //

        PendingCommands pendingCommandsTest= new PendingCommands();

        pendingCommandsTest.setCommandAckId(1);
        pendingCommandsTest.setControllerId(1);
        pendingCommandsTest.setReaderId(__UnitOfWork.getInstance().getReadersService().findById(1));
        pendingCommandsTest.setCommand("ValorPrueba2");
       
        __UnitOfWork.getInstance().getPendingCommandsService().add(pendingCommandsTest);
        
 ```

## Crear un DoorGroups -

```

     DoorGroup doorGroupTest2 = new DoorGroup();
        doorGroupTest2.setId(4);
        doorGroupTest2.setUpdateTime("State");
        __UnitOfWork.getInstance().getDoorGroupsService().add(doorGroupTest2);

```

## Creacion SchedulesDetails en base 1 Schedules -
```
        ScheduleDetail scheduleDetailsTest = new ScheduleDetail();
        scheduleDetailsTest.setScheduleId(__UnitOfWork.getInstance().getSchedulesService().findById(1));
        scheduleDetailsTest.setWeekDay(1);
        scheduleDetailsTest.setTimeFrom("20221013");
        scheduleDetailsTest.setTimeTo("20221020");
        scheduleDetailsTest.setUpdateTime("2022-10-13 14:50:55");
        __UnitOfWork.getInstance().getScheduleDetailsService().add(scheduleDetailsTest);

```
## Create Schedules -
```


Schedules schedulesTest= new Schedules();
schedulesTest.setId(2);
__UnitOfWork.getInstance().getSchedulesService().add(schedulesTest);

```

## Access levels Creation -

```
        AccessLevel accessLevelsTest= new AccessLevel();
        accessLevelsTest.setId(5);
        __UnitOfWork.getInstance().getAccessLevelsService().add(accessLevelsTest);

```

### AccessLevelsDetails Creation -


```
     AccessLevelDetail accessLevelDetailsTest = new AccessLevelDetail();
        accessLevelDetailsTest.setAccessLevelId(__UnitOfWork.getInstance().getAccessLevelsService().findById(5));
        accessLevelDetailsTest.setDoorGroupId(__UnitOfWork.getInstance().getDoorGroupsService().findById(1));
        accessLevelDetailsTest.setScheduleId(__UnitOfWork.getInstance().getSchedulesService().findById(1));
        accessLevelDetailsTest.setUpdateTime("2022-10-13 14:50:55");
        __UnitOfWork.getInstance().getAccessLevelDetailsService().add(accessLevelDetailsTest);

```

## DoorGroup_Readers Creatiom (los campos son de tipo UNIQUE) -


```

        DoorGroupReader doorGroupsReadersTest = new DoorGroupReader();
        doorGroupsReadersTest.setDoorGroupId(__UnitOfWork.getInstance().getDoorGroupsService().findById(1));
        doorGroupsReadersTest.setReaderId(__UnitOfWork.getInstance().getReadersService().findById(2));
        __UnitOfWork.getInstance().getDoorGroupsReadersService().add(doorGroupsReadersTest);

```

## Creacion de AccessCardsAccessLevels  -
```

        AccessCardAccessLevel accessCardsAccessLevelsTest = new AccessCardAccessLevel();
        accessCardsAccessLevelsTest.setAccessCardId(__UnitOfWork.getInstance().getAccessCardsService().findById(1));
        accessCardsAccessLevelsTest.setAccessLevelId(__UnitOfWork.getInstance().getAccessLevelsService().findById(5));
        __UnitOfWork.getInstance().getAccessCardsAccessLevels().add(accessCardsAccessLevelsTest);


```

## Modificacion de AccessCards

```
        AccessCard updateAccessCard = __UnitOfWork.getInstance().getAccessCardsService().findById(1);
        updateAccessCard.setFormat("TestTest");
        __UnitOfWork.getInstance().getAccessCardsService().update(1,updateAccessCard);

```