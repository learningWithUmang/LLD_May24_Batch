package StaticLearnings;

public class Student {
    String name;
    int age;
    String email;
    String address;
    double psp;
    static String univName;
    static String dressCode;
    static String domainName;

    static void changeDomainName(String newDomainName){
        domainName = newDomainName;
    }


}
