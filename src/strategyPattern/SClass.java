package strategyPattern;

public class SClass extends Auto {


    public SClass() {
        name="S-Class";
        drivingBehaviour=new LeftHandDriving();
    }
}
