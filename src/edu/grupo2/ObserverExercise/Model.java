package edu.grupo2.ObserverExercise;

import java.util.ArrayList;
import java.util.List;

public class Model {

    private int MaxAge;
    private int MinAge;
    private List<Observer> observers;

    public Model (int MaxAge, int MinAge){
        this.MaxAge = MaxAge;
        this.MinAge = MinAge;
        this.observers = new ArrayList<>();
    }

    public int getMaxAge() {
        return MaxAge;
    }

    public int getMinAge() {
        return MinAge;
    }

    public void setMaxAge(int maxAge) {
        MaxAge = maxAge;
        notifyObservers();
    }

    public void setMinAge(int minAge) {
        MinAge = minAge;
        notifyObservers();
    }

    public void attach (Observer observer){
        this.observers.add(observer);
    }

    private void notifyObservers(){
        this.observers.forEach(o -> o.notifyChange(this));
    }
}
