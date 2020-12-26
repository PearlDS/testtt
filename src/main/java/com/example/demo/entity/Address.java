package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String street;
    private String city;
    private String postcode;
    private int houseNumb;
    private int appNumb;



    public Address() { }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getHouseNumb() {
        return houseNumb;
    }

    public void setHouseNumb(int houseNumb) {
        this.houseNumb = houseNumb;
    }

    public int getAppNumb() {
        return appNumb;
    }

    public void setAppNumb(int appNumb) {
        this.appNumb = appNumb;
    }


    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", houseNumb=" + houseNumb +
                ", appNumb=" + appNumb +
                ", postcode=" + postcode +
                '}';
    }
}

