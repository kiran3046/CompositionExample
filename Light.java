package composition;

public class Light {
    private String type;
    private String brand_name;

    public Light(String type, String brand_name) {
        this.type = type;
        this.brand_name = brand_name;
    }

    public String getType() {
        return type;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void switch_on(){
        System.out.println("Lights ON");
    }

    public void switch_off(){
        System.out.println("Lights OFF");
    }

    @Override
    public String toString() {
        return "Light{" +
                "type='" + type + '\'' +
                ", brand_name='" + brand_name + '\'' +
                '}';
    }
}
