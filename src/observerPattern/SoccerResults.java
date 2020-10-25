package observerPattern;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class SoccerResults {
    private String result;

    private PropertyChangeSupport changes;

    public SoccerResults() {
        changes = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener l){
        changes.addPropertyChangeListener(l);
    }

    public void removePropertyChangeListener(PropertyChangeListener l){
        changes.removePropertyChangeListener(l);
    }

    public void setNewSoccerResult(String newResult){
        result=newResult;
        System.out.println("Latest result: " + result);
        changes.firePropertyChange("newSoccerResult", "",result);
    }


}
