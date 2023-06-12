package com.rapizza.rapizza.model;

public class Customer {
    private String id;
    private String name;
    private String surname;
    private String email;
    private float balance;

    private String password;

    public Customer(String name, String surname, String email,  String password, float balance){
        this.name = name;
        this.email = email;
        this.surname = surname;
        this.balance = balance;
        this.password = password;
    }
    public Customer(){
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}

