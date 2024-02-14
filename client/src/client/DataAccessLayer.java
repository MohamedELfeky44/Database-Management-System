/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import client.dto.CourseDto;
import client.dto.CourseReportDto;
import client.dto.CourseReportTableDto;
import client.dto.DepartmentTableReport;
import client.dto.DepartmentTopReport;
import client.dto.DepartmentsDto;
import client.dto.GradesDto;
import client.dto.HomeChartDto;
import client.dto.HomeTableDto;
import client.dto.HomeTopDto;
import client.dto.ReportIntialsDto;
import client.dto.ReportTableDto;
import client.dto.StudentsDto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import oracle.jdbc.OracleDriver;

/**
 *
 * @author M.El-fiqy
 */
public class DataAccessLayer {
    
    public static void connect() throws SQLException
    {
        getConnection();
    }
    
    private static Connection getConnection() throws SQLException {
        return DatabaseConnectionManager.getInstance().getConnection();
    }
    
    public static ArrayList<StudentsDto> getStudentsData() throws SQLException{

        ArrayList<StudentsDto> stduentsList  = new ArrayList<>();
        DriverManager.registerDriver(new OracleDriver());
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","root","root");
        PreparedStatement pst = con.prepareStatement("SELECT * FROM STUDENTS ");
        ResultSet rs = pst.executeQuery();
        while (rs.next())
        {
            StudentsDto Studentsdto = new StudentsDto(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9));
            stduentsList.add(Studentsdto);
        }
        
