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
public class Cosmetics {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    private String brand;

    @NotNull
    @NotEmpty
    private double price;

    @NotNull
    @NotEmpty
    private String rating;

    @NotNull
    @NotEmpty
    private int inventorynumber;

    public Cosmetics() {
    }


    public Cosmetics(long id, String brand, double price, String rating, int inventorynumber) {
        this.id = id;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
        this.inventorynumber = inventorynumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getInventorynumber() {
        return inventorynumber;
    }

    public void setInventorynumber(int inventorynumber) {
        this.inventorynumber = inventorynumber;
    }
}
