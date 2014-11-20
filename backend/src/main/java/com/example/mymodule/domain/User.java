package com.example.mymodule.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Created by srikanthgandupalli on 11/14/14.
 */

@Entity
public class User {

    @Id
    private String id;
    @Index
    private String firstName;
    @Index
    private String lastName;
    @Index
    private String picUrl;
    @Index
    private String pofileUrl;


    //default private is required for ? (Try to find out )
    private  User() {

    }

    public User(String id, String firstName, String lastName, String picUrl, String pofileUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.picUrl = picUrl;
        this.pofileUrl = pofileUrl;
    }

    public void setId(String id) {

        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public void setPofileUrl(String pofileUrl) {
        this.pofileUrl = pofileUrl;
    }

    public String getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public String getPofileUrl() {
        return pofileUrl;
    }
}
