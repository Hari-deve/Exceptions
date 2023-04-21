import java.util.Scanner;

public class Matrimony {
    static Scanner choose=new Scanner(System.in);
    public static void main(String[] args) throws UnderQualifiedToMarryException,OverQualifiedToMarryException{
        System.out.println("Welcome  to MMM Matrimony\nPlease Enter Your Age");
        int age=choose.nextInt();
        if (age<=18){
            throw new UnderQualifiedToMarryException("You need to wait till you reach 18 above");
        } else if (age>18&&age<35) {
            System.out.println("Welcome to Sweet Hell");
        }else {
            throw new OverQualifiedToMarryException("Sorry you are crossed your Age limits");
        }
    }
}