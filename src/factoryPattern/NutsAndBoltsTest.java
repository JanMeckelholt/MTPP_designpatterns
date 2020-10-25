package factoryPattern;

//Ein abstraktes Objekt (FixationObject) hat nur Properties und Getter
//Konkrete Objekte (Nut / Bolt) beschreiben die Properties
//Eine abstrakte Fabrik (FixationObjectFactory) hat Funktion zum erzeugen des abstrakten Objektes (FixationObject)
//Konkrete Fabriken (M10Factory und M6Factory) implementieren die Erzeugen-Funktion.
// Aufruf: Instanz von konkrter Fabrik bekommt Instanz von konkretem Objekt übergeben: m6Factory.build(nut)

public class NutsAndBoltsTest {
    public static void main(String[] args){

        FixationObject nut = new Nut();
        FixationObjectFactory m10Factory = new M10Factory();
        m10Factory.build(nut);
        FixationObjectFactory m6Factory = new M6Factory();
        m6Factory.build(nut);

        FixationObject bolt = new Bolt();
        m10Factory.build(bolt);
        m6Factory.build(bolt);

        m6Factory.build(new Bolt());


    }
}
