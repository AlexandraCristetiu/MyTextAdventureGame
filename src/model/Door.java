package model;

public class Door extends Artifact {
private Key doorKey;

public Door(Key doorKey){
        this.doorKey = doorKey;
  }

    public Door(int id, Key doorKey) {
        super();
        this.doorKey = doorKey;
    }
    // matches key with door
    public boolean matchKey(Key key){
    return key.equals(this.doorKey);
    }
}
