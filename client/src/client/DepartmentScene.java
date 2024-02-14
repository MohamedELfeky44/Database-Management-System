package client;

import client.dto.DepartmentsDto;
import client.dto.StudentsDto;
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
import javax.swing.JOptionPane;

public class DepartmentScene extends StackPane {

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
    protected final TableView departmentTable;
    protected final TableColumn idCol;
    protected final TableColumn nameCol;
    protected final AnchorPane anchorPane2;
    protected final TextField deptIdTf;
    protected final TextField deptNameTf;
    protected final Button reportBtn;
    protected final Button addBtn;
    protected final Button updateBtn;
    protected final Button deleteBtn;
    protected final Button refreshBtn;
    protected final Button homeBtn;

    public DepartmentScene() {
        
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
        departmentTable = new TableView();
        idCol = new TableColumn();
        nameCol = new TableColumn();
        anchorPane2 = new AnchorPane();
        deptIdTf = new TextField();
        deptNameTf = new TextField();
        reportBtn = new Button();
        addBtn = new Button();
        updateBtn = new Button();
        deleteBtn = new Button();
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

        departmentTable.setLayoutX(13.0);
        departmentTable.setLayoutY(25.0);
        departmentTable.setPrefHeight(352.0);
        departmentTable.setPrefWidth(860.0);
        departmentTable.getStylesheets().add("/client/dashboardDesign.css");

        idCol.setPrefWidth(412.0);
        idCol.setText("Department ID ");

        nameCol.setPrefWidth(447.0);
        nameCol.setText("Department Name");

        anchorPane2.setLayoutX(213.0);
        anchorPane2.setLayoutY(418.0);
        anchorPane2.setPrefHeight(290.0);
        anchorPane2.setPrefWidth(879.0);
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        deptIdTf.setAlignment(javafx.geometry.Pos.CENTER);
        deptIdTf.setLayoutX(64.0);
        deptIdTf.setLayoutY(42.0);
        deptIdTf.setPrefHeight(31.0);
        deptIdTf.setPrefWidth(312.0);
        deptIdTf.getStyleClass().add("textfield");
        deptIdTf.getStylesheets().add("/client/dashboardDesign.css");
        deptIdTf.setText("Department ID ");

        deptNameTf.setAlignment(javafx.geometry.Pos.CENTER);
        deptNameTf.setLayoutX(470.0);
        deptNameTf.setLayoutY(42.0);
        deptNameTf.setPrefHeight(31.0);
        deptNameTf.setPrefWidth(312.0);
        deptNameTf.getStyleClass().add("textfield");
        deptNameTf.getStylesheets().add("/client/dashboardDesign.css");
        deptNameTf.setText("Department Name");

        reportBtn.setLayoutX(672.0);
        reportBtn.setLayoutY(216.0);
        reportBtn.setMnemonicParsing(false);
        reportBtn.setPrefHeight(50.0);
        reportBtn.setPrefWidth(187.0);
        reportBtn.getStyleClass().add("add-btn");
        reportBtn.getStylesheets().add("/client/dashboardDesign.css");
        reportBtn.setText("Show Report");

        addBtn.setLayoutX(19.0);
        addBtn.setLayoutY(216.0);
        addBtn.setMnemonicParsing(false);
        addBtn.setPrefHeight(50.0);
        addBtn.setPrefWidth(144.0);
        addBtn.getStyleClass().add("add-btn");
        addBtn.getStylesheets().add("/client/dashboardDesign.css");
        addBtn.setText("Add");

        updateBtn.setLayoutX(179.0);
        updateBtn.setLayoutY(218.0);
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
        anchorPane0.getChildren().add(coursesBtn);
        anchorPane0.getChildren().add(departmentsBtn);
        anchorPane0.getChildren().add(gradesBtn);
        anchorPane0.getChildren().add(label);
        anchorPane0.getChildren().add(line);
        anchorPane0.getChildren().add(imageView);
        anchorPane.getChildren().add(anchorPane0);
        departmentTable.getColumns().add(idCol);
        departmentTable.getColumns().add(nameCol);
        anchorPane1.getChildren().add(departmentTable);
        anchorPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(deptIdTf);
        anchorPane2.getChildren().add(deptNameTf);
        anchorPane2.getChildren().add(reportBtn);
        anchorPane2.getChildren().add(addBtn);
        anchorPane2.getChildren().add(updateBtn);
        anchorPane2.getChildren().add(deleteBtn);
        anchorPane2.getChildren().add(refreshBtn);
        anchorPane.getChildren().add(anchorPane2);
        getChildren().add(anchorPane);
        
        DataAccessLayer departmentsData = new DataAccessLayer();
        try {
            ArrayList<DepartmentsDto> result = departmentsData.getDepartmentsData();
            
            
            ObservableList<DepartmentsDto> departmentstsList = FXCollections.observableArrayList(result);

            departmentTable.setItems(departmentstsList);
            
                idCol.setCellValueFactory(new PropertyValueFactory<>("deptId"));
                nameCol.setCellValueFactory(new PropertyValueFactory<>("deptName"));
                

        } catch (SQLException ex) {
            Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        departmentTable.setOnMouseClicked(event -> {
        if (event.getClickCount() == 1) { // Check for single click
        // Get the selected item from the table
        DepartmentsDto selectedDepartment = (DepartmentsDto) departmentTable.getSelectionModel().getSelectedItem();
        
        
        // Check if an item is selected
        if (selectedDepartment != null) {
            // Retrieve values and save them to variables
            deptIdTf.setText(selectedDepartment.getDeptId());
            deptNameTf.setText(selectedDepartment.getDeptName());
                }
       
            }
        });
        
        addBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            DepartmentsDto newDepartment = new DepartmentsDto(
                    deptIdTf.getText(),
                    deptNameTf.getText()
        );
     
        DataAccessLayer conn = new DataAccessLayer();
                try {
                    conn.insertIntoDepartment(newDepartment);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        updateBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            DepartmentsDto newDepartment = new DepartmentsDto(
                    deptIdTf.getText(),
                    deptNameTf.getText()
                    
        );
     
        DataAccessLayer conn = new DataAccessLayer();
                try {
                    conn.updateDepartment(newDepartment);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        refreshBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                DataAccessLayer studentsData = new DataAccessLayer();
                try {
                    ArrayList<DepartmentsDto> result = departmentsData.getDepartmentsData();
                    
                    ObservableList<DepartmentsDto> departmentList = FXCollections.observableArrayList(result);

                    departmentTable.setItems(departmentList);
                } catch (SQLException ex) {
                    Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            });
        
        deleteBtn.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            String deleteId = deptIdTf.getText();
     
        DataAccessLayer conn = new DataAccessLayer();
                try {
                    conn.deleteDepartment(deleteId);
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        
        reportBtn.setOnAction(event -> {
            try {
                // Create a new instance of the ReportScene (you need to define ReportScene)\
                String selectedDepartmentId = deptIdTf.getText();
                DepartmentReport reportScene = new DepartmentReport(selectedDepartmentId);
                
                // Create a new stage for the report scene
                Stage reportStage = new Stage();
                reportStage.initModality(Modality.APPLICATION_MODAL);
                reportStage.initStyle(StageStyle.UTILITY);
                reportStage.setTitle("Department Report");
                reportStage.setScene(new Scene(reportScene, 820, 480));
                
                // Show the report stage and wait for it to be closed before returning
                reportStage.showAndWait();
            } catch (SQLException ex) {
                Logger.getLogger(DepartmentScene.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        studentsBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                // Create a new instance of DepartmentsScene
                StudentScene departmentsScene = new StudentScene();

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
