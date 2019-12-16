import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        if(grades.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

}
