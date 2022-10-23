package app.Model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

@DatabaseTable(tableName = "Alarms")
public class Alarm {
  @DatabaseField(generatedId = true )
  private int id;
  @DatabaseField(canBeNull = false)
  private int clientId ;
  @DatabaseField(canBeNull = false)
  private int controllerId;
  @DatabaseField(canBeNull = false)
  private boolean tamperAlarm;
  @DatabaseField(canBeNull = false)
  private boolean batteryAlarm;
  @DatabaseField(canBeNull = false)
  private boolean acAlarm;
  @DatabaseField(canBeNull = false)
  private int confirmationCount;
  @DatabaseField
  private boolean confirmed;
  @DatabaseField
  private boolean confirmationError;
  @DatabaseField
  String timeStamp;

  @ForeignCollectionField(eager = false)
  ForeignCollection<DoorAlarm> doorAlarms;




  public int getClientId() {
    return clientId;
  }

  public void setClientId(int clientId) {
    this.clientId = clientId;
  }


  public int getControllerId() {
    return controllerId;
  }

  public void setControllerId(int controllerId) {
    this.controllerId = controllerId;
  }


  public boolean getTamperAlarm() {
    return tamperAlarm;
  }

  public void setTamperAlarm(boolean tamperAlarm) {
    this.tamperAlarm = tamperAlarm;
  }


  public boolean getBatteryAlarm() {
    return batteryAlarm;
  }

  public void setBatteryAlarm(boolean batteryAlarm) {
    this.batteryAlarm = batteryAlarm;
  }


  public boolean getAcAlarm() {
    return acAlarm;
  }

  public void setAcAlarm(boolean acAlarm) {
    this.acAlarm = acAlarm;
  }


  public int getConfirmationCount() {
    return confirmationCount;
  }

  public void setConfirmationCount(int confirmationCount) {
    this.confirmationCount = confirmationCount;
  }


  public boolean getConfirmed() {
    return confirmed;
  }

  public void setConfirmed(boolean confirmed) {
    this.confirmed = confirmed;
  }


  public boolean getConfirmationError() {
    return confirmationError;
  }

  public void setConfirmationError(boolean confirmationError) {
    this.confirmationError = confirmationError;
  }


  public String getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(String timeStamp) {
    this.timeStamp = timeStamp;
  }

  public ForeignCollection<DoorAlarm> getDoorAlarms() {
    return doorAlarms;
  }
}
