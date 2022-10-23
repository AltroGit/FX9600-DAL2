package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Transactions")
public class Transaction {
  @DatabaseField(generatedId = true)
  private int id;
  @DatabaseField
  private int clientId;
  @DatabaseField
  private int controllerId;
  @DatabaseField(foreign = true, columnName ="readerId" )
  private Reader readers;

  @DatabaseField
  private int messageId;
  @DatabaseField
  private int eventCode;
  @DatabaseField
  private String eventDateTime;
  @DatabaseField(foreign = true, columnName ="AccessCardId" )
  private AccessCard accessCards;
  @DatabaseField
  private String extra;
  @DatabaseField
  private int confirmationCount;
  @DatabaseField
  private boolean confirmed;
  @DatabaseField
  private boolean confirmationError;
  @DatabaseField
  private String timeStamp;
public Transaction(){

}




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


  public Reader getReaderId() {
    return readers;
  }

  public void setReaderId(Reader readerId) {
    this.readers = readerId;
  }


  public int getMessageId() {
    return messageId;
  }

  public void setMessageId(int messageId) {
    this.messageId = messageId;
  }


  public int getEventCode() {
    return eventCode;
  }

  public void setEventCode(int eventCode) {
    this.eventCode = eventCode;
  }


  public String getEventDateTime() {
    return eventDateTime;
  }

  public void setEventDateTime(String eventDateTime) {
    this.eventDateTime = eventDateTime;
  }


  public AccessCard getAccessCardId() {
    return accessCards;
  }

  public void setAccessCardId(AccessCard accessCards) {
    this.accessCards = accessCards;
  }


  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
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

}
