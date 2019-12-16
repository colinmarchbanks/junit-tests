import org.junit.*;
import static org.junit.Assert.*;

public class CohortTest {

    public Cohort emptyCohort;
    public Cohort oneStudentCohort;
    public Cohort manyStudentCohort;

    @Before public void setUp(){
        emptyCohort = new Cohort();

        oneStudentCohort = new Cohort();
        oneStudentCohort.addStudent(new Student("Colin",12345));

        manyStudentCohort = new Cohort();
        manyStudentCohort.addStudent(new Student("Colin",12345));
        manyStudentCohort.addStudent(new Student("Eduardo",54321));
        manyStudentCohort.addStudent(new Student("Bill",9876));
        manyStudentCohort.addStudent(new Student("Kenneth",74747));
    }

    @Test public void testAddStudent(){
        assertTrue(emptyCohort.getStudents().isEmpty());
        emptyCohort.addStudent(new Student("Colin",12345));
        assertFalse(emptyCohort.getStudents().isEmpty());
        assertEquals("Colin",emptyCohort.getStudents().get(0).getName());
    }

    @Test public void testGetStudents(){
        assertTrue(emptyCohort.getStudents().isEmpty());
        assertFalse(oneStudentCohort.getStudents().isEmpty());
        assertFalse(manyStudentCohort.getStudents().isEmpty());
    }

    @Test public void testGetCohortAverage(){
        manyStudentCohort.getStudents().get(0).addGrade(10);
        manyStudentCohort.getStudents().get(1).addGrade(20);
        manyStudentCohort.getStudents().get(2).addGrade(30);
        manyStudentCohort.getStudents().get(3).addGrade(40);
        assertEquals(25,manyStudentCohort.getCohortAverage(),0);

    }

}
