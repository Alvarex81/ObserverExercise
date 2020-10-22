package edu.grupo2.ObserverExercise;

public class Main {

    public static void main(String[] args) {

        Model model = new Model(50, 10);
        Observer tableView = new TableView();
        Observer barChartView = new BarChartView();
        Observer pieChartView = new PieChartView();

        model.attach(tableView);
        model.attach(barChartView);
        model.attach(pieChartView);

        model.setMaxAge(100);
        model.setMinAge(5);
    }
}
