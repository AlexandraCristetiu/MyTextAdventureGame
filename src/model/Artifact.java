package model;

import java.util.List;

public class Artifact {
    private List<String > commands;
    private static int id;
    protected int id_new;

    public Artifact(){
        id_new = id;
        id++;
    }

    public String getName() {
        return this.getClass().getSimpleName();
    }

    public Artifact(int id, String name){
        id_new = id;
        id++;

        //this.id = id ;

    }
    @Override
    public String toString() {
        return super.toString();
    }

    public int getId() {
        return 0;
    }
}
