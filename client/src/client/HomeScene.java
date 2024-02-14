package client;

import client.dto.HomeChartDto;
import client.dto.HomeTableDto;
import client.dto.HomeTopDto;
import java.lang.String;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HomeScene extends StackPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Button studentsBtn;
    protected final Button coursessBtn;
    protected final Button departmentsBtn;
    protected final Button gradesBtn;
    protected final Label label;
    protected final Line line;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane1;
    protected final AnchorPane anchorPane2;
    protected final ImageView imageView0;
    protected final Label label0;
    protected final TextField studentTf;
    protected final AnchorPane anchorPane3;
    protected final ImageView imageView1;
    protected final Label label1;
    protected final TextField studentTf1;
    protected final AnchorPane anchorPane4;
    protected final ImageView imageView2;
    protected final Label label2;
    protected final TextField studentTf2;
    protected final AnchorPane anchorPane5;
    protected final TableView coursesTable;
    protected final TableColumn nameCol;
    protected final CategoryAxis categoryAxis;
    protected final NumberAxis numberAxis;
    protected final LineChart lineChart;
    protected final Button homeBtn;

    public HomeScene() {

        homeBtn = new Button();
        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        studentsBtn = new Button();
        coursessBtn = new Button();
        departmentsBtn = new Button();
        gradesBtn = new Button();
        label = new Label();
        line = new Line();
        imageView = new ImageView();
        anchorPane1 = new AnchorPane();
        anchorPane2 = new AnchorPane();
        imageView0 = new ImageView();
        label0 = new Label();
        studentTf = new TextField();
        anchorPane3 = new AnchorPane();
        imageView1 = new ImageView();
        label1 = new Label();
        studentTf1 = new TextField();
        anchorPane4 = new AnchorPane();
        imageView2 = new ImageView();
        label2 = new Label();
        studentTf2 = new TextField();
        anchorPane5 = new AnchorPane();
        coursesTable = new TableView();
        nameCol = new TableColumn();
        categoryAxis = new CategoryAxis();
        numberAxis = new NumberAxis();
        lineChart = new LineChart(categoryAxis, numberAxis);

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(720.0);
        setPrefWidth(1100.0);

        anchorPane.setPrefHeight(200.0);
        anchorPane.setPrefWidth(200.0);
        anchorPane.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane0.setPrefHeight(720.0);
        anchorPane0.setPrefWidth(201.0);
        anchorPane0.getStyleClass().add("nav-form");
        anchorPane0.getStylesheets().add("/client/dashboardDesign.css");
        
        homeBtn .setLayoutY(290.0);
        homeBtn .setMnemonicParsing(false);
        homeBtn .setPrefHeight(50.0);
        homeBtn .setPrefWidth(200.0);
        homeBtn .getStyleClass().add("nav-btn");
        homeBtn .getStylesheets().add("/client/dashboardDesign.css");
        homeBtn .setText("Home");


        studentsBtn.setLayoutY(355.0);
        studentsBtn.setMnemonicParsing(false);
        studentsBtn.setPrefHeight(50.0);
        studentsBtn.setPrefWidth(200.0);
        studentsBtn.getStyleClass().add("nav-btn");
        studentsBtn.getStylesheets().add("/client/dashboardDesign.css");
        studentsBtn.setText("Students");

        coursessBtn.setLayoutY(425.0);
        coursessBtn.setMnemonicParsing(false);
        coursessBtn.setPrefHeight(50.0);
        coursessBtn.setPrefWidth(200.0);
        coursessBtn.getStyleClass().add("nav-btn");
        coursessBtn.getStylesheets().add("/client/dashboardDesign.css");
        coursessBtn.setText("Courses");

        departmentsBtn.setLayoutY(500.0);
        departmentsBtn.setMnemonicParsing(false);
        departmentsBtn.setPrefHeight(50.0);
        departmentsBtn.setPrefWidth(200.0);
        departmentsBtn.getStyleClass().add("nav-btn");
        departmentsBtn.getStylesheets().add("/client/dashboardDesign.css");
        departmentsBtn.setText("Departments");

        gradesBtn.setLayoutY(570.0);
        gradesBtn.setMnemonicParsing(false);
        gradesBtn.setPrefHeight(50.0);
        gradesBtn.setPrefWidth(200.0);
        gradesBtn.getStyleClass().add("nav-btn");
        gradesBtn.getStylesheets().add("/client/dashboardDesign.css");
        gradesBtn.setText("Grades");

        label.setAlignment(javafx.geometry.Pos.CENTER);
        label.setContentDisplay(javafx.scene.control.ContentDisplay.CENTER);
        label.setLayoutY(154.0);
        label.setPrefHeight(107.0);
        label.setPrefWidth(200.0);
        label.setText("WELCOME");
        label.setTextAlignment(javafx.scene.text.TextAlignment.CENTER);
        label.setTextFill(javafx.scene.paint.Color.valueOf("#eeecec"));
        label.setFont(new Font("Bell MT Bold", 30.0));

        line.setEndX(72.5);
        line.setLayoutX(113.0);
        line.setLayoutY(250.0);
        line.setStartX(-98.0);
        line.setStroke(javafx.scene.paint.Color.valueOf("#e1dfdf"));

        imageView.setFitHeight(123.0);
        imageView.setFitWidth(144.0);
        imageView.setLayoutX(39.0);
        imageView.setLayoutY(41.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("icon.png").toExternalForm()));

        anchorPane1.setLayoutX(213.0);
        anchorPane1.setLayoutY(9.0);
        anchorPane1.setPrefHeight(280.0);
        anchorPane1.setPrefWidth(879.0);
        anchorPane1.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane2.setLayoutX(30.0);
        anchorPane2.setLayoutY(26.0);
        anchorPane2.setPrefHeight(233.0);
        anchorPane2.setPrefWidth(259.0);
        anchorPane2.getStyleClass().add("nav-form");
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        imageView0.setFitHeight(161.0);
        imageView0.setFitWidth(160.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(14.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("Images/studentcount.png").toExternalForm()));

        label0.setLayoutX(23.0);
        label0.setLayoutY(174.0);
        label0.setPrefHeight(35.0);
        label0.setPrefWidth(187.0);
        label0.setText("Total Students");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        label0.setFont(new Font("System Bold", 24.0));

        studentTf.setEditable(false);
        studentTf.setLayoutX(193.0);
        studentTf.setLayoutY(137.0);
        studentTf.setPrefHeight(37.0);
        studentTf.setPrefWidth(62.0);
        studentTf.getStyleClass().add("nav-btn");
        studentTf.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane3.setLayoutX(311.0);
        anchorPane3.setLayoutY(26.0);
        anchorPane3.setPrefHeight(233.0);
        anchorPane3.setPrefWidth(267.0);
        anchorPane3.getStyleClass().add("nav-form");
        anchorPane3.getStylesheets().add("/client/dashboardDesign.css");

        imageView1.setFitHeight(161.0);
        imageView1.setFitWidth(160.0);
        imageView1.setLayoutX(14.0);
        imageView1.setLayoutY(14.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("Images/deptIcon.png").toExternalForm()));

        label1.setLayoutX(14.0);
        label1.setLayoutY(184.0);
        label1.setPrefHeight(35.0);
        label1.setPrefWidth(227.0);
        label1.setText("Total Departments");
        label1.setTextFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        label1.setFont(new Font("System Bold", 24.0));

        studentTf1.setEditable(false);
        studentTf1.setLayoutX(188.0);
        studentTf1.setLayoutY(137.0);
        studentTf1.setPrefHeight(37.0);
        studentTf1.setPrefWidth(62.0);
        studentTf1.getStyleClass().add("nav-btn");
        studentTf1.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane4.setLayoutX(602.0);
        anchorPane4.setLayoutY(26.0);
        anchorPane4.setPrefHeight(233.0);
        anchorPane4.setPrefWidth(259.0);
        anchorPane4.getStyleClass().add("nav-form");
        anchorPane4.getStylesheets().add("/client/dashboardDesign.css");

        imageView2.setFitHeight(160.0);
        imageView2.setFitWidth(153.0);
        imageView2.setLayoutX(14.0);
        imageView2.setLayoutY(14.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("Images/courseicaon.png").toExternalForm()));

        label2.setLayoutX(23.0);
        label2.setLayoutY(174.0);
        label2.setPrefHeight(35.0);
        label2.setPrefWidth(187.0);
        label2.setText("Total Courses");
        label2.setTextFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        label2.setFont(new Font("System Bold", 24.0));

        studentTf2.setEditable(false);
        studentTf2.setLayoutX(193.0);
        studentTf2.setLayoutY(137.0);
        studentTf2.setPrefHeight(37.0);
        studentTf2.setPrefWidth(62.0);
        studentTf2.getStyleClass().add("nav-btn");
        studentTf2.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane5.setLayoutX(213.0);
        anchorPane5.setLayoutY(316.0);
        anchorPane5.setPrefHeight(392.0);
        anchorPane5.setPrefWidth(879.0);
        anchorPane5.getStylesheets().add("/client/dashboardDesign.css");

        coursesTable.setLayoutX(693.0);
        coursesTable.setLayoutY(22.0);
        coursesTable.setPrefHeight(343.0);
        coursesTable.setPrefWidth(172.0);
        coursesTable.getStylesheets().add("/client/dashboardDesign.css");

        nameCol.setPrefWidth(171.0);
        nameCol.setText("Course Name");

        categoryAxis.setSide(javafx.geometry.Side.BOTTOM);

        numberAxis.setSide(javafx.geometry.Side.LEFT);
        lineChart.setLayoutX(10.0);
        lineChart.setLayoutY(22.0);
        lineChart.setPrefHeight(360.0);
        lineChart.setPrefWidth(658.0);

        anchorPane0.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(studentsBtn);
        anchorPane0.getChildren().add(coursessBtn);
        anchorPane0.getChildren().add(departmentsBtn);
        anchorPane0.getChildren().add(gradesBtn);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(line);
        anchorPane0.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane0);
        anchorPane2.getChildren().add(imageView0);
        anchorPane2.getChildren().add(label0);
        anchorPane2.getChildren().add(studentTf);
        anchorPane1.getChildren().add(anchorPane2);
        anchorPane3.getChildren().add(imageView1);
        anchorPane3.getChildren().add(label1);
        anchorPane3.getChildren().add(studentTf1);
        anchorPane1.getChildren().add(anchorPane3);
        anchorPane4.getChildren().add(imageView2);
        anchorPane4.getChildren().add(label2);
        anchorPane4.getChildren().add(studentTf2);
        anchorPane1.getChildren().add(anchorPane4);
        anchorPane.getChildren().add(anchorPane1);
        coursesTable.getColumns().add(nameCol);
        anchorPane5.getChildren().add(coursesTable);
        anchorPane5.getChildren().add(lineChart);
        anchorPane.getChildren().add(anchorPane5);
        getChildren().add(anchorPane);
        
        studentsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                StudentScene gradeScene = new StudentScene();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(gradeScene, 1100, 720);
                stage.setScene(scene);
            }
        });
        
        DataAccessLayer conn = new DataAccessLayer();
        HomeTopDto result;
        
        try {
            result = conn.getHomeTopData();
            studentTf.setText(result.getStudents());
            studentTf1.setText(result.getDepts());
            studentTf2.setText(result.getCourses());
            
            ArrayList<HomeTableDto> result2 = conn.getHomeTableData();
            ObservableList<HomeTableDto> studentsList = FXCollections.observableArrayList(result2);
            coursesTable.setItems(studentsList);
            nameCol.setCellValueFactory(new PropertyValueFactory<>("courseName"));

        } catch (SQLException ex) {
            Logger.getLogger(HomeScene.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        coursesTable.setOnMouseClicked(event -> {
        if (event.getClickCount() == 1) { // Check for single click
            HomeTableDto selectedItem = (HomeTableDto) coursesTable.getSelectionModel().getSelectedItem();
            if (selectedItem != null) {
                String selectedCourseName = selectedItem.getCourseName();
                try {
                    //System.out.println(selectedCourseName);
                    ArrayList<HomeChartDto> data = conn.getHomeChartData(selectedCourseName);
                    XYChart.Series<String, Number> series = new XYChart.Series<>();
                    for (HomeChartDto entry : data) {
                        series.getData().add(new XYChart.Data<>(entry.getDate(), Integer.parseInt(entry.getAvgGrade())));
                    }
                    lineChart.getData().clear(); // Clear previous data
                    lineChart.getData().add(series);
                    } 
                    catch (SQLException ex) {
                    Logger.getLogger(HomeScene.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
            }
        });
        
        departmentsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                DepartmentScene departmentsScene = new DepartmentScene();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(departmentsScene, 1100, 720);
                stage.setScene(scene);
            }
        });
    
    coursessBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                CourseScene courseScene = new CourseScene();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(courseScene, 1100, 720);
                stage.setScene(scene);
            }
        });
    
    gradesBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                GradeScene gradeScene = new GradeScene();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(gradeScene, 1100, 720);
                stage.setScene(scene);
            }
        });
    
    studentsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                StudentScene gradeScene = new StudentScene();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(gradeScene, 1100, 720);
                stage.setScene(scene);
            }
        });

    }
}
