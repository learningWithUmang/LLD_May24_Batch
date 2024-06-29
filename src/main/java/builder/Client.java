package builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Umang");
//        builder.setAge(25);
//        builder.setBatch("Academy nov");
//        builder.setPsp(86);
//        builder.setGradYear(2022);
//
//        Student st = builder.build();

         Student st = Student.getBuilder()
                 .setName("Umang")
                 .setAge(25)
                 .setGradYear(2022)
                 .setPsp(90)
                 .setUniversityName("ABC")
                 .build();

        System.out.println("DEBUG");
    }
}
