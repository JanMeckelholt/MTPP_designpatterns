package observerPattern;

public class ObserverPatternTest {

    public static void main(String[] args){
        SoccerResults soccerResults = new SoccerResults();
        Sportschau sportschau = new Sportschau(soccerResults);
        Radio radio = new Radio(soccerResults);

        soccerResults.setNewSoccerResult("S04 - BVB: 4:0");
        soccerResults.setNewSoccerResult("Bayern hat verloren!");
    }
}
