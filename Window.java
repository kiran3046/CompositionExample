package composition;

public class Window {
    private Dimension dimension;
    private String paint_color;
    private String glassType;

    public Window(Dimension dimension, String color, String glassType) {
        this.dimension = dimension;
        this.paint_color = color;
        this.glassType = glassType;
    }
    public Dimension getDimension() {
        return dimension;
    }

    public String getColor() {
        return paint_color;
    }

    public String getGlassType() {
        return glassType;
    }

    @Override
    public String toString() {
        return "Window{" +
                "dimension=" + dimension +
                ", paint_color='" + paint_color + '\'' +
                ", glassType='" + glassType + '\'' +
                '}';
    }
}
