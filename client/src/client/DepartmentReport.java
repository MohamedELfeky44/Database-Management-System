package client;

import client.dto.DepartmentTableReport;
import client.dto.DepartmentTopReport;
import java.lang.String;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;

public class DepartmentReport extends StackPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final AnchorPane anchorPane1;
    protected final ImageView imageView;
    protected final Label label;
    protected final TextField studentTf;
    protected final AnchorPane anchorPane2;
    protected final ImageView imageView0;
    protected final Label label0;
    protected final TextField totalCoursesTf;
    protected final AnchorPane anchorPane3;
    protected final TableView reportTable;
    protected final TableColumn coursenameCol;
    protected final TableColumn GradeCol;

    public DepartmentReport(String departmentId) throws SQLException {

        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        anchorPane1 = new AnchorPane();
        imageView = new ImageView();
        label = new Label();
        studentTf = new TextField();
        anchorPane2 = new AnchorPane();
        imageView0 = new ImageView();
        label0 = new Label();
        totalCoursesTf = new TextField();
        anchorPane3 = new AnchorPane();
        reportTable = new TableView();
        coursenameCol = new TableColumn();
        GradeCol = new TableColumn();

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
        anchorPane0.setLayoutY(20.0);
        anchorPane0.setPrefHeight(207.0);
        anchorPane0.setPrefWidth(788.0);
        anchorPane0.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane1.setLayoutX(39.0);
        anchorPane1.setLayoutY(13.0);
        anchorPane1.setPrefHeight(182.0);
        anchorPane1.setPrefWidth(354.0);
        anchorPane1.getStyleClass().add("nav-form");
        anchorPane1.getStylesheets().add("/client/dashboardDesign.css");

        imageView.setFitHeight(133.0);
        imageView.setFitWidth(142.0);
        imageView.setLayoutX(14.0);
        imageView.setLayoutY(14.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("Images/studentcount.png").toExternalForm()));

        label.setLayoutX(54.0);
        label.setLayoutY(130.0);
        label.setPrefHeight(35.0);
        label.setPrefWidth(187.0);
        label.setText("Total Students");
        label.setTextFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        label.setFont(new Font("System Bold", 24.0));

        studentTf.setEditable(false);
        studentTf.setLayoutX(237.0);
        studentTf.setLayoutY(132.0);
        studentTf.setPrefHeight(37.0);
        studentTf.setPrefWidth(62.0);
        studentTf.getStyleClass().add("nav-btn");
        studentTf.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane2.setLayoutX(424.0);
        anchorPane2.setLayoutY(13.0);
        anchorPane2.setPrefHeight(182.0);
        anchorPane2.setPrefWidth(354.0);
        anchorPane2.getStyleClass().add("nav-form");
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        imageView0.setFitHeight(123.0);
        imageView0.setFitWidth(133.0);
        imageView0.setLayoutX(14.0);
        imageView0.setLayoutY(14.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("Images/courseicaon.png").toExternalForm()));

        label0.setLayoutX(50.0);
        label0.setLayoutY(137.0);
        label0.setPrefHeight(35.0);
        label0.setPrefWidth(187.0);
        label0.setText("Total courses");
        label0.setTextFill(javafx.scene.paint.Color.valueOf("#f5f3f3"));
        label0.setFont(new Font("System Bold", 24.0));

        totalCoursesTf.setEditable(false);
        totalCoursesTf.setLayoutX(237.0);
        totalCoursesTf.setLayoutY(132.0);
        totalCoursesTf.setPrefHeight(37.0);
        totalCoursesTf.setPrefWidth(62.0);
        totalCoursesTf.getStyleClass().add("nav-btn");
        totalCoursesTf.getStylesheets().add("/client/dashboardDesign.css");

        anchorPane3.setLayoutX(13.0);
        anchorPane3.setLayoutY(241.0);
        anchorPane3.setPrefHeight(220.0);
        anchorPane3.setPrefWidth(788.0);
        anchorPane3.getStylesheets().add("/client/dashboardDesign.css");

        reportTable.setLayoutX(14.0);
        reportTable.setLayoutY(14.0);
        reportTable.setPrefHeight(198.0);
        reportTable.setPrefWidth(761.0);
        reportTable.getStylesheets().add("/client/dashboardDesign.css");

        coursenameCol.setPrefWidth(410.0);
        coursenameCol.setText("Course Name");

        GradeCol.setPrefWidth(350.0);
        GradeCol.setText("Grade Average");

        anchorPane1.getChildren().add(imageView);
        anchorPane1.getChildren().add(label);
        anchorPane1.getChildren().add(studentTf);
        anchorPane0.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(imageView0);
        anchorPane2.getChildren().add(label0);
        anchorPane2.getChildren().add(totalCoursesTf);
        anchorPane0.getChildren().add(anchorPane2);
        anchorPane.getChildren().add(anchorPane0);
        reportTable.getColumns().add(coursenameCol);
        reportTable.getColumns().add(GradeCol);
        anchorPane3.getChildren().add(reportTable);
        anchorPane.getChildren().add(anchorPane3);
        getChildren().add(anchorPane);
            
        DataAccessLayer conn = new DataAccessLayer();
        try {
            DepartmentTopReport result = conn.getDepartmentTopReport(departmentId);
            studentTf.setText(result.getStudentCount());
            totalCoursesTf.setText(result.getCourseCount());
        } catch (SQLException ex) {
            Logger.getLogger(StudentReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ArrayList<DepartmentTableReport> result = conn.getDepartmentTableReportData(departmentId);
            
            
        ObservableList<DepartmentTableReport> reportData = FXCollections.observableArrayList(result);
         
        reportTable.setItems(reportData);
        coursenameCol.setCellValueFactory(new PropertyValueFactory<>("CourseName"));
        GradeCol.setCellValueFactory(new PropertyValueFactory<>("avgGpa"));

    }
}
