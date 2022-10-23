package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessLevelDetails")
public class AccessLevelDetail {
  @DatabaseField(generatedId = true )
  private int id;


  @DatabaseField(foreign = true, columnName ="accessLevelId" )
  private AccessLevel accessLevels;
  @DatabaseField(foreign = true, columnName ="doorGroupId" )
  private DoorGroup doorGroups;
  @DatabaseField(foreign = true, columnName ="scheduleId" )
  private Schedule schedules;

  @DatabaseField
  private String updateTime;






  public AccessLevel getAccessLevelId() {
    return accessLevels;
  }

  public void setAccessLevelId(AccessLevel accessLevelId) {
    this.accessLevels = accessLevelId;
  }


  public DoorGroup getDoorGroupId() {
    return doorGroups;
  }

  public void setDoorGroupId(DoorGroup doorGroupId) {
    this.doorGroups = doorGroupId;
  }


  public Schedule getScheduleId() {
    return schedules;
  }

  public void setScheduleId(Schedule scheduleId) {
    this.schedules = scheduleId;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

}
