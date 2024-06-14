package Collections;

import java.util.Comparator;

public class StudentPSPUnivNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student student, Student t1) {
        if(student.psp < t1.psp) return -1;
        else if(t1.psp < student.psp) return 1;
        else{
            return student.univName.compareTo(t1.univName);
        }
    }
}
