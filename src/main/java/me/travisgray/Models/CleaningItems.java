package me.travisgray.Models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
    private String productname;

    @NotNull
    @NotEmpty
    private double price;

//    @Min and @Max are used for validating numeric fields which could be String(representing number), int, short, byte etc and their respective primitive wrappers.
    @Min(0)
    private int inventorynumber;

    public CleaningItems() {
    }


    public CleaningItems(String strength, String productname, double price, int inventorynumber) {
        this.strength = strength;
        this.productname = productname;
        this.price = price;
        this.inventorynumber = inventorynumber;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
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
