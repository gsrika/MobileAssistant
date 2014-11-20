package com.example.mymodule.domain;

/**
 * Created by srikanthgandupalli on 11/15/14.
 */
public class UserMessage {

    private String userId;

    //deafult private constructor requrired

    private  UserMessage () {

    }

    public UserMessage(String userId) {
        this.userId = userId;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
