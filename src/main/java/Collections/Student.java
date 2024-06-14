package Collections;

public class Student implements Comparable<Student> {
    String name;
    double psp;
    String univName;
    Student(String name, double psp, String univName){
        this.name = name;
        this.psp = psp;
        this.univName = univName;
    }

    /*
    Comparable interface is to define the natural ordering of
    user defined classes.
     */
    @Override
    public int compareTo(Student student) {
        if(this.psp < student.psp){
            return -1;
        } else if(student.psp < this.psp){
            return 1;
        }else{
            return this.name.compareTo(student.name);
        }
    }
}
