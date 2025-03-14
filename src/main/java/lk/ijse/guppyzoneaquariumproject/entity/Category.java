package lk.ijse.guppyzoneaquariumproject.entity;

import jakarta.persistence.*;

@Entity
public class Category {
    @Id
    private String categoryId;
    private String name;
    private String description;
}
