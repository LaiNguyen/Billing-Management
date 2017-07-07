
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import model.AggregatedRevenue;

/**
 *
 * @web http://java-buddy.blogspot.com/
 */
public class RevenueCharts extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

//    private CategoryAxis xAxis = new CategoryAxis();
//    private NumberAxis yAxis = new NumberAxis();
//    private BarChart<String, Number> stackedBarChart = new BarChart<>(xAxis, yAxis);
    public static List<AggregatedRevenue> allRevenues = new ArrayList<>();
    private String title;

//    public List<AggregatedRevenue> getAllRevenues() {
//        return allRevenues;
//    }
//
//    public void setAllRevenues(List<AggregatedRevenue> allRevenues) {
//        this.allRevenues = allRevenues;
//    }

    @Override
    public void start(Stage primaryStage) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();
        BarChart<String, Number> stackedBarChart = new BarChart<>(xAxis, yAxis);
        primaryStage.setTitle("L.A.I Soft");
        Group root = new Group();

//        xAxis.setLabel("Tiền trong tháng");
        List<String> categories = new ArrayList<>();
        for (int i = 0; i < allRevenues.size(); i++) {
            categories.add(allRevenues.get(i).getUnitName());
        }
        xAxis.setCategories(FXCollections.<String>observableArrayList(categories));
        xAxis.setTickLabelRotation(90);
//        yAxis.setLabel("Value");

        stackedBarChart.setTitle(title);

        //Series 1
        XYChart.Series<String, Number> series1 = new XYChart.Series();
        series1.setName("Tiền lời");
        for (int i = 0; i < allRevenues.size(); i++) {
            series1.getData().add(new XYChart.Data(allRevenues.get(i).getUnitName(), allRevenues.get(i).getTotalCost()));
        }
//        series1.getData().add(new XYChart.Data("January", 100));
//        series1.getData().add(new XYChart.Data("February", 200));
//        series1.getData().add(new XYChart.Data("March", 50));
//        series1.getData().add(new XYChart.Data("April", 75));
//        series1.getData().add(new XYChart.Data("May", 110));
//        series1.getData().add(new XYChart.Data("June", 300));
//        series1.getData().add(new XYChart.Data("July", 111));
//        series1.getData().add(new XYChart.Data("August", 30));
//        series1.getData().add(new XYChart.Data("September", 75));
//        series1.getData().add(new XYChart.Data("October", 55));
//        series1.getData().add(new XYChart.Data("November", 225));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
//        series1.getData().add(new XYChart.Data("December", 99));
        

//        Series 2
//        XYChart.Series<String, Number> series2 = new XYChart.Series();
//        series2.setName("XYChart.Series 2");
//
//        series2.getData().add(new XYChart.Data("January", 150));
//        series2.getData().add(new XYChart.Data("February", 100));
//        series2.getData().add(new XYChart.Data("March", 60));
//        series2.getData().add(new XYChart.Data("April", 40));
//        series2.getData().add(new XYChart.Data("May", 30));
//        series2.getData().add(new XYChart.Data("June", 100));
//        series2.getData().add(new XYChart.Data("July", 100));
//        series2.getData().add(new XYChart.Data("August", 10));
//        series2.getData().add(new XYChart.Data("September", 175));
//        series2.getData().add(new XYChart.Data("October", 155));
//        series2.getData().add(new XYChart.Data("November", 125));
//        series2.getData().add(new XYChart.Data("December", 150));

        stackedBarChart.getData().addAll(series1);
//        stackedBarChart.lookupAll(".default-color0.chart-bar")
//                .forEach(n -> n.setStyle("-fx-bar-fill: green;"));
//        stackedBarChart.lookupAll(".bar-legend-symbol")
//                .forEach(n -> n.setStyle("-fx-padding: 22px"));

        root.getChildren().addAll(stackedBarChart);

        primaryStage.setScene(new Scene(root, 500, 400));
        primaryStage.show();
//        JFXPanel fxPanel = new JFXPanel();
//        fxPanel.setScene(new Scene(root, 500, 400));
//        fxPanel.setVisible(true);
//        JFrame frame = new JFrame();
//        frame.add(fxPanel);
//        frame.setVisible(true);
    }

//    private void setMaxCategoryWidth(double maxCategoryWidth, double minCategoryGap) {
//        double catSpace = xAxis.getCategorySpacing();
//        stackedBarChart.setCategoryGap(catSpace - Math.min(maxCategoryWidth, catSpace - minCategoryGap));
//    }
}
