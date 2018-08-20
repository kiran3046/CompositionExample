package composition;

import java.util.Arrays;

public class Room {
private Window window;
private Door door;
private Light light;
private Furniture[] furniture;

    public Room(Window window, Door door, Light light, Furniture[] furniture) {
        this.window = window;
        this.door = door;
        this.light = light;
        this.furniture = furniture;
    }

    public Window getWindow() {
        return window;
    }

    public Door getDoor() {
        return door;
    }

    public Light getLight() {
        return light;
    }

    public Furniture[] getFurniture() {
        return furniture;
    }

    @Override
    public String toString() {
        return "Room{" +
                "window=" + window +
                ", door=" + door +
                ", light=" + light +
                ", furniture=" + Arrays.toString(furniture) +
                '}';
    }
}
