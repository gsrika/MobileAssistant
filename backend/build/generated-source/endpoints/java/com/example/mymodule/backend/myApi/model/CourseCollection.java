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

package com.example.mymodule.backend.myApi.model;

/**
 * Model definition for CourseCollection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the myApi. For a detailed explanation see:
 * <a href="http://code.google.com/p/google-http-java-client/wiki/JSON">http://code.google.com/p/google-http-java-client/wiki/JSON</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CourseCollection extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Course> items;

  static {
    // hack to force ProGuard to consider Course used, since otherwise it would be stripped out
    // see http://code.google.com/p/google-api-java-client/issues/detail?id=528
    com.google.api.client.util.Data.nullOf(Course.class);
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Course> getItems() {
    return items;
  }

  /**
   * @param items items or {@code null} for none
   */
  public CourseCollection setItems(java.util.List<Course> items) {
    this.items = items;
    return this;
  }

  @Override
  public CourseCollection set(String fieldName, Object value) {
    return (CourseCollection) super.set(fieldName, value);
  }

  @Override
  public CourseCollection clone() {
    return (CourseCollection) super.clone();
  }

}
