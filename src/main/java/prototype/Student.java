package prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    double psp;
    private String batch;
    double avgBatchPsp;
    String insName;
    String moduleName;

    Student(){

    }

    /*
    copy() -> clone()
     */

    /*
    copy constructor is the one who takes an older object and copies the attributes
    from the older to newer object
     */
    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.insName = student.insName;
        this.avgBatchPsp = student.avgBatchPsp;
        this.moduleName = student.moduleName;
        this.batch = student.batch;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    //st.clone();


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
