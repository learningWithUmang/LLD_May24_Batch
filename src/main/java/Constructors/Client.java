package Constructors;

public class Client {
    public static void main(String[] args) {
        //Student st1 = new Student(50, "XYZ");

        //Student st2 = new Student(30);
        //st2.roomNo = 4;

        //Student st3 = new Student();
        //Student st4 = new Student();


        Student st1 = new Student();
        st1.roomNo = 1;
        st1.univName = "ABC";
        st1.rollNo = 4;
        st1.psp = 90;

        st1.fillCoffee(st1);


//        Student st2 = new Student();
//        st2.roomNo = 1;
//        st2.univName = "ABC";
//        st2.rollNo = 4;
//        st2.psp = 90;



        Student st1Copy = new Student(st1);
        //st1Copy.univName = "XYZ";

        /*
        I want to create a new object with exact same set of values for the attributes
         */
        Student st2 = st1;
        //st2.rollNo = 100;



        System.out.println(st1);
        System.out.println(st2);


    }
}
