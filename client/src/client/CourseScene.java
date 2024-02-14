package client;

import client.dto.CourseDto;
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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CourseScene extends StackPane {
    
    protected final Button homeBtn;
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
    protected final TableView coursesTable;
    protected final TableColumn idCol;
    protected final TableColumn nameCol;
    protected final TableColumn levelCol;
    protected final TableColumn numOfHoursCol;
    protected final AnchorPane anchorPane2;
    protected final TextField idTf;
    protected final TextField levelTf;
    protected final TextField numOfHoursTf;
    protected final TextField nameTf;
    protected final Button addBtn;
    protected final Button updateBtn;
    protected final Button deleteBtn;
    protected final Button reportsBtn;
    protected final TextField deptIdTf;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Button refreshBtn;

    public CourseScene() {

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
        coursesTable = new TableView();
        idCol = new TableColumn();
        nameCol = new TableColumn();
        levelCol = new TableColumn();
        numOfHoursCol = new TableColumn();
        anchorPane2 = new AnchorPane();
        idTf = new TextField();
        levelTf = new TextField();
        numOfHoursTf = new TextField();
        nameTf = new TextField();
        addBtn = new Button();
        updateBtn = new Button();
        deleteBtn = new Button();
        reportsBtn = new Button();
        deptIdTf = new TextField();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        refreshBtn = new Button();

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
        anchorPane1.setPrefHeight(391.0);
        anchorPane1.setPrefWidth(879.0);
        anchorPane1.getStylesheets().add("/client/dashboardDesign.css");

        coursesTable.setLayoutX(13.0);
        coursesTable.setLayoutY(25.0);
        coursesTable.setPrefHeight(352.0);
        coursesTable.setPrefWidth(860.0);
        coursesTable.getStylesheets().add("/client/dashboardDesign.css");

        idCol.setPrefWidth(167.0);
        idCol.setText("Course ID");

        nameCol.setPrefWidth(335.0);
        nameCol.setText("Course Name");

        levelCol.setPrefWidth(160.0);
        levelCol.setText("Course Level");

        numOfHoursCol.setPrefWidth(197.0);
        numOfHoursCol.setText("Number of Hours");

        anchorPane2.setLayoutX(213.0);
        anchorPane2.setLayoutY(418.0);
        anchorPane2.setPrefHeight(290.0);
        anchorPane2.setPrefWidth(879.0);
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        idTf.setAlignment(javafx.geometry.Pos.CENTER);
        idTf.setLayoutX(108.0);
        idTf.setLayoutY(42.0);
        idTf.setPrefHeight(31.0);
        idTf.setPrefWidth(299.0);
        idTf.getStyleClass().add("textfield");
        idTf.getStylesheets().add("/client/dashboardDesign.css");
        idTf.setText("Course ID");

        levelTf.setAlignment(javafx.geometry.Pos.CENTER);
        levelTf.setLayoutX(108.0);
        levelTf.setLayoutY(97.0);
        levelTf.setPrefHeight(31.0);
        levelTf.setPrefWidth(299.0);
        levelTf.getStyleClass().add("textfield");
        levelTf.getStylesheets().add("/client/dashboardDesign.css");
        levelTf.setText("Course Level");

        numOfHoursTf.setAlignment(javafx.geometry.Pos.CENTER);
        numOfHoursTf.setLayoutX(559.0);
        numOfHoursTf.setLayoutY(97.0);
        numOfHoursTf.setPrefHeight(31.0);
        numOfHoursTf.setPrefWidth(299.0);
        numOfHoursTf.getStyleClass().add("textfield");
        numOfHoursTf.getStylesheets().add("/client/dashboardDesign.css");
        numOfHoursTf.setText("Number of Hours");

        nameTf.setAlignment(javafx.geometry.Pos.CENTER);
        nameTf.setLayoutX(559.0);
        nameTf.setLayoutY(42.0);
        nameTf.setPrefHeight(31.0);
        nameTf.setPrefWidth(299.0);
        nameTf.getStyleClass().add("textfield");
        nameTf.getStylesheets().add("/client/dashboardDesign.css");
        nameTf.setText("Course Name");

        addBtn.setLayoutX(19.0);
        addBtn.setLayoutY(216.0);
        addBtn.setMnemonicParsing(false);
        addBtn.setPrefHeight(50.0);
        addBtn.setPrefWidth(144.0);
        addBtn.getStyleClass().add("add-btn");
        addBtn.getStylesheets().add("/client/dashboardDesign.css");
        addBtn.setText("Add");

        updateBtn.setLayoutX(179.0);
        updateBtn.setLayoutY(216.0);
        updateBtn.setMnemonicParsing(false);
        updateBtn.setPrefHeight(50.0);
        updateBtn.setPrefWidth(144.0);
        updateBtn.getStyleClass().add("add-btn");
        updateBtn.getStylesheets().add("/client/dashboardDesign.css");
        updateBtn.setText("Update");

        deleteBtn.setLayoutX(344.0);
        deleteBtn.setLayoutY(216.0);
        deleteBtn.setMnemonicParsing(false);
        deleteBtn.setPrefHeight(50.0);
        deleteBtn.setPrefWidth(144.0);
        deleteBtn.getStyleClass().add("add-btn");
        deleteBtn.getStylesheets().add("/client/dashboardDesign.css");
        deleteBtn.setText("Delete");

        reportsBtn.setLayoutX(672.0);
        reportsBtn.setLayoutY(216.0);
        reportsBtn.setMnemonicParsing(false);
        reportsBtn.setPrefHeight(50.0);
        reportsBtn.setPrefWidth(187.0);
        reportsBtn.getStyleClass().add("add-btn");
        reportsBtn.getStylesheets().add("/client/dashboardDesign.css");
        reportsBtn.setText("Show Report");

        deptIdTf.setAlignment(javafx.geometry.Pos.CENTER);
        deptIdTf.setLayoutX(297.0);
        deptIdTf.setLayoutY(154.0);
        deptIdTf.setPrefHeight(31.0);
        deptIdTf.setPrefWidth(386.0);
        deptIdTf.getStyleClass().add("textfield");
        deptIdTf.getStylesheets().add("/client/dashboardDesign.css");
        deptIdTf.setText("Department ID");

        label0.setLayoutX(14.0);
        label0.setLayoutY(47.0);
        label0.setText("Course ID");

        label1.setLayoutX(14.0);
        label1.setLayoutY(102.0);
        label1.setText("Course Level");

        label2.setLayoutX(432.0);
        label2.setLayoutY(47.0);
        label2.setText("Course Name");

        label3.setLayoutX(432.0);
        label3.setLayoutY(102.0);
        label3.setText("Number of Hours");

        label4.setLayoutX(33.0);
        label4.setLayoutY(159.0);
        label4.setPrefHeight(21.0);
        label4.setPrefWidth(245.0);
        label4.setText("Assign to a Department (optional)");

        refreshBtn.setLayoutX(507.0);
        refreshBtn.setLayoutY(216.0);
        refreshBtn.setMnemonicParsing(false);
        refreshBtn.setPrefHeight(50.0);
        refreshBtn.setPrefWidth(144.0);
        refreshBtn.getStyleClass().add("add-btn");
        refreshBtn.getStylesheets().add("/client/dashboardDesign.css");
        refreshBtn.setText("Refresh");
        
        anchorPane.getStyleClass().add("shadow");
        anchorPane.getStyleClass().add("white-bg");


        anchorPane1.getStyleClass().add("shadow");
        anchorPane1.getStyleClass().add("white-bg");

        anchorPane2.getStyleClass().add("shadow");
        anchorPane2.getStyleClass().add("white-bg");

        anchorPane0.getChildren().add(homeBtn);
        anchorPane0.getChildren().add(studentsBtn);
        anchorPane0.getChildren().add(coursessBtn);
        anchorPane0.getChildren().add(departmentsBtn);
        anchorPane0.getChildren().add(gradesBtn);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(line);
        anchorPane0.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane0);
        coursesTable.getColumns().add(idCol);
        coursesTable.getColumns().add(nameCol);
        coursesTable.getColumns().add(levelCol);
        coursesTable.getColumns().add(numOfHoursCol);
        anchorPane1.getChildren().add(coursesTable);
        anchorPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(idTf);
        anchorPane2.getChildren().add(levelTf);
        anchorPane2.getChildren().add(numOfHoursTf);
        anchorPane2.getChildren().add(nameTf);
        anchorPane2.getChildren().add(addBtn);
        anchorPane2.getChildren().add(updateBtn);
        anchorPane2.getChildren().add(deleteBtn);
        anchorPane2.getChildren().add(reportsBtn);
        anchorPane2.getChildren().add(deptIdTf);
        anchorPane2.getChildren().add(label0);
        anchorPane2.getChildren().add(label1);
        anchorPane2.getChildren().add(label2);
        anchorPane2.getChildren().add(label3);
        anchorPane2.getChildren().add(label4);
        anchorPane2.getChildren().add(refreshBtn);
        anchorPane.getChildren().add(anchorPane2);
        getChildren().add(anchorPane);
        
        DataAccessLayer corseData = new DataAccessLayer();
        try {
            ArrayList<CourseDto> result = corseData.getCoursesData();
            
            
            ObservableList<CourseDto> courseList = FXCollections.observableArrayList(result);

            coursesTable.setItems(courseList);
            
                idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
                nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
                levelCol.setCellValueFactory(new PropertyValueFactory<>("level"));
                numOfHoursCol.setCellValueFactory(new PropertyValueFactory<>("numOfHours"));
               

        } catch (SQLException ex) {
            Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        coursesTable.setOnMouseClicked(event -> {
        if (event.getClickCount() == 1) { // Check for single click
        // Get the selected item from the table
        CourseDto selectedCourse = (CourseDto) coursesTable.getSelectionModel().getSelectedItem();
        
        
        // Check if an item is selected
        if (selectedCourse != null) {
            // Retrieve values and save them to variables
            idTf.setText(selectedCourse.getId());
            nameTf.setText(selectedCourse.getName());
            levelTf.setText(selectedCourse.getLevel());
            numOfHoursTf.setText(selectedCourse.getNumOfHours());
                }
            }
        });
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            CourseDto newCourse = new CourseDto(
                    idTf.getText(),
                    nameTf.getText(),
                    levelTf.getText(),
                    numOfHoursTf.getText()
        );
        
        DataAccessLayer conn = new DataAccessLayer();
        String departmentId = deptIdTf.getText();
        String courseId = idTf.getText();
                try {
                    conn.insertIntoCourse(newCourse);
                    conn.InsertIntoDeptCourse(departmentId,courseId);
                    if (!departmentId.isEmpty()) {};
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        updateBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            CourseDto newCourse = new CourseDto(
                    idTf.getText(),
                    nameTf.getText(),
                    levelTf.getText(),
                    numOfHoursTf.getText()
                  
        );
     
        DataAccessLayer conn = new DataAccessLayer();
                try {
                    conn.updateCourse(newCourse);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        deleteBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String deleteId = idTf.getText();
     
        DataAccessLayer conn = new DataAccessLayer();
                try {
                    conn.deleteCourse(deleteId);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        refreshBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DataAccessLayer courseData = new DataAccessLayer();
                try {
                    ArrayList<CourseDto> result = courseData.getCoursesData();
                    
                    ObservableList<CourseDto> studentsList = FXCollections.observableArrayList(result);

                    coursesTable.setItems(studentsList);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        reportsBtn.setOnAction(event -> {
            // Create a new instance of the ReportScene (you need to define ReportScene)\
            String selectedCourseId = idTf.getText();
            CourseReport reportScene = new CourseReport(selectedCourseId);
            // Create a new stage for the report scene
            Stage reportStage = new Stage();
            reportStage.initModality(Modality.APPLICATION_MODAL);
            reportStage.initStyle(StageStyle.UTILITY);
            reportStage.setTitle("Course Report");
            reportStage.setScene(new Scene(reportScene, 820, 480));
            // Show the report stage and wait for it to be closed before returning
            reportStage.showAndWait();
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
