package com.JPQLandNativeSQL.JPQLandNativeSQL.TablePerclass;

import jakarta.persistence.Entity;

@Entity

public class Credit_card extends Payement_Table {
    private String creditcard;

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }
}
