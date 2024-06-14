package Collections;

import java.util.Comparator;

public class StudentPSPCompatator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        return (int)(student.psp - t1.psp);
    }
}
