package Armando.OnlineStore.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "vendor")
public class Vendor extends BaseEntity {

    @Column(nullable = false, name = "name", length = 50)
    private String name;
    @Column(name = "description", length = 200)
    private String description;

    public Vendor() {
    }

    public Vendor(String name, String description) {
        this.name = name;
        this.description = description;
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
}
