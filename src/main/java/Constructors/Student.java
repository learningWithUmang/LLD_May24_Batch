package Constructors;

public class Student {
    int rollNo = 4;
    double psp;
    String univName;
    int roomNo;

    void fillCoffee(Student st){
        st = new Student();
        System.out.println("Sometjhing");
    }
//    Student(){
//        rollNo = 6;
//        psp = 0.90;
//        univName = "Hello";
//        roomNo = 102;
//    }
    Student(int rollNo, String univName){
        this.rollNo = rollNo;
        this.univName = univName;
    }

    Student(int rollNo){
        this.rollNo = rollNo;
    }

    Student(){
        //work like a default ctro
    }

    Student(Student oldObject){ // Copy constructor accepts an object of the same class
        this.rollNo = oldObject.rollNo;
        this.univName = oldObject.univName;
        this.psp = oldObject.psp;
        this.roomNo = oldObject.roomNo;
    }

    Student(String heyMan){
        /*
        here you should write valid code
         */
        this.univName = heyMan;
    }
    /*
    className var1 = new className();
     */
}

/*
Without constructor, we can't create objects
Constructors creates objects
 */
