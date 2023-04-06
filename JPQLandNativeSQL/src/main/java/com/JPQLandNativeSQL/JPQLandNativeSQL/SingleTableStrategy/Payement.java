package com.JPQLandNativeSQL.JPQLandNativeSQL.SingleTableStrategy;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode",discriminatorType = DiscriminatorType.STRING)
public abstract class Payement {
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
