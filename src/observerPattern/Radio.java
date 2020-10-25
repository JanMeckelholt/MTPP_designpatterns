package observerPattern;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Radio implements PropertyChangeListener {
    private String latestSoccerNews;
    private SoccerResults soccerResults;

    public Radio(SoccerResults soccerResults) {
        this.soccerResults = soccerResults;
        soccerResults.addPropertyChangeListener(this);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if (evt.getPropertyName().equals("newSoccerResult")){
            latestSoccerNews = (String) evt.getNewValue();
            System.out.println("Radio Soccer with the latest results: " + latestSoccerNews);
        }
    }
}
