package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Schedules")
public class Schedule {
  @DatabaseField(id = true)
  private int id;

  public Schedule(){

}
public int getId(){return id;
  }

  public void setId(int id){
    this.id = id;
  }




}
