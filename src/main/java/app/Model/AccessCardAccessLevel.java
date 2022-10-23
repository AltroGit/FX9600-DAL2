package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessCards_AccessLevels")
public class AccessCardAccessLevel {


  @DatabaseField(foreign = true, uniqueCombo=true,columnName="accessCardId")
  private AccessCard accessCards;

  @DatabaseField(foreign = true,uniqueCombo=true, columnName="accessLevelId")
  private AccessLevel accessLevels;


  public AccessCard getAccessCardId() {
    return accessCards;
  }

  public void setAccessCardId(AccessCard accessCardId) {
    this.accessCards = accessCardId;
  }


  public AccessLevel getAccessLevelId() {
    return accessLevels;
  }

  public void setAccessLevelId(AccessLevel accessLevelId) {
    this.accessLevels = accessLevelId;
  }

}
