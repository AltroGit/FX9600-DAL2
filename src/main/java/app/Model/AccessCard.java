package app.Model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessCards")
public class AccessCard {

  @DatabaseField(generatedId = true )
  private int id;
  @DatabaseField
  private int updateCount;
  @DatabaseField(index = true)
  private int AccessCardId;
  @DatabaseField
  private String format;
  @DatabaseField
  private int facilityCode;
  @DatabaseField
  private int number;
  @DatabaseField
  private String validFrom;
  @DatabaseField
  private String validTo;
  @DatabaseField
  private boolean enabled;
  @DatabaseField
  private int confirmationCount;
  @DatabaseField
  private boolean confirmed;
  @DatabaseField
  private boolean confirmationError;
  @DatabaseField
  private String timeStamp;

  @ForeignCollectionField(eager = false)
  ForeignCollection<Transaction> transactions;

public AccessCard(){

}
  public int getUpdateCount() {
    return updateCount;
  }

  public void setUpdateCount(int updateCount) {
    this.updateCount = updateCount;
  }


  public int getAccessCardId() {
    return AccessCardId;
  }

  public void setAccessCardId(int accessCardId) {
    this.AccessCardId = accessCardId;
  }


  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }


  public int getFacilityCode() {
    return facilityCode;
  }

  public void setFacilityCode(int facilityCode) {
    this.facilityCode = facilityCode;
  }


  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }


  public String getValidFrom() {
    return validFrom;
  }

  public void setValidFrom(String validFrom) {
    this.validFrom = validFrom;
  }


  public String getValidTo() {
    return validTo;
  }

  public void setValidTo(String validTo) {
    this.validTo = validTo;
  }


  public boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(boolean enabled) {
    this.enabled = enabled;
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
  public ForeignCollection<Transaction> getTransactions() {
    return transactions;
  }
}
