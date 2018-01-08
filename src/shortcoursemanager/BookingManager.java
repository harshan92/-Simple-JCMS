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
public class BookingManager {
   private int bookingIDIndex=0;
   private ArrayList<Booking> bookings=new ArrayList<Booking>();
   private Booking newBooking;
    public BookingManager() {
    }
    
    public void makeBooking(CourseRun courseRun, String attendee){
        newBooking=new Booking(""+bookingIDIndex, attendee, courseRun);
        bookings.add(newBooking);
        bookingIDIndex++;
    }
    public Booking searchBooking(String BookingID){
        return null;
    }
    public int getBookingIDIndex() {
        return bookingIDIndex;
    }

    public void setBookingIDIndex(int bookingIDIndex) {
        this.bookingIDIndex = bookingIDIndex;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public Booking getBooking() {
        return newBooking;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }
   
}
