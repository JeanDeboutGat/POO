package battleship;
/**
* An answer represents various 3 possibles outcomes after the ship's
*attak; SUNK,HIT,MISSED
*
*
*/
public enum Answer{
  MISSED("missed"),
  HIT("hit"),
  SUNK("sunk");

  private final String value;
  private Answer(String value){
    this.value=value;
  }


  public String toString(){
    return this.value;
  }
}
