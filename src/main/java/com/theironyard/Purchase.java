package com.theironyard;

import javax.persistence.*;

/**
 * Created by rdw1995 on 10/24/16.
 */
@Entity
@Table(name = "purchases")

public class Purchase {
    @Id
    @GeneratedValue
    int id;

    @Column(nullable = false)
    String date;

    @Column(nullable = false)
    String creditCard;

    @Column(nullable = false)
    int cvv;

    @ManyToOne
    Customer customer;

    public Purchase(int id, String date, String creditCard, int cvv, Customer customer) {
        this.id = id;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.customer = customer;
    }

    public Customer getCustomer (){ return  customer; }

    public Customer setCustomer () { this.customer = customer; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
}
