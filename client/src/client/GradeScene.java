package client;

import client.dto.GradesDto;
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
import javax.swing.JOptionPane;

public class GradeScene extends StackPane {

    protected final AnchorPane anchorPane;
    protected final AnchorPane anchorPane0;
    protected final Button studentsBtn;
    protected final Button coursesBtn;
    protected final Button departmentsBtn;
    protected final Button gradesBtn;
    protected final Label label;
    protected final Line line;
    protected final ImageView imageView;
    protected final AnchorPane anchorPane1;
    protected final TableView GradesTable;
    protected final TableColumn studentIdCol;
    protected final TableColumn courseIdCol;
    protected final TableColumn gradeCol;
    protected final TableColumn descriptionCol;
    protected final TableColumn enrollmentDateCol;
    protected final AnchorPane anchorPane2;
    protected final TextField StudentIDTf;
    protected final TextField DescriptionTf;
    protected final TextField CourseIDTf;
    protected final TextField EnrollmentDateTf;
    protected final TextField gradeTf;
    protected final Button addBtn;
    protected final Button UpdateBtn;
    protected final Button DeleteBtn;
    protected final Button ShowReportBtn;
    protected final Button RefreshBtn;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Button homeBtn;

    public GradeScene() {
        
        homeBtn = new Button();
        anchorPane = new AnchorPane();
        anchorPane0 = new AnchorPane();
        studentsBtn = new Button();
        coursesBtn = new Button();
        departmentsBtn = new Button();
        gradesBtn = new Button();
        label = new Label();
        line = new Line();
        imageView = new ImageView();
        anchorPane1 = new AnchorPane();
        GradesTable = new TableView();
        studentIdCol = new TableColumn();
        courseIdCol = new TableColumn();
        gradeCol = new TableColumn();
        descriptionCol = new TableColumn();
        enrollmentDateCol = new TableColumn();
        anchorPane2 = new AnchorPane();
        StudentIDTf = new TextField();
        DescriptionTf = new TextField();
        CourseIDTf = new TextField();
        EnrollmentDateTf = new TextField();
        gradeTf = new TextField();
        addBtn = new Button();
        UpdateBtn = new Button();
        DeleteBtn = new Button();
        ShowReportBtn = new Button();
        RefreshBtn = new Button();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();

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

        coursesBtn.setLayoutY(425.0);
        coursesBtn.setMnemonicParsing(false);
        coursesBtn.setPrefHeight(50.0);
        coursesBtn.setPrefWidth(200.0);
        coursesBtn.getStyleClass().add("nav-btn");
        coursesBtn.getStylesheets().add("/client/dashboardDesign.css");
        coursesBtn.setText("Courses");

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
        anchorPane1.setPrefHeight(391.0);
        anchorPane1.setPrefWidth(879.0);
        anchorPane1.getStylesheets().add("/client/dashboardDesign.css");

        GradesTable.setLayoutX(13.0);
        GradesTable.setLayoutY(25.0);
        GradesTable.setPrefHeight(352.0);
        GradesTable.setPrefWidth(860.0);
        GradesTable.getStylesheets().add("/client/dashboardDesign.css");

        studentIdCol.setPrefWidth(172.0);
        studentIdCol.setText("Student ID");

        courseIdCol.setPrefWidth(132.0);
        courseIdCol.setText("Course ID ");

        gradeCol.setPrefWidth(146.0);
        gradeCol.setText("Grade");

        descriptionCol.setPrefWidth(198.0);
        descriptionCol.setText("Description");

        enrollmentDateCol.setPrefWidth(211.0);
        enrollmentDateCol.setText("Enrollment Date");

        anchorPane2.setLayoutX(213.0);
        anchorPane2.setLayoutY(418.0);
        anchorPane2.setPrefHeight(290.0);
        anchorPane2.setPrefWidth(879.0);
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        StudentIDTf.setAlignment(javafx.geometry.Pos.CENTER);
        StudentIDTf.setLayoutX(101.0);
        StudentIDTf.setLayoutY(42.0);
        StudentIDTf.setPrefHeight(29.0);
        StudentIDTf.setPrefWidth(187.0);
        StudentIDTf.getStyleClass().add("textfield");
        StudentIDTf.getStylesheets().add("/client/dashboardDesign.css");
        StudentIDTf.setText("Student ID");

        DescriptionTf.setAlignment(javafx.geometry.Pos.CENTER);
        DescriptionTf.setLayoutX(148.0);
        DescriptionTf.setLayoutY(97.0);
        DescriptionTf.setPrefHeight(31.0);
        DescriptionTf.setPrefWidth(208.0);
        DescriptionTf.getStyleClass().add("textfield");
        DescriptionTf.getStylesheets().add("/client/dashboardDesign.css");
        DescriptionTf.setText("Description");

        CourseIDTf.setAlignment(javafx.geometry.Pos.CENTER);
        CourseIDTf.setLayoutX(383.0);
        CourseIDTf.setLayoutY(42.0);
        CourseIDTf.setPrefHeight(31.0);
        CourseIDTf.setPrefWidth(200.0);
        CourseIDTf.getStyleClass().add("textfield");
        CourseIDTf.getStylesheets().add("/client/dashboardDesign.css");
        CourseIDTf.setText("Course ID");

        EnrollmentDateTf.setAlignment(javafx.geometry.Pos.CENTER);
        EnrollmentDateTf.setLayoutX(523.0);
        EnrollmentDateTf.setLayoutY(97.0);
        EnrollmentDateTf.setPrefHeight(31.0);
        EnrollmentDateTf.setPrefWidth(208.0);
        EnrollmentDateTf.getStyleClass().add("textfield");
        EnrollmentDateTf.getStylesheets().add("/client/dashboardDesign.css");
        EnrollmentDateTf.setText("Enrollment Date");

        gradeTf.setAlignment(javafx.geometry.Pos.CENTER);
        gradeTf.setLayoutX(672.0);
        gradeTf.setLayoutY(42.0);
        gradeTf.setPrefHeight(29.0);
        gradeTf.setPrefWidth(187.0);
        gradeTf.getStyleClass().add("textfield");
        gradeTf.getStylesheets().add("/client/dashboardDesign.css");
        gradeTf.setText("Grade");

        addBtn.setLayoutX(130.0);
        addBtn.setLayoutY(216.0);
        addBtn.setMnemonicParsing(false);
        addBtn.setPrefHeight(50.0);
        addBtn.setPrefWidth(144.0);
        addBtn.getStyleClass().add("add-btn");
        addBtn.getStylesheets().add("/client/dashboardDesign.css");
        addBtn.setText("Add");

        UpdateBtn.setLayoutX(290.0);
        UpdateBtn.setLayoutY(216.0);
        UpdateBtn.setMnemonicParsing(false);
        UpdateBtn.setPrefHeight(50.0);
        UpdateBtn.setPrefWidth(144.0);
        UpdateBtn.getStyleClass().add("add-btn");
        UpdateBtn.getStylesheets().add("/client/dashboardDesign.css");
        UpdateBtn.setText("Update");

        DeleteBtn.setLayoutX(450.0);
        DeleteBtn.setLayoutY(216.0);
        DeleteBtn.setMnemonicParsing(false);
        DeleteBtn.setPrefHeight(50.0);
        DeleteBtn.setPrefWidth(144.0);
        DeleteBtn.getStyleClass().add("add-btn");
        DeleteBtn.getStylesheets().add("/client/dashboardDesign.css");
        DeleteBtn.setText("Delete");

        ShowReportBtn.setLayoutX(672.0);
        ShowReportBtn.setLayoutY(216.0);
        ShowReportBtn.setMnemonicParsing(false);
        ShowReportBtn.setPrefHeight(50.0);
        ShowReportBtn.setPrefWidth(187.0);
        ShowReportBtn.getStyleClass().add("add-btn");
        ShowReportBtn.getStylesheets().add("/client/dashboardDesign.css");
        ShowReportBtn.setText("Show Report");

        RefreshBtn.setLayoutX(620.0);
        RefreshBtn.setLayoutY(216.0);
        RefreshBtn.setMnemonicParsing(false);
        RefreshBtn.setPrefHeight(50.0);
        RefreshBtn.setPrefWidth(144.0);
        RefreshBtn.getStyleClass().add("add-btn");
        RefreshBtn.getStylesheets().add("/client/dashboardDesign.css");
        RefreshBtn.setText("Refresh");

        label0.setLayoutX(14.0);
        label0.setLayoutY(47.0);
        label0.setText("Student ID");

        label1.setLayoutX(305.0);
        label1.setLayoutY(47.0);
        label1.setPrefHeight(21.0);
        label1.setPrefWidth(78.0);
        label1.setText("Course ID");

        label2.setLayoutX(616.0);
        label2.setLayoutY(47.0);
        label2.setText("Grade");

        label3.setLayoutX(60.0);
        label3.setLayoutY(102.0);
        label3.setPrefHeight(21.0);
        label3.setPrefWidth(95.0);
        label3.setText("Description");

        label4.setLayoutX(400.0);
        label4.setLayoutY(102.0);
        label4.setText("Enrollment Date");
        
        anchorPane.getStyleClass().add("shadow");
        anchorPane.getStyleClass().add("white-bg");


        anchorPane1.getStyleClass().add("shadow");
        anchorPane1.getStyleClass().add("white-bg");

        anchorPane2.getStyleClass().add("shadow");
        anchorPane2.getStyleClass().add("white-bg");
        
        
        anchorPane0.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(studentsBtn);
        anchorPane0.getChildren().add(coursesBtn);
        anchorPane0.getChildren().add(departmentsBtn);
        anchorPane0.getChildren().add(gradesBtn);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(line);
        anchorPane0.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane0);
        GradesTable.getColumns().add(studentIdCol);
        GradesTable.getColumns().add(courseIdCol);
        GradesTable.getColumns().add(gradeCol);
        GradesTable.getColumns().add(descriptionCol);
        GradesTable.getColumns().add(enrollmentDateCol);
        anchorPane1.getChildren().add(GradesTable);
        anchorPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(StudentIDTf);
        anchorPane2.getChildren().add(DescriptionTf);
        anchorPane2.getChildren().add(CourseIDTf);
        anchorPane2.getChildren().add(EnrollmentDateTf);
        anchorPane2.getChildren().add(gradeTf);
        anchorPane2.getChildren().add(addBtn);
        anchorPane2.getChildren().add(UpdateBtn);
        anchorPane2.getChildren().add(DeleteBtn);
        //anchorPane2.getChildren().add(ShowReportBtn);
        anchorPane2.getChildren().add(RefreshBtn);
        anchorPane2.getChildren().add(label0);
        anchorPane2.getChildren().add(label1);
        anchorPane2.getChildren().add(label2);
        anchorPane2.getChildren().add(label3);
        anchorPane2.getChildren().add(label4);
        anchorPane.getChildren().add(anchorPane2);
        getChildren().add(anchorPane);
        
