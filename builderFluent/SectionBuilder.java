
/**
 * Write a description of interface Builder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface SectionBuilder
{
    
    public Section getResult();
    public SectionBuilder forSection(String dept, 
                                     String courseNo, 
                                     String sectionNo);
    public SectionBuilder inRoom(String room);
    public SectionBuilder startingAt(String startTime);
    public SectionBuilder onDays(String days);
    public SectionBuilder endingAt(String endTime);
    public SectionBuilder taughtBy(String instructor);
    public SectionBuilder examOn(String examDate);
}