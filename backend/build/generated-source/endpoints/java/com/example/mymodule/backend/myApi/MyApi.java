/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2014-11-17 18:43:33 UTC)
 * on 2014-12-02 at 10:06:30 UTC 
 * Modify at your own risk.
 */

package com.example.mymodule.backend.myApi;

/**
 * Service definition for MyApi (v1).
 *
 * <p>
 * This is an API
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link MyApiRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class MyApi extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.19.0 of the myApi library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://usc-course-finder.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "myApi/v1/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public MyApi(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  MyApi(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * Create a request for the method "createCourse".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link CreateCourse#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.Course}
   * @return the request
   */
  public CreateCourse createCourse(com.example.mymodule.backend.myApi.model.Course content) throws java.io.IOException {
    CreateCourse result = new CreateCourse(content);
    initialize(result);
    return result;
  }

  public class CreateCourse extends MyApiRequest<com.example.mymodule.backend.myApi.model.Course> {

    private static final String REST_PATH = "course";

    /**
     * Create a request for the method "createCourse".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link CreateCourse#execute()} method to invoke the remote operation. <p>
     * {@link
     * CreateCourse#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.Course}
     * @since 1.13
     */
    protected CreateCourse(com.example.mymodule.backend.myApi.model.Course content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.Course.class);
    }

    @Override
    public CreateCourse setAlt(java.lang.String alt) {
      return (CreateCourse) super.setAlt(alt);
    }

    @Override
    public CreateCourse setFields(java.lang.String fields) {
      return (CreateCourse) super.setFields(fields);
    }

    @Override
    public CreateCourse setKey(java.lang.String key) {
      return (CreateCourse) super.setKey(key);
    }

    @Override
    public CreateCourse setOauthToken(java.lang.String oauthToken) {
      return (CreateCourse) super.setOauthToken(oauthToken);
    }

    @Override
    public CreateCourse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (CreateCourse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public CreateCourse setQuotaUser(java.lang.String quotaUser) {
      return (CreateCourse) super.setQuotaUser(quotaUser);
    }

    @Override
    public CreateCourse setUserIp(java.lang.String userIp) {
      return (CreateCourse) super.setUserIp(userIp);
    }

    @Override
    public CreateCourse set(String parameterName, Object value) {
      return (CreateCourse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "createCourseUserMap".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link CreateCourseUserMap#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMap}
   * @return the request
   */
  public CreateCourseUserMap createCourseUserMap(com.example.mymodule.backend.myApi.model.CourseUserMap content) throws java.io.IOException {
    CreateCourseUserMap result = new CreateCourseUserMap(content);
    initialize(result);
    return result;
  }

  public class CreateCourseUserMap extends MyApiRequest<com.example.mymodule.backend.myApi.model.CourseUserMap> {

    private static final String REST_PATH = "createCourseUserMap";

    /**
     * Create a request for the method "createCourseUserMap".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link CreateCourseUserMap#execute()} method to invoke the remote
     * operation. <p> {@link CreateCourseUserMap#initialize(com.google.api.client.googleapis.services.
     * AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMap}
     * @since 1.13
     */
    protected CreateCourseUserMap(com.example.mymodule.backend.myApi.model.CourseUserMap content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.CourseUserMap.class);
    }

    @Override
    public CreateCourseUserMap setAlt(java.lang.String alt) {
      return (CreateCourseUserMap) super.setAlt(alt);
    }

    @Override
    public CreateCourseUserMap setFields(java.lang.String fields) {
      return (CreateCourseUserMap) super.setFields(fields);
    }

    @Override
    public CreateCourseUserMap setKey(java.lang.String key) {
      return (CreateCourseUserMap) super.setKey(key);
    }

    @Override
    public CreateCourseUserMap setOauthToken(java.lang.String oauthToken) {
      return (CreateCourseUserMap) super.setOauthToken(oauthToken);
    }

    @Override
    public CreateCourseUserMap setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (CreateCourseUserMap) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public CreateCourseUserMap setQuotaUser(java.lang.String quotaUser) {
      return (CreateCourseUserMap) super.setQuotaUser(quotaUser);
    }

    @Override
    public CreateCourseUserMap setUserIp(java.lang.String userIp) {
      return (CreateCourseUserMap) super.setUserIp(userIp);
    }

    @Override
    public CreateCourseUserMap set(String parameterName, Object value) {
      return (CreateCourseUserMap) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "createUser".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link CreateUser#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.User}
   * @return the request
   */
  public CreateUser createUser(com.example.mymodule.backend.myApi.model.User content) throws java.io.IOException {
    CreateUser result = new CreateUser(content);
    initialize(result);
    return result;
  }

  public class CreateUser extends MyApiRequest<com.example.mymodule.backend.myApi.model.User> {

    private static final String REST_PATH = "createUser";

    /**
     * Create a request for the method "createUser".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link CreateUser#execute()} method to invoke the remote operation. <p>
     * {@link
     * CreateUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.User}
     * @since 1.13
     */
    protected CreateUser(com.example.mymodule.backend.myApi.model.User content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.User.class);
    }

    @Override
    public CreateUser setAlt(java.lang.String alt) {
      return (CreateUser) super.setAlt(alt);
    }

    @Override
    public CreateUser setFields(java.lang.String fields) {
      return (CreateUser) super.setFields(fields);
    }

    @Override
    public CreateUser setKey(java.lang.String key) {
      return (CreateUser) super.setKey(key);
    }

    @Override
    public CreateUser setOauthToken(java.lang.String oauthToken) {
      return (CreateUser) super.setOauthToken(oauthToken);
    }

    @Override
    public CreateUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (CreateUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public CreateUser setQuotaUser(java.lang.String quotaUser) {
      return (CreateUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public CreateUser setUserIp(java.lang.String userIp) {
      return (CreateUser) super.setUserIp(userIp);
    }

    @Override
    public CreateUser set(String parameterName, Object value) {
      return (CreateUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getCourse".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetCourse#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.Course}
   * @return the request
   */
  public GetCourse getCourse(com.example.mymodule.backend.myApi.model.Course content) throws java.io.IOException {
    GetCourse result = new GetCourse(content);
    initialize(result);
    return result;
  }

  public class GetCourse extends MyApiRequest<com.example.mymodule.backend.myApi.model.CourseCollection> {

    private static final String REST_PATH = "getcourse";

    /**
     * Create a request for the method "getCourse".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetCourse#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetCourse#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)}
     * must be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.Course}
     * @since 1.13
     */
    protected GetCourse(com.example.mymodule.backend.myApi.model.Course content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.CourseCollection.class);
    }

    @Override
    public GetCourse setAlt(java.lang.String alt) {
      return (GetCourse) super.setAlt(alt);
    }

    @Override
    public GetCourse setFields(java.lang.String fields) {
      return (GetCourse) super.setFields(fields);
    }

    @Override
    public GetCourse setKey(java.lang.String key) {
      return (GetCourse) super.setKey(key);
    }

    @Override
    public GetCourse setOauthToken(java.lang.String oauthToken) {
      return (GetCourse) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCourse setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCourse) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCourse setQuotaUser(java.lang.String quotaUser) {
      return (GetCourse) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCourse setUserIp(java.lang.String userIp) {
      return (GetCourse) super.setUserIp(userIp);
    }

    @Override
    public GetCourse set(String parameterName, Object value) {
      return (GetCourse) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getCourseUserMap".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetCourseUserMap#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMaessage}
   * @return the request
   */
  public GetCourseUserMap getCourseUserMap(com.example.mymodule.backend.myApi.model.CourseUserMaessage content) throws java.io.IOException {
    GetCourseUserMap result = new GetCourseUserMap(content);
    initialize(result);
    return result;
  }

  public class GetCourseUserMap extends MyApiRequest<com.example.mymodule.backend.myApi.model.CourseUserMap> {

    private static final String REST_PATH = "getCourseUserMap";

    /**
     * Create a request for the method "getCourseUserMap".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetCourseUserMap#execute()} method to invoke the remote operation.
     * <p> {@link GetCourseUserMap#initialize(com.google.api.client.googleapis.services.AbstractGoogle
     * ClientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMaessage}
     * @since 1.13
     */
    protected GetCourseUserMap(com.example.mymodule.backend.myApi.model.CourseUserMaessage content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.CourseUserMap.class);
    }

    @Override
    public GetCourseUserMap setAlt(java.lang.String alt) {
      return (GetCourseUserMap) super.setAlt(alt);
    }

    @Override
    public GetCourseUserMap setFields(java.lang.String fields) {
      return (GetCourseUserMap) super.setFields(fields);
    }

    @Override
    public GetCourseUserMap setKey(java.lang.String key) {
      return (GetCourseUserMap) super.setKey(key);
    }

    @Override
    public GetCourseUserMap setOauthToken(java.lang.String oauthToken) {
      return (GetCourseUserMap) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCourseUserMap setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCourseUserMap) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCourseUserMap setQuotaUser(java.lang.String quotaUser) {
      return (GetCourseUserMap) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCourseUserMap setUserIp(java.lang.String userIp) {
      return (GetCourseUserMap) super.setUserIp(userIp);
    }

    @Override
    public GetCourseUserMap set(String parameterName, Object value) {
      return (GetCourseUserMap) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getCourseUsers".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetCourseUsers#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMaessage}
   * @return the request
   */
  public GetCourseUsers getCourseUsers(com.example.mymodule.backend.myApi.model.CourseUserMaessage content) throws java.io.IOException {
    GetCourseUsers result = new GetCourseUsers(content);
    initialize(result);
    return result;
  }

  public class GetCourseUsers extends MyApiRequest<com.example.mymodule.backend.myApi.model.UserCollection> {

    private static final String REST_PATH = "getCourseUsers";

    /**
     * Create a request for the method "getCourseUsers".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetCourseUsers#execute()} method to invoke the remote operation.
     * <p> {@link GetCourseUsers#initialize(com.google.api.client.googleapis.services.AbstractGoogleCl
     * ientRequest)} must be called to initialize this instance immediately after invoking the
     * constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMaessage}
     * @since 1.13
     */
    protected GetCourseUsers(com.example.mymodule.backend.myApi.model.CourseUserMaessage content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.UserCollection.class);
    }

    @Override
    public GetCourseUsers setAlt(java.lang.String alt) {
      return (GetCourseUsers) super.setAlt(alt);
    }

    @Override
    public GetCourseUsers setFields(java.lang.String fields) {
      return (GetCourseUsers) super.setFields(fields);
    }

    @Override
    public GetCourseUsers setKey(java.lang.String key) {
      return (GetCourseUsers) super.setKey(key);
    }

    @Override
    public GetCourseUsers setOauthToken(java.lang.String oauthToken) {
      return (GetCourseUsers) super.setOauthToken(oauthToken);
    }

    @Override
    public GetCourseUsers setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetCourseUsers) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetCourseUsers setQuotaUser(java.lang.String quotaUser) {
      return (GetCourseUsers) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetCourseUsers setUserIp(java.lang.String userIp) {
      return (GetCourseUsers) super.setUserIp(userIp);
    }

    @Override
    public GetCourseUsers set(String parameterName, Object value) {
      return (GetCourseUsers) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "getUser".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link GetUser#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.UserMessage}
   * @return the request
   */
  public GetUser getUser(com.example.mymodule.backend.myApi.model.UserMessage content) throws java.io.IOException {
    GetUser result = new GetUser(content);
    initialize(result);
    return result;
  }

  public class GetUser extends MyApiRequest<com.example.mymodule.backend.myApi.model.User> {

    private static final String REST_PATH = "getUser";

    /**
     * Create a request for the method "getUser".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link GetUser#execute()} method to invoke the remote operation. <p>
     * {@link
     * GetUser#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.UserMessage}
     * @since 1.13
     */
    protected GetUser(com.example.mymodule.backend.myApi.model.UserMessage content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.User.class);
    }

    @Override
    public GetUser setAlt(java.lang.String alt) {
      return (GetUser) super.setAlt(alt);
    }

    @Override
    public GetUser setFields(java.lang.String fields) {
      return (GetUser) super.setFields(fields);
    }

    @Override
    public GetUser setKey(java.lang.String key) {
      return (GetUser) super.setKey(key);
    }

    @Override
    public GetUser setOauthToken(java.lang.String oauthToken) {
      return (GetUser) super.setOauthToken(oauthToken);
    }

    @Override
    public GetUser setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (GetUser) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public GetUser setQuotaUser(java.lang.String quotaUser) {
      return (GetUser) super.setQuotaUser(quotaUser);
    }

    @Override
    public GetUser setUserIp(java.lang.String userIp) {
      return (GetUser) super.setUserIp(userIp);
    }

    @Override
    public GetUser set(String parameterName, Object value) {
      return (GetUser) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "sayHi".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link SayHi#execute()} method to invoke the remote operation.
   *
   * @param name
   * @return the request
   */
  public SayHi sayHi(java.lang.String name) throws java.io.IOException {
    SayHi result = new SayHi(name);
    initialize(result);
    return result;
  }

  public class SayHi extends MyApiRequest<com.example.mymodule.backend.myApi.model.MyBean> {

    private static final String REST_PATH = "sayHi/{name}";

    /**
     * Create a request for the method "sayHi".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link SayHi#execute()} method to invoke the remote operation. <p> {@link
     * SayHi#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
     * be called to initialize this instance immediately after invoking the constructor. </p>
     *
     * @param name
     * @since 1.13
     */
    protected SayHi(java.lang.String name) {
      super(MyApi.this, "POST", REST_PATH, null, com.example.mymodule.backend.myApi.model.MyBean.class);
      this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
    }

    @Override
    public SayHi setAlt(java.lang.String alt) {
      return (SayHi) super.setAlt(alt);
    }

    @Override
    public SayHi setFields(java.lang.String fields) {
      return (SayHi) super.setFields(fields);
    }

    @Override
    public SayHi setKey(java.lang.String key) {
      return (SayHi) super.setKey(key);
    }

    @Override
    public SayHi setOauthToken(java.lang.String oauthToken) {
      return (SayHi) super.setOauthToken(oauthToken);
    }

    @Override
    public SayHi setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (SayHi) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public SayHi setQuotaUser(java.lang.String quotaUser) {
      return (SayHi) super.setQuotaUser(quotaUser);
    }

    @Override
    public SayHi setUserIp(java.lang.String userIp) {
      return (SayHi) super.setUserIp(userIp);
    }

    @com.google.api.client.util.Key
    private java.lang.String name;

    /**

     */
    public java.lang.String getName() {
      return name;
    }

    public SayHi setName(java.lang.String name) {
      this.name = name;
      return this;
    }

    @Override
    public SayHi set(String parameterName, Object value) {
      return (SayHi) super.set(parameterName, value);
    }
  }

  /**
   * Create a request for the method "updateCourseUserMap".
   *
   * This request holds the parameters needed by the myApi server.  After setting any optional
   * parameters, call the {@link UpdateCourseUserMap#execute()} method to invoke the remote operation.
   *
   * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMaessage}
   * @return the request
   */
  public UpdateCourseUserMap updateCourseUserMap(com.example.mymodule.backend.myApi.model.CourseUserMaessage content) throws java.io.IOException {
    UpdateCourseUserMap result = new UpdateCourseUserMap(content);
    initialize(result);
    return result;
  }

  public class UpdateCourseUserMap extends MyApiRequest<com.example.mymodule.backend.myApi.model.CourseUserMap> {

    private static final String REST_PATH = "updateCourseUserMap";

    /**
     * Create a request for the method "updateCourseUserMap".
     *
     * This request holds the parameters needed by the the myApi server.  After setting any optional
     * parameters, call the {@link UpdateCourseUserMap#execute()} method to invoke the remote
     * operation. <p> {@link UpdateCourseUserMap#initialize(com.google.api.client.googleapis.services.
     * AbstractGoogleClientRequest)} must be called to initialize this instance immediately after
     * invoking the constructor. </p>
     *
     * @param content the {@link com.example.mymodule.backend.myApi.model.CourseUserMaessage}
     * @since 1.13
     */
    protected UpdateCourseUserMap(com.example.mymodule.backend.myApi.model.CourseUserMaessage content) {
      super(MyApi.this, "POST", REST_PATH, content, com.example.mymodule.backend.myApi.model.CourseUserMap.class);
    }

    @Override
    public UpdateCourseUserMap setAlt(java.lang.String alt) {
      return (UpdateCourseUserMap) super.setAlt(alt);
    }

    @Override
    public UpdateCourseUserMap setFields(java.lang.String fields) {
      return (UpdateCourseUserMap) super.setFields(fields);
    }

    @Override
    public UpdateCourseUserMap setKey(java.lang.String key) {
      return (UpdateCourseUserMap) super.setKey(key);
    }

    @Override
    public UpdateCourseUserMap setOauthToken(java.lang.String oauthToken) {
      return (UpdateCourseUserMap) super.setOauthToken(oauthToken);
    }

    @Override
    public UpdateCourseUserMap setPrettyPrint(java.lang.Boolean prettyPrint) {
      return (UpdateCourseUserMap) super.setPrettyPrint(prettyPrint);
    }

    @Override
    public UpdateCourseUserMap setQuotaUser(java.lang.String quotaUser) {
      return (UpdateCourseUserMap) super.setQuotaUser(quotaUser);
    }

    @Override
    public UpdateCourseUserMap setUserIp(java.lang.String userIp) {
      return (UpdateCourseUserMap) super.setUserIp(userIp);
    }

    @Override
    public UpdateCourseUserMap set(String parameterName, Object value) {
      return (UpdateCourseUserMap) super.set(parameterName, value);
    }
  }

  /**
   * Builder for {@link MyApi}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
    }

    /** Builds a new instance of {@link MyApi}. */
    @Override
    public MyApi build() {
      return new MyApi(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link MyApiRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setMyApiRequestInitializer(
        MyApiRequestInitializer myapiRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(myapiRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}
