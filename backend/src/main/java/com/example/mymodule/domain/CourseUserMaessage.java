package com.example.mymodule.domain;

/**
 * Created by srikanthgandupalli on 11/15/14.
 */
public class CourseUserMaessage {


    private String courseId;
    private String userId;

    //defalt private Message

    private  CourseUserMaessage () {

    }

    public CourseUserMaessage(String courseId, String userId) {
        this.courseId = courseId;
        this.userId = userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }



}
