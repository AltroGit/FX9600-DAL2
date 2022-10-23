package app.Model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "DoorGroups_Readers")
public class DoorGroupReader {
  @DatabaseField(foreign = true, uniqueCombo=true,columnName="doorGroupId")
private DoorGroup doorGroups;

  @DatabaseField(foreign = true,uniqueCombo=true, columnName="readerId")
  private Reader readers;


/*  @ForeignCollectionField(eager = false)
  ForeignCollection<Readers> readersForeignCollection;

  @ForeignCollectionField(eager = false)
  ForeignCollection<DoorGroups> doorGroupsForeignCollection;*/

  public DoorGroup getDoorGroupId() {
    return doorGroups;
  }

  public void setDoorGroupId(DoorGroup doorGroupId) {
    this.doorGroups = doorGroupId;
  }


  public Reader getReaderId() {
    return readers;
  }

  public void setReaderId(Reader readerId) {
    this.readers = readerId;
  }

/*  public ForeignCollection<Readers> getReaders() {
    return readersForeignCollection;
  }
  public ForeignCollection<DoorGroups> getDoorGroups() {
    return doorGroupsForeignCollection;
  }*/

}
