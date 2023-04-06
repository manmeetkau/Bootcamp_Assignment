package com.JPQLandNativeSQL.JPQLandNativeSQL.Jointype;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)
public abstract class Payement_join {
    @Id
    private int Id;
    private double amount;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
