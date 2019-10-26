package Les_7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight: ");
        int weight = in.nextInt();
        System.out.println("Enter width: ");
        int width = in.nextInt();
        System.out.println("Enter length: ");
        int length = in.nextInt();
        System.out.println("Enter current speed: ");
        int currentSpeed = in.nextInt();
        System.out.println("Enter plane colour: ");
        String planeColour = in.nextLine();
        SU_27 su_27 = new SU_27(weight, width, length, currentSpeed, planeColour);
        su_27.engineStart();
        su_27.planeTakeoff();
        su_27.moveUp();
        su_27.moveLeft();
        su_27.moveDown();
        su_27.moveRight();
        su_27.stealthTech();
        su_27.nuclearStrike();
        su_27.turboSpeed();
        su_27.planeLanding();
    }
}
