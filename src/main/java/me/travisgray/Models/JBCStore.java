package me.travisgray.Models;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

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
public class JBCStore {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @NotEmpty
    private String storename;


    @Min(0)
    private int openinghours;


    @Min(0)
    private int closinghours;


    public JBCStore(String storename, int openinghours, int closinghours) {
        this.storename = storename;
        this.openinghours = openinghours;
        this.closinghours = closinghours;
    }

    public JBCStore() {
    }

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
