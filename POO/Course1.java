import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Course1{

    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();

    public Course1() {

    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        boolean temp = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).equals(student)) {
                students.remove(i);
                temp = true;
            }
        }
        if (!temp) {
            JOptionPane.showMessageDialog(null, "No se encontro el estudiante: "+student);
        }
    }

    public ArrayList<String> getStudents() {
        return this.students;
    }

    public int getNumberOfStudents() {
        return students.size();
    }

}
