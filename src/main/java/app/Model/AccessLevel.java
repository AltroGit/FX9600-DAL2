package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "AccessLevels")
public class AccessLevel {
  @DatabaseField(id = true)
  private int id;
public AccessLevel(){

}

  public int getId(){return id;
  }

  public void setId(int id){
    this.id = id;
  }

}