        return stduentsList;
    }
    
    
    public static void insertIntoStudent(StudentsDto std) throws SQLException {
    try (
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement("INSERT INTO Students VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)")) {

        try {
            pst.setInt(1, Integer.parseInt(std.getId()));
            pst.setString(2, std.getName());
            pst.setInt(3, Integer.parseInt(std.getLevel()));
            pst.setDouble(4, Double.parseDouble(std.getPhoneNo()));
            pst.setString(5, std.getAddress());
            pst.setInt(6, Integer.parseInt(std.getAge()));
            pst.setInt(7, Integer.parseInt(std.getClassNo()));
            pst.setString(8, std.getGender());
            pst.setInt(9, Integer.parseInt(std.getDepartmentId()));

            pst.executeUpdate();
        } catch (NumberFormatException e) {
            // Handle the exception, log it, or show an error message.
            System.err.println("Error parsing integer value: " + e.getMessage());
            // You may want to throw a more specific exception or handle it according to your application's needs.
            }
        }
    }
    
    
    public static void updateStudent(StudentsDto std) throws SQLException {
    try (
            Connection con = getConnection();
            PreparedStatement pst = con.prepareStatement("Update Students set  STUDENT_NAME=?, STUDENT_LEVEL=?, PHONE_NO=?, ADDRESS=?, AGE=?, CLASS_ID=?, GENDER=?, DEPARTMENT_ID=? where STUDENT_ID = ? ")) {

        try {
            pst.setInt(9, Integer.parseInt(std.getId()));
            pst.setString(1, std.getName());
            pst.setInt(2, Integer.parseInt(std.getLevel()));
            pst.setDouble(3, Double.parseDouble(std.getPhoneNo()));
            pst.setString(4, std.getAddress());
            pst.setInt(5, Integer.parseInt(std.getAge()));
            pst.setInt(6, Integer.parseInt(std.getClassNo()));
            pst.setString(7, std.getGender());
            pst.setInt(8, Integer.parseInt(std.getDepartmentId()));

            pst.executeUpdate();
        } catch (NumberFormatException e) {
            // Handle the exception, log it, or show an error message.
            System.err.println("Error parsing integer value: " + e.getMessage());
            // You may want to throw a more specific exception or handle it according to your application's needs.
            }
        }
    }
  
    public static void deleteStudent(String id) throws SQLException{
        Connection con = getConnection();
        PreparedStatement pst = con.prepareStatement("begin delete_student(?); end;");
        pst.setInt(1,Integer.parseInt(id));
        pst.executeUpdate();
    }
    
    public static ArrayList<DepartmentsDto> getDepartmentsData() throws SQLException {
        ArrayList<DepartmentsDto> departmentsList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT * FROM DEPARTMENTS ");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                DepartmentsDto departmentsDto = new DepartmentsDto(rs.getString(1), rs.getString(2));
                departmentsList.add(departmentsDto);
            }
        }
        return departmentsList;
    }

    public static void insertIntoDepartment(DepartmentsDto dept) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("INSERT INTO DEPARTMENTS VALUES (?, ?)")) {

            pst.setInt(1, Integer.parseInt(dept.getDeptId()));
            pst.setString(2, dept.getDeptName());

            pst.executeUpdate();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing integer value: " + e.getMessage());
        }
    }
    
    public static void updateDepartment(DepartmentsDto dept) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("UPDATE DEPARTMENTS SET DEPARTMENT_NAME = ? WHERE DEPARTMNET_ID = ?")) {

            pst.setString(1, dept.getDeptName());
            pst.setInt(2, Integer.parseInt(dept.getDeptId()));

            pst.executeUpdate();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing integer value: " + e.getMessage());
        }
    }
    public static void deleteDepartment(String deptId) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("begin delete_department(?); end;")) {

            pst.setInt(1, Integer.parseInt(deptId));
            pst.executeUpdate();
        } catch (NumberFormatException e) {
            System.err.println("Error parsing integer value: " + e.getMessage());
        }
    }
    
    public static ArrayList<CourseDto> getCoursesData() throws SQLException {
        ArrayList<CourseDto> coursesList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT * FROM COURSES");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                CourseDto courseDto = new CourseDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
                coursesList.add(courseDto);
            }
        }
        return coursesList;
    }
    
    public static void insertIntoCourse(CourseDto course) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("INSERT INTO COURSES VALUES (?, ?, ?, ?)")) {

            pst.setString(1, course.getId());
            pst.setString(2, course.getName());
            pst.setString(3, course.getLevel());
            pst.setString(4, course.getNumOfHours());

            pst.executeUpdate();
        }
    }

    public static void updateCourse(CourseDto course) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("UPDATE COURSES SET COURSE_NAME=?, COURSE_LEVEL=?, NO_OF_HOURS=? WHERE COURSE_ID=?")) {

            pst.setString(1, course.getName());
            pst.setString(2, course.getLevel());
            pst.setString(3, course.getNumOfHours());
            pst.setString(4, course.getId());

            pst.executeUpdate();
        }
    }
    
    public static void deleteCourse(String courseId) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("begin delete_course(?); end;")) {

            pst.setString(1, courseId);
            pst.executeUpdate();
        }
    }
    
    public static void insertIntoGrades(GradesDto grade) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("INSERT INTO student_courses VALUES (?, ?, ?, ?, ?)")) {

            pst.setString(1, grade.getStudentID());
            pst.setString(2, grade.getCourseId());
            pst.setString(3, grade.getGrade());
            pst.setString(4, grade.getDescription());
            pst.setString(5, grade.getENROLLMENT_DATE());
            pst.executeUpdate();
        }
    }
    
    public static void updateGrade(GradesDto grade) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("UPDATE student_courses SET GRADE=?, DESCRIPTION=?, ENROLLMENT_DATE=? WHERE COURSE_ID=? AND STUDENT_ID=?")) {

            pst.setString(1, grade.getGrade());
            pst.setString(2, grade.getDescription());
            pst.setString(3, grade.getENROLLMENT_DATE());
            pst.setString(4, grade.getCourseId());
            pst.setString(5, grade.getStudentID());

            pst.executeUpdate();
        }
    }
    
    public static void deleteGrade(String studentId, String courseId) throws SQLException {
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("DELETE FROM student_courses WHERE COURSE_ID=? AND STUDENT_ID=?")) {

            pst.setString(1, studentId);
            pst.setString(2,courseId );

            pst.executeUpdate();
        }
    }
    
    public static ArrayList<GradesDto> getGradesData() throws SQLException {
        ArrayList<GradesDto> gradesList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT * FROM student_courses");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                GradesDto gradesDto = new GradesDto(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                gradesList.add(gradesDto);
            }
        }
        return gradesList;
    }
    
    public static ReportIntialsDto getReportIntialsData(String studentId) throws SQLException {
        ReportIntialsDto reportDto = null;
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT student_name, calc_gpa(?) FROM students WHERE student_id = ?")) {

            pst.setString(1, studentId);
            pst.setString(2, studentId);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString(1);
                    String gpa = rs.getString(2);

                    reportDto = new ReportIntialsDto(name, gpa);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return reportDto;
    }
    
    public static ArrayList<ReportTableDto> getReportTableData(String studentId) throws SQLException {
        ArrayList<ReportTableDto> reportTableList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("select C.COURSE_NAME, sc.Grade, SC.DESCRIPTION from students s join student_courses sc on s.STUDENT_ID =  sc.STUDENT_ID join courses c on C.COURSE_ID = SC.COURSE_ID where s.student_id =?")) {

            pst.setString(1, studentId);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String courseName = rs.getString("COURSE_NAME");
                    String grade = rs.getString("GRADE");
                    String description = rs.getString("DESCRIPTION");

                    ReportTableDto reportTableDto = new ReportTableDto(courseName, grade, description);
                    reportTableList.add(reportTableDto);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return reportTableList;
    }
    
    public static CourseReportDto getCourseReport(String courseId) throws SQLException {
        CourseReportDto reportDto = null;
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("select distinct calc_success_rate(?) ,count_student_number(?) from student_courses where COURSE_ID = ?")) {

            pst.setString(1, courseId);
            pst.setString(2, courseId);
            pst.setString(3, courseId);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String successRate = rs.getString(1);
                    String numOfStudents = rs.getString(2);

                    reportDto = new CourseReportDto(successRate, numOfStudents);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return reportDto;
    }
    
    public static ArrayList<CourseReportTableDto> getCourseReportTableData(String courseId) throws SQLException {
        ArrayList<CourseReportTableDto> reportTableList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("select S.STUDENT_NAME, SC.GRADE from student_courses SC join students S on S.STUDENT_ID = SC.STUDENT_ID where SC.COURSE_ID =?")) {

            pst.setString(1, courseId);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String studentName = rs.getString("STUDENT_NAME");
                    String grade = rs.getString("GRADE");

                    CourseReportTableDto reportTableDto = new CourseReportTableDto(studentName, grade);
                    reportTableList.add(reportTableDto);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return reportTableList;
    }
    
    public static DepartmentTopReport getDepartmentTopReport(String departmentId) throws SQLException {
        DepartmentTopReport topReport = null;
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT calc_student_count(?), calc_courses_count(?) FROM dual")) {

            pst.setString(1, departmentId);
            pst.setString(2, departmentId);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String studentCount = rs.getString(1);
                    String courseCount = rs.getString(2);

                    topReport = new DepartmentTopReport(studentCount, courseCount);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return topReport;
    }
    
    public static ArrayList<DepartmentTableReport> getDepartmentTableReportData(String departmentId) throws SQLException {
        ArrayList<DepartmentTableReport> reportTableList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("select C.COURSE_NAME, round(avg(sc.GRADE),2) from departments d join department_courses dc on dc.DEPARTMENT_ID = d.DEPARTMNET_ID join courses c on c.COURSE_ID = dc.COURSE_ID join student_courses sc on SC.COURSE_ID = C.COURSE_ID where d.DEPARTMNET_ID=? group by C.COURSE_NAME")) {

            pst.setString(1, departmentId);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String courseName = rs.getString("COURSE_NAME");
                    String avgGpa = rs.getString(2);

                    DepartmentTableReport reportTableDto = new DepartmentTableReport(courseName, avgGpa);
                    reportTableList.add(reportTableDto);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return reportTableList;
    }
    
    public static HomeTopDto getHomeTopData() throws SQLException {
        
        HomeTopDto homeTopDto = null;
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT calc_total_students(), calc_total_depts(), calc_total_courses() FROM dual")) {

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String totalStudents = rs.getString(1);
                    String totalDepartments = rs.getString(2);
                    String totalCourses = rs.getString(3);

                    homeTopDto = new HomeTopDto(totalStudents, totalDepartments, totalCourses);
                }
            }

        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return homeTopDto;
    }
    
    public static ArrayList<HomeTableDto> getHomeTableData() throws SQLException {
        ArrayList<HomeTableDto> homeTableList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT course_name FROM courses");
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                String courseName = rs.getString("COURSE_NAME");
                HomeTableDto homeTableDto = new HomeTableDto(courseName);
                homeTableList.add(homeTableDto);
            }
        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return homeTableList;
    }
    
    public static ArrayList<HomeChartDto> getHomeChartData(String courseName) throws SQLException {
        ArrayList<HomeChartDto> homeChartList = new ArrayList<>();
        Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("SELECT SC.ENROLLMENT_DATE, ROUND(AVG(SC.GRADE), 0) " +
                                                            "FROM student_courses SC JOIN courses S ON SC.COURSE_ID = S.COURSE_ID " +
                                                            "WHERE S.COURSE_NAME = ? " +
                                                            "GROUP BY SC.ENROLLMENT_DATE")) {

            pst.setString(1, courseName);

            try (ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String date = rs.getString("ENROLLMENT_DATE");
                    String avgGrade = rs.getString(2);  // Using column index (2) because the alias is not recognized

                    HomeChartDto homeChartDto = new HomeChartDto(date, avgGrade);
                    homeChartList.add(homeChartDto);
                }
            }
        } catch (SQLException e) {
            // Handle SQL exception (e.g., log or throw a custom exception)
            e.printStackTrace();
            throw e;
        }

        return homeChartList;
    }
    
    public static void InsertIntoDeptCourse(String deptID,String courseId) throws SQLException
    {
    Connection con = getConnection();
        try (
             PreparedStatement pst = con.prepareStatement("INSERT INTO department_Courses VALUES (?, ?)")) {

            pst.setString(1,deptID);
            pst.setString(2,courseId);
            pst.executeUpdate();
        }
    }

}
