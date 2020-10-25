package adapterPattern;

public class ApaterPatternTest {

    public static void main(String[] args){
        Auto golf = new Golf();
        Auto funnyCarAdapter = new FunnyCarAdapter();

        golf.drive();
        golf.parkIn("public parking place");

        funnyCarAdapter.drive();
        funnyCarAdapter.parkIn("garage");
    }
}
