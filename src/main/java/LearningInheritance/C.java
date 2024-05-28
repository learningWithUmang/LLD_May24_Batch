package LearningInheritance;

public class C extends B{
    int a = 10;
    String s;
    double psp = 90.0;

//    C(){
//        System.out.println("Constructor of C is called");
//    }
    C(int a){
        super();
    }
    C(String x){
        super(2);
        System.out.println("Constructor of C with a string param");
        s  =x;
    }
    C(int a, int b){

    }
//    C(int a11, int b11){
//
//    }
}
