package client;

import client.dto.ReportIntialsDto;
import client.dto.ReportTableDto;
import java.lang.String;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class StudentReport extends StackPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final TableView reportTable;
    protected final TableColumn coursenameCol;
    protected final TableColumn tableColumn;
    protected final TableColumn descriptionCol;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final CategoryAxis categoryAxis;
    protected final NumberAxis numberAxis;
    protected final BarChart barChart;
    protected final Label label;
    protected final TextField gpaTf;
    protected final TextField nameTf;
    protected final TextField levelTf;
    protected final Label label0;
    protected final Button refreshBtn;

    public StudentReport(String studentId) {

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        reportTable = new TableView();
        coursenameCol = new TableColumn();
        tableColumn = new TableColumn();
        descriptionCol = new TableColumn();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        categoryAxis = new CategoryAxis();
        numberAxis = new NumberAxis();
        barChart = new BarChart(categoryAxis, numberAxis);
        label = new Label();
        gpaTf = new TextField();
        nameTf = new TextField();
        levelTf = new TextField();
        label0 = new Label();
        refreshBtn = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(480.0);
        setPrefWidth(820.0);

        anchorPane.setPrefHeight(480.0);
        anchorPane.setPrefWidth(820.0);
        anchorPane.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane0.setLayoutX(13.0);
        anchorPane0.setLayoutY(32.0);
        anchorPane0.setPrefHeight(214.0);
        anchorPane0.setPrefWidth(788.0);
        anchorPane0.getStylesheets().add("/client/dashboardDesign.css");

        reportTable.setLayoutX(7.0);
        reportTable.setLayoutY(7.0);
        reportTable.setPrefHeight(200.0);
        reportTable.setPrefWidth(774.0);
        reportTable.getStylesheets().add("/client/dashboardDesign.css");

        coursenameCol.setPrefWidth(289.0);
        coursenameCol.setText("Course Name");

        tableColumn.setPrefWidth(262.0);
        tableColumn.setText("Grade");

        descriptionCol.setPrefWidth(214.0);
        descriptionCol.setText("Description");

        anchorPane1.setLayoutX(13.0);
        anchorPane1.setLayoutY(260.0);
        anchorPane1.setPrefHeight(214.0);
        anchorPane1.setPrefWidth(788.0);
        anchorPane1.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane2.setLayoutX(5.0);
        anchorPane2.setLayoutY(6.0);
        anchorPane2.setPrefHeight(200.0);
        anchorPane2.setPrefWidth(579.0);
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        categoryAxis.setSide(javafx.geometry.Side.BOTTOM);

        numberAxis.setSide(javafx.geometry.Side.LEFT);
        barChart.setLayoutX(-1.0);
        barChart.setPrefHeight(200.0);
        barChart.setPrefWidth(586.0);

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setLayoutX(583.0);
        label.setLayoutY(61.0);
        label.setPrefHeight(27.0);
        label.setPrefWidth(76.0);
        label.setText("GPA");
        label.setFont(new Font("System Bold", 18.0));

        gpaTf.setEditable(false);
        gpaTf.setLayoutX(655.0);
        gpaTf.setLayoutY(59.0);
        gpaTf.setPrefHeight(31.0);
        gpaTf.setPrefWidth(119.0);
        gpaTf.getStyleClass().add("textfield");
        gpaTf.getStylesheets().add("/client/dashboardDesign.css");

        nameTf.setEditable(false);
        nameTf.setLayoutX(602.0);
        nameTf.setLayoutY(14.0);
        nameTf.setPrefHeight(31.0);
        nameTf.setPrefWidth(179.0);
        nameTf.getStyleClass().add("textfield");
        nameTf.getStylesheets().add("/client/dashboardDesign.css");

        levelTf.setAlignment(javafx.geometry.Pos.CENTER);
        levelTf.setLayoutX(659.0);
        levelTf.setLayoutY(105.0);
        levelTf.setPrefHeight(31.0);
        levelTf.setPrefWidth(119.0);
        levelTf.getStyleClass().add("textfield");
        levelTf.getStylesheets().add("/client/dashboardDesign.css");

        label0.setAlignment(javafx.geometry.Pos.CENTER);
        label0.setLayoutX(588.0);
        label0.setLayoutY(107.0);
        label0.setPrefHeight(27.0);
        label0.setPrefWidth(67.0);
        label0.setText("level");
        label0.setFont(new Font("System Bold", 18.0));

        refreshBtn.setLayoutX(609.0);
        refreshBtn.setLayoutY(155.0);
        refreshBtn.setMnemonicParsing(false);
        refreshBtn.setPrefHeight(45.0);
        refreshBtn.setPrefWidth(165.0);
        refreshBtn.getStyleClass().add("add-btn");
        refreshBtn.getStylesheets().add("/client/dashboardDesign.css");
        refreshBtn.setText("Refresh");

        reportTable.getColumns().add(coursenameCol);
        reportTable.getColumns().add(tableColumn);
        reportTable.getColumns().add(descriptionCol);
        anchorPane0.getChildren().add(reportTable);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane2.getChildren().add(barChart);
        anchorPane1.getChildren().add(anchorPane2);
        anchorPane1.getChildren().add(label);
        anchorPane1.getChildren().add(gpaTf);
        anchorPane1.getChildren().add(nameTf);
        //anchorPane1.getChildren().add(levelTf);
        //anchorPane1.getChildren().add(label0);
        //anchorPane1.getChildren().add(refreshBtn);
        anchorPane.getChildren().add(anchorPane1);
        getChildren().add(anchorPane);
        
        
        
        DataAccessLayer conn = new DataAccessLayer();
        try {
            ReportIntialsDto result = conn.getReportIntialsData(studentId);
            nameTf.setText(result.getName());
            gpaTf.setText(result.getGpa());
        } catch (SQLException ex) {
            Logger.getLogger(StudentReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        try {
            ArrayList<ReportTableDto> result = conn.getReportTableData(studentId);
            
            
            ObservableList<ReportTableDto> reportData = FXCollections.observableArrayList(result);
         
            reportTable.setItems(reportData);
            coursenameCol.setCellValueFactory(new PropertyValueFactory<>("Name"));
            tableColumn.setCellValueFactory(new PropertyValueFactory<>("grade"));
            descriptionCol.setCellValueFactory(new PropertyValueFactory<>("description"));
            
            for (ReportTableDto dto : result) {
            String courseName = dto.getName();
            String gpa = dto.getGrade();

            // Create a series for each course
            XYChart.Series<String, Number> series = new XYChart.Series<>();
            series.setName(courseName);

            // Add data point with course name and GPA
            series.getData().add(new XYChart.Data<>(courseName, Double.parseDouble(gpa)));

            // Add the series to the bar chart
            barChart.getData().add(series);
            }

            // Rotate X-axis labels
            categoryAxis.setTickLabelRotation(360);
                

        } catch (SQLException ex) {
            Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
