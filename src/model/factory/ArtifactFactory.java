package model.factory;

import model.*;

public class ArtifactFactory {
    public static Artifact createArtifact(String className, int id) {
        Artifact artifact = null;
        if (className.equals(Key.class.getSimpleName())) {
            artifact = new Key();
        } else if (className.equals(Door.class.getSimpleName())) {
            artifact = new Door(null);
        } else {
            className.equals(Rock.class.getSimpleName());
            {
                artifact = new Rock(1);
            }
        }
        return artifact;
    }

}
