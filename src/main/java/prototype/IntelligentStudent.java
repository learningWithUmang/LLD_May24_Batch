package prototype;

public class IntelligentStudent extends Student{
    int iq;
    double intelligenceScore;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent student){
        //initialize the parent attributes
        super(student);
        this.iq = student.iq;
        this.intelligenceScore = student.intelligenceScore;
    }
    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
