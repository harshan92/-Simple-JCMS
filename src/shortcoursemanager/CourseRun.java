/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcoursemanager;
/**
 * @author Harshan Madhuranga Wimalasiri
 * @version 0.0.01
 * @date 2017-June-13
 * @UWEID 15028422
 * @Degree Software Engineering Level 2
 */
public class CourseRun {
    private String runID;
    private String date;
    private final Course course;
    public CourseRun(String runID, Course x, String date) {
        this.runID = runID;
        this.date = date;
        this.course=x;
    }

    public Course getCourse() {
        return course;
    }
    public String getCourseID() {
        return course.getcID();
    }
    public String getRunID() {
        return runID;
    }

    public void setRunID(String runID) {
        this.runID = runID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        return "C"+course.getcID()+"_"+"R"+runID+" "+date+" "+course.getcTitle();
    }
}
