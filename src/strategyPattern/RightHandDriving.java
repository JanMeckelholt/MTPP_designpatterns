package strategyPattern;

public class RightHandDriving implements DrivingBehaviour {
   // DrivingBehaviour drivingBehaviour;
    public RightHandDriving() {
    }

    @Override
    public void drive() {
        System.out.println("I think I am special. I drive on the wrong side of the road!");
    }
}
