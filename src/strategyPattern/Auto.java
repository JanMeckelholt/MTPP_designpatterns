package strategyPattern;

public abstract class Auto {
    DrivingBehaviour drivingBehaviour;
    String name;
    public void drive(){
        drivingBehaviour.drive();
    }

    public void stateName(){
        System.out.println("I am a "+ name +".");
    }
}
