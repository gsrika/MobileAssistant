package com.example.mymodule.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.List;

/**
 * Created by srikanthgandupalli on 11/14/14.
 */
@Entity
public class CourseUserMap {



    @Id
    private String courseid;
    private List<String> users;

    private CourseUserMap () {

    }

    public CourseUserMap(String courseid, List<String> users) {
        this.courseid = courseid;
        this.users = users;
    }

    public String getCourseid() {

        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

}
