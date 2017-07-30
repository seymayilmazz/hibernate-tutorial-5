package com.codegirl.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Şeyma Yılmaz on 30.7.2017.
 */
@Entity
@Table(name = "tbl_person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fullName")
    private String name;

    private int age;

    @Temporal(TemporalType.DATE)
    private Date birthday;

    @Embedded
    @AttributeOverrides(
            {
                    @AttributeOverride(name = "city", column = @Column(name = "homeCity")),
                    @AttributeOverride(name = "street", column = @Column(name = "homeStreet")),
                    @AttributeOverride(name = "country", column = @Column(name = "homeCountry")),
                    @AttributeOverride(name = "postCode", column = @Column(name = "homePostCode"))
            }
    )
    private Address homeAddress;

    @Embedded
    @AttributeOverrides(
            {
                    @AttributeOverride(name = "city", column = @Column(name = "jobCity")),
                    @AttributeOverride(name = "street", column = @Column(name = "jobStreet")),
                    @AttributeOverride(name = "country", column = @Column(name = "jobCountry")),
                    @AttributeOverride(name = "postCode", column = @Column(name = "jobPostCode"))
            }
    )
    private Address jobAddress;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getJobAddress() {
        return jobAddress;
    }

    public void setJobAddress(Address jobAddress) {
        this.jobAddress = jobAddress;
    }
}
