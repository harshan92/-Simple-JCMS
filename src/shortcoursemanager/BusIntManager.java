/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shortcoursemanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import twitter4j.TwitterException;
/**
 * @author Harshan Madhuranga Wimalasiri
 * @version 0.0.01
 * @date 2017-June-13
 * @UWEID 15028422
 * @Degree Software Engineering Level 2
 */
public class BusIntManager {
    ArrayList<CourseCount> cc=new ArrayList<>();
    CourseCount CC;
    HashMap<Course, Integer> map=new HashMap<>();
 
    public void setupTwitterApp(OOSD2TwitterAPI twitterapi) {
        twitterapi.setupTwitterApp();
    }

    public String  checkTwitterInfoForSubject(String searchterm,OOSD2TwitterAPI twitterapi) throws TwitterException  {
        String res=twitterapi.searchTwitter(searchterm);
        return res;
    }
    public String rankCourseByBooking(BookingManager b){
        ArrayList<CourseCount> titList=new ArrayList<>();
        ArrayList<Course> titList2=new ArrayList<>();
        titList.clear();
        titList2.clear();
        // add Course to Course List
        for(int i=0;b.getBookings().size()>i;i++){
            titList2.add(b.getBookings().get(i).getRun().getCourse());  
        }
        //clear hashmap
       map.clear();
        //put Course into map and It's Course is a key count is value
        for (Course s : titList2) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        //sort hashmap by using 
        List<Entry<Course,Integer>> aList = new LinkedList<Entry<Course,Integer>>(map.entrySet());
        Collections.sort(aList, new Comparator<Entry<Course,Integer>>(){
            @Override
            public int compare(Entry<Course, Integer> o1, Entry<Course, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        cc.clear();

        for (Entry<Course, Integer> entry : aList) {
            cc.add(new CourseCount(entry.getKey(),entry.getValue()));
        }
        String txt="";
        for(int n=0;n<cc.size();n++){
            txt+=cc.get(n).toString()+"\n";
        }
        
        return txt;
    }
    
    
}
