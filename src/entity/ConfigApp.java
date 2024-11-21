package entity;

import java.util.Objects;

public class ConfigApp {

    private String id;
    private String name;
    private String description;
    private Double price;
    private Integer quantity;

    public ConfigApp() {}

    public ConfigApp(String id, String name, String description, Double price, Integer quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ConfigApp configApp = (ConfigApp) object;
        return Objects.equals(id, configApp.id) && Objects.equals(name, configApp.name) && Objects.equals(description, configApp.description) && Objects.equals(price, configApp.price) && Objects.equals(quantity, configApp.quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, price, quantity);
    }

    @Override
    public String toString() {
        return "ConfigApp{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
