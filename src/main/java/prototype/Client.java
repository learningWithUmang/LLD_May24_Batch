package prototype;

public class Client {

    private static void fillRegistry(StudentRegistry studentRegistry){
        Student july23BegineerBatch = new Student();
        july23BegineerBatch.setBatch("July23 begineer");
        july23BegineerBatch.setInsName("Umang Agrawal");
        july23BegineerBatch.setAvgBatchPsp(40);
        july23BegineerBatch.moduleName = "LLD2";
        studentRegistry.register("july23BegineerBatch", july23BegineerBatch);

        IntelligentStudent july23IntelligentStudents = new IntelligentStudent();
        july23IntelligentStudents.insName = "umang";
        july23IntelligentStudents.iq = 160;
        july23IntelligentStudents.intelligenceScore = 100;
        july23IntelligentStudents.setBatch("fesk");
        studentRegistry.register("july23IntelligentStudents", july23IntelligentStudents);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student prototype = studentRegistry.get("july23BegineerBatch");
        prototype.moduleName = "Sfw";
        //prototype.iq = "23";
        studentRegistry.register("july23BegineerBatch", prototype);


        Student hetul = studentRegistry.get("july23BegineerBatch").clone();
        hetul.setName("hetul");
        hetul.setAge(35);
        hetul.setPsp(80);

        Student anshuman = studentRegistry.get("july23BegineerBatch").clone();
        anshuman.setName("Anshuman dwidedi");
        anshuman.setAge(40);
        anshuman.setPsp(80);

        Student mahendra = studentRegistry.get("july23IntelligentStudents").clone();
        mahendra.setName("Mahendra");
        mahendra.setAge(100);
        mahendra.setPsp(94);

        System.out.println("Debug");

    }
}
