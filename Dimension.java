package composition;

public class Dimension {
    private float height;
    private float width;
    private float thickness;

    public Dimension(float height, float width, float thickness) {
        this.height = height;
        this.width = width;
        this.thickness = thickness;
    }

    public float getHeight() {
        return height;
    }

    public float getWidth() {
        return width;
    }

    public float getThickness() {
        return thickness;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "height=" + height +
                ", width=" + width +
                ", thickness=" + thickness +
                '}';
    }
}
