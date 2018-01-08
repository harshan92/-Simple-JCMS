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
public class Course {

    private String cID;
    private String cTitle;

    public Course(String cID, String cTitle) {
        this.cID = cID;
        this.cTitle = cTitle;
    }

    public String getcID() {
        return cID;
    }

    public String getcTitle() {
        return cTitle;
    }

    @Override
    public String toString() {
        return "C"+cID + " "+ cTitle;
    }

}
