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
public class Snacks {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @NotNull
    @NotEmpty
    private String crunchiness;

    @NotNull
    @NotEmpty
    private String snackname;


    @Min(0)
    private int inventorynumber;

    public Snacks(String crunchiness, String snackname, int inventorynumber) {
        this.crunchiness = crunchiness;
        this.snackname = snackname;
        this.inventorynumber = inventorynumber;
    }

    public String getSnackname() {
        return snackname;
    }

    public void setSnackname(String snackname) {
        this.snackname = snackname;
    }

    public Snacks() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCrunchiness() {
        return crunchiness;
    }

    public void setCrunchiness(String crunchiness) {
        this.crunchiness = crunchiness;
    }

    public int getInventorynumber() {
        return inventorynumber;
    }

    public void setInventorynumber(int inventorynumber) {
        this.inventorynumber = inventorynumber;
    }
}
