package com.example.mymodule.domain;

/**
 * Created by srikanthgandupalli on 10/21/14.
 */

import com.google.appengine.api.datastore.Key;


import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


@Entity
public class Course {

    @Id
    private String Id;

    @Index
    private String ccode;

    @Index
    private String cdept;

    @Index
    private String  cname;

    @Index
    private String cprefix;

    public String getCprefix() {
        return cprefix;
    }


    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCcode() {
        return ccode;
    }

    public void setCcode(String ccode) {
        this.ccode = ccode;
    }

    public String getCdept() {
        return cdept;
    }

    public void setCdept(String cdept) {
        this.cdept = cdept;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    //Default constructor is required
    private Course () {

    }
    public Course (String id, String ccode, String cdept, String cname,String cprefix) {
        this.Id = id;
        this.ccode = ccode;
        this.cdept = cdept;
        this.cname = cname;
        this.cprefix = cprefix;

    }



}