        DataAccessLayer gradesData = new DataAccessLayer();
        try {
            ArrayList<GradesDto> result = gradesData.getGradesData();
            
            
            ObservableList<GradesDto> studentsList = FXCollections.observableArrayList(result);

            GradesTable.setItems(studentsList);
            
                studentIdCol.setCellValueFactory(new PropertyValueFactory<>("StudentID"));
                courseIdCol.setCellValueFactory(new PropertyValueFactory<>("CourseId"));
                gradeCol.setCellValueFactory(new PropertyValueFactory<>("Grade"));
                descriptionCol.setCellValueFactory(new PropertyValueFactory<>("Description"));
                enrollmentDateCol.setCellValueFactory(new PropertyValueFactory<>("ENROLLMENT_DATE"));

        } catch (SQLException ex) {
            Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        GradesTable.setOnMouseClicked(event -> {
        if (event.getClickCount() == 1) { // Check for single click
        // Get the selected item from the table
        GradesDto selectedGrade = (GradesDto) GradesTable.getSelectionModel().getSelectedItem();
        
        
        // Check if an item is selected
        if (selectedGrade != null) {
            // Retrieve values and save them to variables
            StudentIDTf.setText(selectedGrade.getStudentID());
            CourseIDTf.setText(selectedGrade.getCourseId());
            gradeTf.setText(selectedGrade.getGrade());
            DescriptionTf.setText(selectedGrade.getDescription());
            EnrollmentDateTf.setText(selectedGrade.getENROLLMENT_DATE());
                }
       
            }
        });
        
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            GradesDto newGrade = new GradesDto(
                    StudentIDTf.getText(),
                    CourseIDTf.getText(),
                    gradeTf.getText(),
                    DescriptionTf.getText(),
                    EnrollmentDateTf.getText()
                   
        );
     
            DataAccessLayer conn = new DataAccessLayer();
                try {
                    if (StudentIDTf.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
                    else {conn.insertIntoGrades(newGrade);};
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        UpdateBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            GradesDto newGrade = new GradesDto(
                    StudentIDTf.getText(),
                    CourseIDTf.getText(),
                    gradeTf.getText(),
                    DescriptionTf.getText(),
                    EnrollmentDateTf.getText()
        );
     
            DataAccessLayer conn = new DataAccessLayer();
                try {
                    if (StudentIDTf.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
                    else {conn.updateGrade(newGrade);};
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        
        DeleteBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String deleteStudentId = StudentIDTf.getText();
            String delateCourseId = CourseIDTf.getText();
     
            DataAccessLayer conn = new DataAccessLayer();
            System.out.println("----------------------------");
                try {
                    if (StudentIDTf.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
                    else {conn.deleteGrade(delateCourseId,deleteStudentId);};
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        
        RefreshBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DataAccessLayer gradesData = new DataAccessLayer();
                try {
                    ArrayList<GradesDto> result = gradesData.getGradesData();
                    
                    ObservableList<GradesDto> studentsList = FXCollections.observableArrayList(result);

                    GradesTable.setItems(studentsList);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
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
    
    coursesBtn.setOnAction(new EventHandler<ActionEvent>() {
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
    
    homeBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                HomeScene gradeScene = new HomeScene();

                // Get the current stage (assuming it is created in your main class)
                Stage stage = (Stage) getScene().getWindow();

                // Create a new scene with the DepartmentsScene and set it to the stage
                Scene scene = new Scene(gradeScene, 1100, 720);
                stage.setScene(scene);
            }
        });

    }
}
