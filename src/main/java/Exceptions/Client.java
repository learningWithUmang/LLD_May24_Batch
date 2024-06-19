package Exceptions;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Student st1 = new Student();
        /*
        try catch
         */
        try {
            st1.findStudentByRollNo(50);
        } catch(ClassNotFoundException ex1){
            System.out.println("I am handling class not found exception");
            throw new ClassNotFoundException();
            //System.out.println("There's an error at " + ex1.);
            /*
            Handling will be done here as per your business use case
             */
        }catch (OddNumberException ex2){
            System.out.println("I am handling odd no exception");
        } catch (EvenNumberException ex3){
            System.out.println("I am handling even no exception");
        } finally{
            System.out.println("I am inside finally block, will execute irrespective of what happens");
        }


        System.out.println("I am outside try catch");
        //st1.doShit(10);

        /*

        /*
        finally is something which will run irrespective of what happens
         */



//        try{
//            st1.doSomething(20);
//        } catch(SQLException ex1){
//            /*
//            Business decision, rtetry,
//             */
//            System.out.println("I am doing some workaround");
//            throw new SQLException();
//        }
    }
}
