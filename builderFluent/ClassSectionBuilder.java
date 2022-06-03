
/**
 * Write a description of class Section here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassSectionBuilder implements SectionBuilder
{
    // instance variables - replace the example below with your own
    private Section content;

    /**
     * Constructor for objects of class Section
     */
    public ClassSectionBuilder()
    {
        content = new Section();
    }
    public Section getResult(){
        return content;
    }
    /**
     * Note in all methods below that they return 'this'
     * And so these methods can be chained together.
     */
    public ClassSectionBuilder forSection(String dept, 
                                    String courseNo, 
                                    String sectionNo){
        content.setDept(dept);
        content.setCourseNo(courseNo);
        content.setSectionNo(sectionNo);
        return this;
    }
    public ClassSectionBuilder inRoom(String room){
        content.setRoom(room);
        return this;
    }
    public ClassSectionBuilder startingAt(String startTime){
        content.setStartTime(startTime);
        return this;
    }
    public ClassSectionBuilder onDays(String days){
        content.setDays(days);
        return this;
    }
    public ClassSectionBuilder endingAt(String endTime){
        content.setEndTime(endTime);
        return this;
    }
    public ClassSectionBuilder taughtBy(String instructor){
        content.setInstructor(instructor);
        return this;
    }
    public ClassSectionBuilder examOn(String examDate){
        content.setExamDate(examDate);
        return this;
    }
}
