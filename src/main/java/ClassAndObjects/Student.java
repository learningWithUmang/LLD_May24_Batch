package ClassAndObjects;

public class Student {
    int rollNo;
    String name;
    String univName;
    int batch_id;
    double psp;
    void attend_class(){
        System.out.println("Student is attending the class");
    }
    void change_batch(int new_batch_id){
        batch_id = new_batch_id;
    }
    void pause_course(){
        System.out.println("Student is requesting for a pause");
    }
}
