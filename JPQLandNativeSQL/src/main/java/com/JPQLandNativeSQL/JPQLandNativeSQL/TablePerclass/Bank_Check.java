package com.JPQLandNativeSQL.JPQLandNativeSQL.TablePerclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class Bank_Check extends Payement_Table{
    private String checkcard;

    public String getCheckcard() {
        return checkcard;
    }

    public void setCheckcard(String checkcard) {
        this.checkcard = checkcard;
    }
}
