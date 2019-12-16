import org.junit.*;
import static org.junit.Assert.*;

public class StudentTest {

    Student student = new Student("name",123456);
    Student student1 = new Student("Terrell",654321);

    @Test
    public void testConstructorValid(){
        assertEquals("name",student.getName());
        assertEquals(123456,student.getId());
        assertTrue(student.getGrades().isEmpty());
        assertEquals("Terrell",student1.getName());
        assertEquals(654321,student1.getId());
        assertTrue(student1.getGrades().isEmpty());
    }

    @Test public void testGetId(){
        assertEquals(123456,student.getId());
        assertEquals(654321,student1.getId());
    }

    @Test public void testGetName(){
        assertEquals("name",student.getName());
        assertEquals("Terrell",student1.getName());
    }

    @Test public void testAddGrade(){
        student.addGrade(99);
        student1.addGrade(80);
        assertFalse(student.getGrades().isEmpty());
        assertFalse(student1.getGrades().isEmpty());
        int firstGrade = student.getGrades().get(0);
        assertEquals(99,firstGrade);
        firstGrade = student1.getGrades().get(0);
        assertEquals(80,firstGrade);
        assertEquals(1,student.getGrades().size());
    }

    @Test public void testGetGradeAverage(){
        student.addGrade(25);
        student.addGrade(50);
        student.addGrade(75);
        assertEquals(50,student.getGradeAverage(),0);
        assertNotEquals(49,student.getGradeAverage(),0);
    }

}
