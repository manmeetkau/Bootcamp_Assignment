package com.JPQLandNativeSQL.JPQLandNativeSQL.Jointype;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Check_join extends Payement_join {
    private String checkcard;

    public String getCheckcard() {
        return checkcard;
    }

    public void setCheckcard(String checkcard) {
        this.checkcard = checkcard;
    }
}
