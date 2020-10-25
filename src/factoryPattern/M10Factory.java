package factoryPattern;

public class M10Factory extends FixationObjectFactory {
    @Override
    public void build(FixationObject fixationObject) {
        System.out.println("Creating M10 " + fixationObject.getName());
    }

}
