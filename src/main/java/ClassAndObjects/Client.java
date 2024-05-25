package ClassAndObjects;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student();
        /*
        new Student() => creates an object of Student class and returns
        the object reference. The object contains copy of all the attributes present
        inside the class
         */

        st1.name = "Soham";
        st1.psp = 78.6;
        st1.univName = "Scaler";
        st1.attend_class();
        st1.change_batch(2);

        Student st2 = new Student();
        st2.name = "Rajneesh";
        st2.psp = 99;
        st2.batch_id = 1;

        System.out.println(st1);
        System.out.println(st2);
        st2 = st1;
    }
}
