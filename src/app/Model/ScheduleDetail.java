package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ScheduleDetails")
public class ScheduleDetail {
  @DatabaseField(generatedId = true )
  private int id;
  @DatabaseField(foreign = true, columnName ="scheduleId" )
  private Schedule schedules ;
  @DatabaseField
  private int weekDay;
  @DatabaseField
  private String timeFrom;
  @DatabaseField
  private String timeTo;
  @DatabaseField
  private String updateTime;


public ScheduleDetail(){

}



  public Schedule getScheduleId() {
    return schedules;
  }

  public void setScheduleId(Schedule scheduleId) {
    this.schedules = scheduleId;
  }


  public int getWeekDay() {
    return weekDay;
  }

  public void setWeekDay(int weekDay) {
    this.weekDay = weekDay;
  }


  public String getTimeFrom() {
    return timeFrom;
  }

  public void setTimeFrom(String timeFrom) {
    this.timeFrom = timeFrom;
  }


  public String getTimeTo() {
    return timeTo;
  }

  public void setTimeTo(String timeTo) {
    this.timeTo = timeTo;
  }


  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

}
