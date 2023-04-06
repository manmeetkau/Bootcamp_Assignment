package com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("cc")
public class Credit extends Payement{
    private String creditcard;

    public String getCreditcard() {
        return creditcard;
    }

    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }
}
