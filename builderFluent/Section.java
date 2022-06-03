
/**
 * Write a description of class Section here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Section
{
    // instance variables - replace the example below with your own
    private String dept, courseNo, sectionNo, days,
            room, startTime, endTime, instructor, examDate;

    /**
     * Constructor for objects of class Section
     */
    public Section()
    {
        dept = null;
        courseNo = null;
        sectionNo = null;
        room = null;
        days = null;
        startTime = null;
        endTime = null;
        instructor = null;
        examDate = null;
    }
    public void setDept(String dept){
        this.dept=dept;
    }
    public void setCourseNo(String courseNo){
        this.courseNo=courseNo;
    }
    public void setSectionNo(String sectionNo){
        this.sectionNo=sectionNo;
    }
    public void setRoom(String room){
        this.room=room;
    }
    public void setDays(String days){
        this.days=days;
    }
    public void setStartTime(String startTime){
        this.startTime=startTime;
    }
    public void setEndTime(String endTime){
        this.endTime=endTime;
    }
    public void setInstructor(String instructor){
        this.instructor=instructor;
    }
    public void setExamDate(String examDate){
        this.examDate=examDate;
    }
    public String toString(){
        return dept+"-"+courseNo+"-"+sectionNo
              +"\n\t\tin "+room
              +"\n\t\ton "+days
              +"\n\t\tfrom "+startTime+" to "+endTime
              +"\n\t\twith "+instructor
              +"\n\t\texam on "+examDate;
    }
}
