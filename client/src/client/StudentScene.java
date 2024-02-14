package client;

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

public class StudentScene extends StackPane {

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
    protected final TableView studentsTableView;
    protected final TableColumn idCol;
    protected final TableColumn nameCol;
    protected final TableColumn levelCol;
    protected final TableColumn phoneNoCol;
    protected final TableColumn addressCol;
    protected final TableColumn ageCol;
    protected final TableColumn classNo;
    protected final TableColumn genderCol;
    protected final TableColumn deprIdCol;
    protected final AnchorPane anchorPane2;
    protected final TextField idTF;
    protected final TextField nameTF;
    protected final TextField levelTF;
    protected final TextField deptIdTF;
    protected final TextField phoneNoTF;
    protected final TextField addressTF;
    protected final TextField ageTF;
    protected final TextField genderTF;
    protected final TextField classNoTF;
    protected final Button addBtn;
    protected final Button updateBtn;
    protected final Button deletBtn;
    protected final Button reportBtn;
    protected final Label label0;
    protected final Label label1;
    protected final Label label2;
    protected final Label label3;
    protected final Label label4;
    protected final Label label5;
    protected final Label label6;
    protected final Label label7;
    protected final Label label8;
    protected final Button addBtn1;
    protected final Button homeBtn;

    public StudentScene() {

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
        studentsTableView = new TableView();
        idCol = new TableColumn();
        nameCol = new TableColumn();
        levelCol = new TableColumn();
        phoneNoCol = new TableColumn();
        addressCol = new TableColumn();
        ageCol = new TableColumn();
        classNo = new TableColumn();
        genderCol = new TableColumn();
        deprIdCol = new TableColumn();
        anchorPane2 = new AnchorPane();
        idTF = new TextField();
        nameTF = new TextField();
        levelTF = new TextField();
        deptIdTF = new TextField();
        phoneNoTF = new TextField();
        addressTF = new TextField();
        ageTF = new TextField();
        genderTF = new TextField();
        classNoTF = new TextField();
        addBtn = new Button();
        updateBtn = new Button();
        deletBtn = new Button();
        reportBtn = new Button();
        label0 = new Label();
        label1 = new Label();
        label2 = new Label();
        label3 = new Label();
        label4 = new Label();
        label5 = new Label();
        label6 = new Label();
        label7 = new Label();
        label8 = new Label();
        addBtn1 = new Button();

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

        studentsTableView.setLayoutX(13.0);
        studentsTableView.setLayoutY(25.0);
        studentsTableView.setPrefHeight(352.0);
        studentsTableView.setPrefWidth(860.0);
        studentsTableView.getStylesheets().add("/client/dashboardDesign.css");

        idCol.setPrefWidth(63.0);
        idCol.setText("ID");

        nameCol.setPrefWidth(149.0);
        nameCol.setText("Name");

        levelCol.setPrefWidth(67.0);
        levelCol.setText("Level");

        phoneNoCol.setPrefWidth(109.0);
        phoneNoCol.setText("Phone NO");

        addressCol.setPrefWidth(152.0);
        addressCol.setText("Address");

        ageCol.setPrefWidth(75.0);
        ageCol.setText("Age");

        classNo.setPrefWidth(76.0);
        classNo.setText("Class NO");

        genderCol.setPrefWidth(91.0);
        genderCol.setText("Gender");

        deprIdCol.setPrefWidth(75.0);
        deprIdCol.setText("Dept ID");

        anchorPane2.setLayoutX(213.0);
        anchorPane2.setLayoutY(418.0);
        anchorPane2.setPrefHeight(290.0);
        anchorPane2.setPrefWidth(879.0);
        anchorPane2.getStylesheets().add("/client/dashboardDesign.css");

        idTF.setAlignment(javafx.geometry.Pos.CENTER);
        idTF.setLayoutX(64.0);
        idTF.setLayoutY(42.0);
        idTF.setPrefHeight(29.0);
        idTF.setPrefWidth(187.0);
        idTF.getStyleClass().add("textfield");
        idTF.getStylesheets().add("/client/dashboardDesign.css");

        nameTF.setAlignment(javafx.geometry.Pos.CENTER);
        nameTF.setLayoutX(64.0);
        nameTF.setLayoutY(97.0);
        nameTF.setPrefHeight(29.0);
        nameTF.setPrefWidth(187.0);
        nameTF.getStyleClass().add("textfield");
        nameTF.getStylesheets().add("/client/dashboardDesign.css");

        levelTF.setAlignment(javafx.geometry.Pos.CENTER);
        levelTF.setLayoutX(64.0);
        levelTF.setLayoutY(156.0);
        levelTF.setPrefHeight(29.0);
        levelTF.setPrefWidth(187.0);
        levelTF.getStyleClass().add("textfield");
        levelTF.getStylesheets().add("/client/dashboardDesign.css");

        deptIdTF.setAlignment(javafx.geometry.Pos.CENTER);
        deptIdTF.setLayoutX(678.0);
        deptIdTF.setLayoutY(156.0);
        deptIdTF.setPrefHeight(29.0);
        deptIdTF.setPrefWidth(187.0);
        deptIdTF.getStyleClass().add("textfield");
        deptIdTF.getStylesheets().add("/client/dashboardDesign.css");

        phoneNoTF.setAlignment(javafx.geometry.Pos.CENTER);
        phoneNoTF.setLayoutX(380.0);
        phoneNoTF.setLayoutY(42.0);
        phoneNoTF.setPrefHeight(29.0);
        phoneNoTF.setPrefWidth(187.0);
        phoneNoTF.getStyleClass().add("textfield");
        phoneNoTF.getStylesheets().add("/client/dashboardDesign.css");

        addressTF.setAlignment(javafx.geometry.Pos.CENTER);
        addressTF.setLayoutX(380.0);
        addressTF.setLayoutY(97.0);
        addressTF.setPrefHeight(29.0);
        addressTF.setPrefWidth(187.0);
        addressTF.getStyleClass().add("textfield");
        addressTF.getStylesheets().add("/client/dashboardDesign.css");

        ageTF.setAlignment(javafx.geometry.Pos.CENTER);
        ageTF.setLayoutX(380.0);
        ageTF.setLayoutY(156.0);
        ageTF.setPrefHeight(29.0);
        ageTF.setPrefWidth(187.0);
        ageTF.getStyleClass().add("textfield");
        ageTF.getStylesheets().add("/client/dashboardDesign.css");

        genderTF.setAlignment(javafx.geometry.Pos.CENTER);
        genderTF.setLayoutX(678.0);
        genderTF.setLayoutY(97.0);
        genderTF.setPrefHeight(29.0);
        genderTF.setPrefWidth(187.0);
        genderTF.getStyleClass().add("textfield");
        genderTF.getStylesheets().add("/client/dashboardDesign.css");

        classNoTF.setAlignment(javafx.geometry.Pos.CENTER);
        classNoTF.setLayoutX(678.0);
        classNoTF.setLayoutY(42.0);
        classNoTF.setPrefHeight(29.0);
        classNoTF.setPrefWidth(187.0);
        classNoTF.getStyleClass().add("textfield");
        classNoTF.getStylesheets().add("/client/dashboardDesign.css");

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

        deletBtn.setLayoutX(344.0);
        deletBtn.setLayoutY(216.0);
        deletBtn.setMnemonicParsing(false);
        deletBtn.setPrefHeight(50.0);
        deletBtn.setPrefWidth(144.0);
        deletBtn.getStyleClass().add("add-btn");
        deletBtn.getStylesheets().add("/client/dashboardDesign.css");
        deletBtn.setText("Delete");

        reportBtn.setLayoutX(672.0);
        reportBtn.setLayoutY(216.0);
        reportBtn.setMnemonicParsing(false);
        reportBtn.setPrefHeight(50.0);
        reportBtn.setPrefWidth(187.0);
        reportBtn.getStyleClass().add("add-btn");
        reportBtn.getStylesheets().add("/client/dashboardDesign.css");
        reportBtn.setText("Show Report");

        label0.setLayoutX(16.0);
        label0.setLayoutY(47.0);
        label0.setPrefHeight(21.0);
        label0.setPrefWidth(26.0);
        label0.setText("ID");

        label1.setLayoutX(16.0);
        label1.setLayoutY(102.0);
        label1.setText("Name");

        label2.setLayoutX(19.0);
        label2.setLayoutY(161.0);
        label2.setText("Level");

        label3.setLayoutX(286.0);
        label3.setLayoutY(47.0);
        label3.setText("Phone No");

        label4.setLayoutX(286.0);
        label4.setLayoutY(102.0);
        label4.setPrefHeight(21.0);
        label4.setPrefWidth(67.0);
        label4.setText("Address");

        label5.setLayoutX(286.0);
        label5.setLayoutY(161.0);
        label5.setPrefHeight(21.0);
        label5.setPrefWidth(40.0);
        label5.setText("Age");

        label6.setLayoutX(598.0);
        label6.setLayoutY(47.0);
        label6.setPrefHeight(21.0);
        label6.setPrefWidth(67.0);
        label6.setText("Class No");

        label7.setLayoutX(598.0);
        label7.setLayoutY(102.0);
        label7.setPrefHeight(21.0);
        label7.setPrefWidth(67.0);
        label7.setText("Gender");

        label8.setLayoutX(598.0);
        label8.setLayoutY(161.0);
        label8.setPrefHeight(21.0);
        label8.setPrefWidth(67.0);
        label8.setText("Dept ID");

        addBtn1.setLayoutX(507.0);
        addBtn1.setLayoutY(216.0);
        addBtn1.setMnemonicParsing(false);
        addBtn1.setPrefHeight(50.0);
        addBtn1.setPrefWidth(144.0);
        addBtn1.getStyleClass().add("add-btn");
        addBtn1.getStylesheets().add("/client/dashboardDesign.css");
        addBtn1.setText("Refresh");
        
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
        studentsTableView.getColumns().add(idCol);
        studentsTableView.getColumns().add(nameCol);
        studentsTableView.getColumns().add(levelCol);
        studentsTableView.getColumns().add(phoneNoCol);
        studentsTableView.getColumns().add(addressCol);
        studentsTableView.getColumns().add(ageCol);
        studentsTableView.getColumns().add(classNo);
        studentsTableView.getColumns().add(genderCol);
        studentsTableView.getColumns().add(deprIdCol);
        anchorPane1.getChildren().add(studentsTableView);
        anchorPane.getChildren().add(anchorPane1);
        anchorPane2.getChildren().add(idTF);
        anchorPane2.getChildren().add(nameTF);
        anchorPane2.getChildren().add(levelTF);
        anchorPane2.getChildren().add(deptIdTF);
        anchorPane2.getChildren().add(phoneNoTF);
        anchorPane2.getChildren().add(addressTF);
        anchorPane2.getChildren().add(ageTF);
        anchorPane2.getChildren().add(genderTF);
        anchorPane2.getChildren().add(classNoTF);
        anchorPane2.getChildren().add(addBtn);
        anchorPane2.getChildren().add(updateBtn);
        anchorPane2.getChildren().add(deletBtn);
        anchorPane2.getChildren().add(reportBtn);
        anchorPane2.getChildren().add(label0);
        anchorPane2.getChildren().add(label1);
        anchorPane2.getChildren().add(label2);
        anchorPane2.getChildren().add(label3);
        anchorPane2.getChildren().add(label4);
        anchorPane2.getChildren().add(label5);
        anchorPane2.getChildren().add(label6);
        anchorPane2.getChildren().add(label7);
        anchorPane2.getChildren().add(label8);
        anchorPane2.getChildren().add(addBtn1);
        anchorPane.getChildren().add(anchorPane2);
        getChildren().add(anchorPane);
        
        DataAccessLayer conn = new DataAccessLayer();
        try {
            ArrayList<StudentsDto> result = conn.getStudentsData();
            
            
            ObservableList<StudentsDto> studentsList = FXCollections.observableArrayList(result);

            studentsTableView.setItems(studentsList);
            
                idCol.setCellValueFactory(new PropertyValueFactory<>("id"));
                nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
                levelCol.setCellValueFactory(new PropertyValueFactory<>("level"));
                phoneNoCol.setCellValueFactory(new PropertyValueFactory<>("phoneNo"));
                addressCol.setCellValueFactory(new PropertyValueFactory<>("address"));
                ageCol.setCellValueFactory(new PropertyValueFactory<>("age"));
                classNo.setCellValueFactory(new PropertyValueFactory<>("classNo"));
                genderCol.setCellValueFactory(new PropertyValueFactory<>("gender"));
                deprIdCol.setCellValueFactory(new PropertyValueFactory<>("departmentId"));

        } catch (SQLException ex) {
            Logger.getLogger(StudentSceneBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        studentsTableView.setOnMouseClicked(event -> {
        if (event.getClickCount() == 1) { // Check for single click
        // Get the selected item from the table
        StudentsDto selectedStudent = (StudentsDto) studentsTableView.getSelectionModel().getSelectedItem();
        
        
        // Check if an item is selected
        if (selectedStudent != null) {
            // Retrieve values and save them to variables
            idTF.setText(selectedStudent.getId());
            nameTF.setText(selectedStudent.getName());
            levelTF.setText(selectedStudent.getLevel());
            phoneNoTF.setText(selectedStudent.getPhoneNo());
            addressTF.setText(selectedStudent.getAddress());
            ageTF.setText(selectedStudent.getAge());
            classNoTF.setText(selectedStudent.getClassNo());
            genderTF.setText(selectedStudent.getGender());
            deptIdTF.setText(selectedStudent.getDepartmentId());
                }
       
            }
        });
        
    addBtn.setOnAction(new EventHandler<ActionEvent>() {
    @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            StudentsDto newStudent = new StudentsDto(
                    idTF.getText(),
                    nameTF.getText(),
                    levelTF.getText(),
                    phoneNoTF.getText(),
                    addressTF.getText(),
                    ageTF.getText(),
                    classNoTF.getText(),
                    genderTF.getText(),
                    deptIdTF.getText()
        );
     
        
                try {
                    if (idTF.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
                    else {conn.insertIntoStudent(newStudent);};
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    });
    
    updateBtn.setOnAction(new EventHandler<ActionEvent>() {
    @Override
        public void handle(ActionEvent event) {
            // Create a new StudentsDto object with the values from text fields
            StudentsDto newStudent = new StudentsDto(
                    idTF.getText(),
                    nameTF.getText(),
                    levelTF.getText(),
                    phoneNoTF.getText(),
                    addressTF.getText(),
                    ageTF.getText(),
                    classNoTF.getText(),
                    genderTF.getText(),
                    deptIdTF.getText()
        );
     
        DataAccessLayer conn = new DataAccessLayer();
                try {
                    if (idTF.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
                    else {conn.updateStudent(newStudent);};
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    });
    
    
    deletBtn.setOnAction(new EventHandler<ActionEvent>() {
    @Override
        public void handle(ActionEvent event) {
            String deleteId = idTF.getText();
     
                try {
                    if (idTF.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
                    else {conn.deleteStudent(deleteId);};
                    
                } catch (SQLException ex) {
                    Logger.getLogger(StudentScene.class.getName()).log(Level.SEVERE, null, ex);
                }

        }
    });


    addBtn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                try {
                    ArrayList<StudentsDto> result = conn.getStudentsData();
                    
                    ObservableList<StudentsDto> studentsList = FXCollections.observableArrayList(result);

                    studentsTableView.setItems(studentsList);
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
    
    
    reportBtn.setOnAction(event -> {
            // Create a new instance of the ReportScene (you need to define ReportScene)\
            String selectedStudentId = idTF.getText();
            if (idTF.getText().isEmpty()) {JOptionPane.showMessageDialog(null, "ID field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);}
            else{
            StudentReport reportScene = new StudentReport(selectedStudentId);

            // Create a new stage for the report scene
            Stage reportStage = new Stage();
            reportStage.initModality(Modality.APPLICATION_MODAL);
            reportStage.initStyle(StageStyle.UTILITY);
            reportStage.setTitle("Student Report");
            reportStage.setScene(new Scene(reportScene, 820, 480));

            // Show the report stage and wait for it to be closed before returning
            reportStage.showAndWait();}
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
