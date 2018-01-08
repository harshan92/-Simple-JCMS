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
public class Booking {
    private String bookingID;
    private String attendee;
    private CourseRun run;

    public CourseRun getRun() {
        return run;
    }

    public void setRun(CourseRun run) {
        this.run = run;
    }

    public Booking(String bookingID, String attendee, CourseRun run) {
        this.bookingID = bookingID;
        this.attendee = attendee;
        this.run=run;
    }

    @Override
    public String toString() {
        return "B"+ bookingID+"_C"+run.getCourseID()+"_R"+run.getRunID()+ " " + attendee+" "+run.toString();
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }
}
