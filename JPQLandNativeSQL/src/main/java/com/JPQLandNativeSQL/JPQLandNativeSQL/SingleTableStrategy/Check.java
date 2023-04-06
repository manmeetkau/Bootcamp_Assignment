package com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ch")
public class Check extends Payement{
    private String checkcard;

    public String getCheckcard() {
        return checkcard;
    }

    public void setCheckcard(String checkcard) {
        this.checkcard = checkcard;
    }
}
