package lk.ijse.guppyzoneaquariumproject.entity;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id
    private String itemCode;
    private String itemName;
    private int quantity;
    private double price;
    private String sourceUrl;
    private String categoryId;

}
