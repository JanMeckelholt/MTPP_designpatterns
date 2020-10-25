package observerPattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Sportschau implements PropertyChangeListener {
    private String latestNews;
    SoccerResults soccerResults;

    public Sportschau(SoccerResults soccerResults) {
        this.soccerResults = soccerResults;
        soccerResults.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("newSoccerResult")) {
            latestNews = (String) evt.getNewValue();
            System.out.println("Sportschau Breaking News: " + latestNews);
        }
    }
}
