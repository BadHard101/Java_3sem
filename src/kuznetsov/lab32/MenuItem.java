package kuznetsov.lab32;

import java.io.Serializable;

public class MenuItem implements Serializable {
    private String name;
    private String description;
    private int cost;

    public MenuItem(String name, String description, int cost) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("Name cannot be empty");
            }
            if (description == null || description.isEmpty()) {
                throw new IllegalArgumentException("Description cannot be empty");
            }
            if (cost <= 0) {
                throw new IllegalArgumentException("Price cannot be less than or equal to zero");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.name = name;
        this.description = description;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getCost() {
        return cost;
    }
    public String toString() {
        return String.format("%s - %s, %d", name, description, cost);
    } /////
}
