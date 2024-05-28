package LearningInheritance;

public class Instructor extends User{
    String batchName;
    double avgRating;
    void scheduleClass(){
        System.out.println("Scheduling a class");
    }

    Instructor(){
        System.out.println("Constructor of Instructor is called");
    }
}


/*
extends = add
 */