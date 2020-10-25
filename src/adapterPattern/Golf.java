package adapterPattern;

public class Golf extends Auto {
    public Golf() {
    }

    @Override
    public void drive() {
        System.out.println("I am driving my Golf!");
    }

    @Override
    public void parkIn(String parkingPlace) {
        System.out.println("I am parking my Golf in " + parkingPlace);
    }
}
