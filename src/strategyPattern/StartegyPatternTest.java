package strategyPattern;

public class StartegyPatternTest {
    public static void main(String[] args){
        Auto golf = new SClass();
        Auto astonMartin = new AstonMartin();

        golf.stateName();
        golf.drive();
        astonMartin.stateName();
        astonMartin.drive();
    }
}
