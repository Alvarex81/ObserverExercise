package edu.grupo2.ObserverExercise;

public class BarChartView implements Observer {

    public void display (Model model){

        System.out.println("Bar Chart View");
        System.out.println("------------");
        System.out.println("Max Age: " + model.getMaxAge());
        System.out.println("Min Age:" + model.getMinAge());
        System.out.println("------------");
    }

    @Override
    public void notifyChange(Model model) {
        this.display(model);
    }
}
