package Les_7;

public class Airplane_Control {
    public void moveUp() {
        System.out.println("Movement Up " + (int)(Math.random()*100+1) + " Km");
    }

    public void moveDown() {
        System.out.println("Movement Down " + (int)(Math.random()*100+1) + " Km");
    }

    public void moveLeft() {
        System.out.println("Movement Left " + (int)(Math.random()*100+1) + " Km");
    }

    public void moveRight() {
        System.out.println("Movement Right " + (int)(Math.random()*100+1) + " Km");
    }
}
