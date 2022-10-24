package app.Model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Readers")
public class Reader {
  @DatabaseField(generatedId = true )
  private int id;
  @DatabaseField
  private int readerType;
  @DatabaseField
  private int accessDirection;
  @DatabaseField
  private int normalAccessTime;
  @DatabaseField
  private int extendedAccessTime;
  @DatabaseField
  private int doorRetentionTime;
  @DatabaseField
  private int strikeRelayTime;
  @DatabaseField
  private int minimumOpeningTime;
  @DatabaseField
  private int rexOpeningTime;
  @DatabaseField
  private int doorOpeningMode;
  @DatabaseField
  private int rexOpeningMode;


  @ForeignCollectionField(eager = false)
  ForeignCollection<Transaction> transactions;
  @ForeignCollectionField(eager = false)
  ForeignCollection<DoorGroupReader> doorGroupsReadersForeignCollection;


  public int getReaderType() {
    return readerType;
  }

  public void setReaderType(int readerType) {
    this.readerType = readerType;
  }


  public int getAccessDirection() {
    return accessDirection;
  }

  public void setAccessDirection(int accessDirection) {
    this.accessDirection = accessDirection;
  }


  public int getNormalAccessTime() {
    return normalAccessTime;
  }

  public void setNormalAccessTime(int normalAccessTime) {
    this.normalAccessTime = normalAccessTime;
  }


  public int getExtendedAccessTime() {
    return extendedAccessTime;
  }

  public void setExtendedAccessTime(int extendedAccessTime) {
    this.extendedAccessTime = extendedAccessTime;
  }


  public int getDoorRetentionTime() {
    return doorRetentionTime;
  }

  public void setDoorRetentionTime(int doorRetentionTime) {
    this.doorRetentionTime = doorRetentionTime;
  }


  public int getStrikeRelayTime() {
    return strikeRelayTime;
  }

  public void setStrikeRelayTime(int strikeRelayTime) {
    this.strikeRelayTime = strikeRelayTime;
  }


  public int getMinimumOpeningTime() {
    return minimumOpeningTime;
  }

  public void setMinimumOpeningTime(int minimumOpeningTime) {
    this.minimumOpeningTime = minimumOpeningTime;
  }


  public int getRexOpeningTime() {
    return rexOpeningTime;
  }

  public void setRexOpeningTime(int rexOpeningTime) {
    this.rexOpeningTime = rexOpeningTime;
  }


  public int getDoorOpeningMode() {
    return doorOpeningMode;
  }

  public void setDoorOpeningMode(int doorOpeningMode) {
    this.doorOpeningMode = doorOpeningMode;
  }


  public int getRexOpeningMode() {
    return rexOpeningMode;
  }

  public void setRexOpeningMode(int rexOpeningMode) {
    this.rexOpeningMode = rexOpeningMode;
  }
  public ForeignCollection<Transaction> getTransactions() {
    return transactions;
  }


  }

