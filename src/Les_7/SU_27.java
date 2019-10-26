package Les_7;

public class SU_27 extends Plane implements Special_Abilities {
    private int currentSpeed;
    private String planeColour;
    private Airplane_Control airplane_control = new Airplane_Control();
    public SU_27(int weight, int width, int length, int currentSpeed, String planeColour) {
        super(weight, width, length);
        this.currentSpeed = currentSpeed;
        this.planeColour = planeColour;
    }

    @Override
    public void stealthTech() {
        System.out.println("Stealth mode - " + (int)(Math.random()*21) + " Sec");
    }

    @Override
    public void turboSpeed() {
        System.out.println("Current Turbo Speed - " + (int)(Math.random()*500 + 2500) + " Km/h"); //Максимальна швидкість Су-27 = 2500
    }

    @Override
    public void nuclearStrike() {
        System.out.println("Nuclear Strikes - " + (int)(Math.random()*10+1) + " Warheads");

    }
    public void moveUp(){
        airplane_control.moveUp();
    }
    public void moveDown(){
        airplane_control.moveDown();
    }
    public void moveLeft(){
        airplane_control.moveLeft();
    }
    public void moveRight(){
        airplane_control.moveRight();
    }
}
