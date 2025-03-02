package controlFlowSt;
import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Math's Score : ");
        float mScore = scanner.nextFloat();
        System.out.print("Enter your Khmer's Score : ");
        float kScore = scanner.nextFloat();
        System.out.print("Enter your English's Score : ");
        float eScore = scanner.nextFloat();
        System.out.print("Enter your Physic's Score : ");
        float pScore = scanner.nextFloat();
        float avg = (mScore + kScore + eScore)/3;
        //casting
        int newAvg = (int) avg;
        if(newAvg <= 100 && newAvg >= 90){
            System.out.println("You got : A " + " Average : " + avg + " Score : " + newAvg);
        }else if(newAvg <= 90 && newAvg >= 80){
            System.out.println("You got : B "  + " Average : " + avg + " Score : " + newAvg);
        }else if(newAvg <= 80 && newAvg >= 70){
            System.out.println("You got : C "  + " Average : " + avg + " Score : " + newAvg);
        }else if(newAvg <= 70 && newAvg >= 60){
            System.out.println("You got : D "  + " Average : " + avg + " Score : " + newAvg);
        }else if(newAvg <= 60 && newAvg >= 50){
            System.out.println("You got : E "  + " Average : " + avg + " Score : " + newAvg);
        }
    }
}
