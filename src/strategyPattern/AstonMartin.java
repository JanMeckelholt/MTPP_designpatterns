package strategyPattern;

public class AstonMartin extends Auto {
    public AstonMartin() {
        name = "Aston Martin";
        drivingBehaviour=new RightHandDriving();
    }
}
