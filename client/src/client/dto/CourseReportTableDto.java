/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.dto;

/**
 *
 * @author M.El-fiqy
 */
public class CourseReportTableDto {
    public String studentName;
    public String Grade;

    public CourseReportTableDto(String studentName, String Grade) {
        this.studentName = studentName;
        this.Grade = Grade;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }
    
}
