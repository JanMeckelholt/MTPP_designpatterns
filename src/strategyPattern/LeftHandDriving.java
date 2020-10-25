package strategyPattern;

public class LeftHandDriving implements DrivingBehaviour{
    @Override
    public void drive() {
        System.out.println("I am driving normally!");
    }
}
