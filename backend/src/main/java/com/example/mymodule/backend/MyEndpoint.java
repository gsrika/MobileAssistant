package com.example.mymodule.backend;

import com.example.mymodule.domain.Course;
import com.example.mymodule.domain.CourseUserMaessage;
import com.example.mymodule.domain.CourseUserMap;
import com.example.mymodule.domain.User;
import com.example.mymodule.domain.UserMessage;
import com.example.mymodule.service.OfyService;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.UnauthorizedException;
import com.googlecode.objectify.Key;
import com.googlecode.objectify.Objectify;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

import javax.inject.Named;

import static com.example.mymodule.service.OfyService.ofy;


/** An endpoint class we are exposing */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.mymodule.example.com", ownerName = "backend.mymodule.example.com", packagePath=""))
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData("Hi, " + name);

        System.out.println(getClass().getResource("/Users/srikanthgandupalli/AndroidStudioProjects/MobileAssistatnt/backend/src/main/webapp/persistence.xml"));

        return response;
    }

    // Declare this method as a method available externally through Endpoints
    @ApiMethod(name = "createCourse", path = "course", httpMethod = ApiMethod.HttpMethod.POST)
    // The request that invokes this method should provide data that
    // this is to load course info table

    // TODO 1 Pass the ProfileForm parameter
    // TODO 2 Pass the User parameter
    public Course createCourse(Course course)  {
        ofy().save().entity(course).now();
        return course;
    }

    @ApiMethod(name = "getCourse", path = "getcourse", httpMethod = ApiMethod.HttpMethod.POST)
    // The request that invokes this method should provide data that
    // this is to load course info table

    // TODO 1 Pass the ProfileForm parameter
    // TODO 2 Pass the User parameter
    public List<Course> getCourseList(Course course)  {

        List<Course> list = ofy().load().type(Course.class).filter("ccode", "548").list();

        for(Course c : list) {
            System.out.println(c.toString());
        }
        return list;
    }

    @ApiMethod(name = "createUser", path = "createUser", httpMethod = ApiMethod.HttpMethod.POST)
    public User createUser(User user) {
        ofy().save().entity(user).now();
        return user;

    }

    @ApiMethod(name = "getUser", path = "getUser", httpMethod = ApiMethod.HttpMethod.POST)
    public User getUser(UserMessage userMessage) throws UnauthorizedException {

        if (userMessage == null) {
            throw new UnauthorizedException("Authorization required");
        }
        String userId = userMessage.getUserId();
        Key key = Key.create(User.class,userId);
        User user = (User) ofy().load().key(key).now();

        return user;
    }

    @ApiMethod(name = "createCourseUserMap", path = "createCourseUserMap", httpMethod = ApiMethod.HttpMethod.POST)
    public CourseUserMap createCourseUserMap(CourseUserMap courseUserMap) {
        ofy().save().entity(courseUserMap).now();
        return courseUserMap;

    }


    @ApiMethod(name = "getCourseUserMap", path = "getCourseUserMap", httpMethod = ApiMethod.HttpMethod.POST)
    public CourseUserMap getCourseUserMap(CourseUserMaessage courseUserMaessage) throws UnauthorizedException {

        if (courseUserMaessage == null) {
            throw new UnauthorizedException("Authorization required");
        }
        String courseId  = courseUserMaessage.getCourseId();
        Key key = Key.create(CourseUserMap.class,courseId);
        CourseUserMap courseUserMap = (CourseUserMap) ofy().load().key(key).now();

        return courseUserMap;

    }


    @ApiMethod(name = "updateCourseUserMap", path = "updateCourseUserMap", httpMethod = ApiMethod.HttpMethod.POST)
    public CourseUserMap updateCourseUserMap(CourseUserMaessage courseUserMaessage) throws UnauthorizedException {

        if (courseUserMaessage == null) {
            throw new UnauthorizedException("Authorization required");
        }

        CourseUserMap courseUserMap = getCourseUserMap(courseUserMaessage);
        if (courseUserMap == null) {
            String userId = courseUserMaessage.getUserId();
            String courseId = courseUserMaessage.getCourseId();
            List<String> userList = new ArrayList<String>();
            userList.add(userId);
            courseUserMap = new CourseUserMap(courseId, userList);
            courseUserMap = createCourseUserMap(courseUserMap);
        }

        return  courseUserMap;

    }





}