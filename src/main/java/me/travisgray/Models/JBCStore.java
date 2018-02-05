package me.travisgray.Models;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ${TravisGray} on 2/5/2018.
 */

@Entity
public class JBCStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    private String storename;

    @NotNull
    @NotEmpty
    private int openinghours;

    @NotNull
    @NotEmpty
    private int closinghours;



    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public int getOpeninghours() {
        return openinghours;
    }

    public void setOpeninghours(int openinghours) {
        this.openinghours = openinghours;
    }

    public int getClosinghours() {
        return closinghours;
    }

    public void setClosinghours(int closinghours) {
        this.closinghours = closinghours;
    }
}
