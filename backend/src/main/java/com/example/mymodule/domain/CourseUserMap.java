package com.example.mymodule.domain;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by srikanthgandupalli on 11/14/14.
 */
@Entity
public class CourseUserMap {


    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseId() {

        return courseId;
    }

    @Id
    private String courseId;
    private List<String> users = new ArrayList<String>();

    private CourseUserMap () {

    }

    public CourseUserMap(String courseid, List<String> users) {
        this.courseId = courseid;
        this.users = users;
    }




    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

}
