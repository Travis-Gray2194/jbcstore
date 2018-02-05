package me.travisgray.Models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ${TravisGray} on 2/5/2018.
 */
@Entity
public class CleaningItems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    private String strength;

    @NotNull
    @NotEmpty
    private double price;

    @NotNull
    @NotEmpty
    private int inventorynumber;

    public CleaningItems() {
    }

    public CleaningItems(String strength, double price, int inventorynumber) {
        this.strength = strength;
        this.price = price;
        this.inventorynumber = inventorynumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventorynumber() {
        return inventorynumber;
    }

    public void setInventorynumber(int inventorynumber) {
        this.inventorynumber = inventorynumber;
    }
}
