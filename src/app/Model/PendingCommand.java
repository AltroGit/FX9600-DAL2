package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "PendingCommands")
public class PendingCommand {
  @DatabaseField(generatedId = true )
  private int id;
  @DatabaseField
  private int commandAckId;
  @DatabaseField
  private int controllerId;
  @DatabaseField(foreign = true, columnName ="readerId" )
  private Reader readers;
  @DatabaseField
  private String command;
  @DatabaseField
  private int executionCount;
  @DatabaseField
  private boolean executed;
  @DatabaseField
  private boolean executionError;
  @DatabaseField
  private int confirmationCount;
  @DatabaseField
  private boolean confirmed;
  @DatabaseField
  private boolean confirmationError;
  @DatabaseField
  private String timeStamp;





  public int getCommandAckId() {
    return commandAckId;
  }

  public void setCommandAckId(int commandAckId) {
    this.commandAckId = commandAckId;
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


  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public int getExecutionCount() {
    return executionCount;
  }

  public void setExecutionCount(int executionCount) {
    this.executionCount = executionCount;
  }


  public boolean getExecuted() {
    return executed;
  }

  public void setExecuted(boolean executed) {
    this.executed = executed;
  }


  public boolean getExecutionError() {
    return executionError;
  }

  public void setExecutionError(boolean executionError) {
    this.executionError = executionError;
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
