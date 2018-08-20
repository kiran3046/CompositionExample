package composition;

public class Door {
    private Dimension dimension;
    private String paint_color;
    private String lock_type;

    public Door(Dimension dimension, String paint_color, String lock_type) {
        this.dimension = dimension;
        this.paint_color = paint_color;
        this.lock_type = lock_type;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public String getPaint_color() {
        return paint_color;
    }

    public String getLock_type() {
        return lock_type;
    }

    @Override
    public String toString() {
        return "Door{" +
                "dimension=" + dimension +
                ", paint_color='" + paint_color + '\'' +
                ", lock_type='" + lock_type + '\'' +
                '}';
    }
}
