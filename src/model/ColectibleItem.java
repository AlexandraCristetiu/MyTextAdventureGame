package model;

public interface ColectibleItem {
    default boolean isColectible() {
        return true;
    }
}
