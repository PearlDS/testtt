package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String street;
    private String city;
    private int houseNumb;
    private int appNumb;


    @ManyToOne
    @JoinColumn(name="postcode_Id", insertable=false, updatable=false)
    private Postcode postcode;

    public Address() { }

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

    public Postcode getPostcode() {
        return postcode;
    }

    public void setPostcode(Postcode postcode) {
        this.postcode = postcode;
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

