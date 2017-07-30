package com.codegirl.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by Şeyma Yılmaz on 30.7.2017.
 */
@Embeddable
public class Address {

    @Column(name = "streetName")
    private String street;

    @Column(name = "cityName")
    private String city;

    private String country;

    private String postCode;

    public Address() {
    }

    public Address(String street) {
        this.street = street;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
