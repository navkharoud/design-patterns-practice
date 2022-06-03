
/**
 * Write a description of class Director here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Director
{
    public static void main(String[] args)
    {
        SectionBuilder sb = new ClassSectionBuilder()
          .forSection("ACS", "3913", "001")
          .inRoom("3D03")
          .startingAt("11:30am")
          .onDays("TuTh")
          .endingAt("12:45pm")
          .taughtBy("McFadyen")
          .examOn("April 16, 2021");
        System.out.println("Section: "+sb.getResult());

    }
}
