package composition;

public class Furniture {
    private String name;
    private String brand_name;
    private float weight;

    public Furniture(String name, String brand_name, float weight) {
        this.name = name;
        this.brand_name = brand_name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", brand_name='" + brand_name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
