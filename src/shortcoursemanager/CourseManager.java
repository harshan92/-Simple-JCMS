/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcoursemanager;

import java.util.ArrayList;
/**
 * @author Harshan Madhuranga Wimalasiri
 * @version 0.0.01
 * @date 2017-June-13
 * @UWEID 15028422
 * @Degree Software Engineering Level 2
 */
public class CourseManager {
    private int courseIDIndex=0;
    private int courseRunIDIndex=0;
    ArrayList<Course> courseList=new ArrayList<>();
    ArrayList<CourseRun> courseRunList=new ArrayList<>();
    Course course;
    CourseRun courseRun;
    //start of getters and setters
   
    public CourseManager() {
        
    }
    //end of getters and setters
   public void addCourse(String title){
       //adding the course
       String index=String.valueOf(courseIDIndex);
       course=new Course(index,title);
       courseList.add(course);
       courseIDIndex++;
   }
   public void addCourseRun(String courseID, String date){
       courseRun=new CourseRun(String.valueOf(courseRunIDIndex),searchCourse(courseID),date);
       courseRunList.add(courseRun);
       courseRunIDIndex++;
   }
    public Course searchCourse(String courseID){
        Course result = null;
       //adding the courseRun
       for(int i=0; i<this.courseList.size(); i++){
       if(courseID.equals(courseList.get(i).getcID())){
           result=courseList.get(i);
           break;
       }}
       return result;
   }
    public CourseRun searchCourseRun(String runID){
       CourseRun result = null;
       //adding the courseRun
       for(int i=0; i<this.courseRunList.size(); i++){
       if(runID.equals(courseRunList.get(i).getRunID())){
           result=courseRunList.get(i);
           break;
       }}
       return result;
   }

    public int getCourseIDIndex() {
        return courseIDIndex;
    }

    public void setCourseIDIndex(int courseIDIndex) {
        this.courseIDIndex = courseIDIndex;
    }

    public int getCourseRunIDIndex() {
        return courseRunIDIndex;
    }

    public void setCourseRunIDIndex(int courseRunIDIndex) {
        this.courseRunIDIndex = courseRunIDIndex;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public String getCourseRunString() {
        return courseRun.toString();
    }

    public CourseRun getCourseRun() {
        return courseRun;
    }
}
