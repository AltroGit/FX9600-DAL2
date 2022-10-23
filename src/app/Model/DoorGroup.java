package app.Model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DoorGroups")
public class DoorGroup {
  @DatabaseField(id = true )
  private int id;
  @DatabaseField
  private String updateTime;

  @ForeignCollectionField(eager = false)
  ForeignCollection<DoorGroupReader> doorGroupsReadersForeignCollection;


public DoorGroup(){

}
public  int getId(){
  return id;
}
public void setId(int id){
  this.id= id;
}



  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }

  public ForeignCollection<DoorGroupReader> getDoorGroupsReadersForeignCollection() {
    return doorGroupsReadersForeignCollection;
  }

}
