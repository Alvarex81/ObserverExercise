package edu.grupo2.ObserverExercise;

public class Main {

    public static void main(String[] args) {

        Model model = new Model(50, 10);
        TableView tableView = new TableView();
        BarChartView barChartView = new BarChartView();
        PieChartView pieChartView = new PieChartView();

        model.attach(tableView);
        model.attach(barChartView);
        model.attach(pieChartView);

        model.setMaxAge(100);
        model.setMinAge(5);
    }
}
