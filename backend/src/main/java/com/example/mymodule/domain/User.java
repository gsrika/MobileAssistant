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

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public void setPublicProfileUrl(String publicProfileUrl) {
        this.publicProfileUrl = publicProfileUrl;
    }

    public String getPictureUrl() {

        return pictureUrl;
    }

    public String getPublicProfileUrl() {
        return publicProfileUrl;
    }

    @Index
    private String pictureUrl;
    @Index
    private String publicProfileUrl ;


    //default private is required for ? (Try to find out )
    private  User() {

    }

    public User(String id, String firstName, String lastName, String pictureUrl, String publicProfileUrl) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.pictureUrl = pictureUrl;
        this.publicProfileUrl   = publicProfileUrl;
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



    public String getId() {

        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}
