package factoryPattern;

public class M6Factory extends FixationObjectFactory {
    @Override
    public void build(FixationObject fixationObject) {
        System.out.println("Creating M6 " + fixationObject.getName());
    }
}
