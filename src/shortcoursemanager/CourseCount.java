/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcoursemanager;

import java.util.ArrayList;

public class CourseCount {   
    private int bookingCount;
    private Course course;
    ArrayList<Course> bookCourse=new ArrayList<Course>();

    public CourseCount(Course c, int bookingCount) {
        this.bookingCount = bookingCount;
        this.course=c;
        bookCourse.add(c);
    }
    public void inCount(){
         bookingCount++;
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
    public int getBookingCount() {
        return bookingCount;
    }

    public void setBookCourse(ArrayList<Course> bookCourse) {
        this.bookCourse = bookCourse;
    }

    public void setBookingCount(int bookingCount) {
        this.bookingCount = bookingCount;
    }

    @Override
    public String toString() {
       return course+", bookingCount="+bookingCount ;
    }
    
}
