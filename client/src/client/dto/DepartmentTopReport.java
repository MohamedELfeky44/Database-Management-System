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
public class DepartmentTopReport {
    public String studentCount; 
    public String courseCount;

    public DepartmentTopReport(String studentCount, String courseCount) {
        this.studentCount = studentCount;
        this.courseCount = courseCount;
    }

    public String getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(String studentCount) {
        this.studentCount = studentCount;
    }

    public String getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(String courseCount) {
        this.courseCount = courseCount;
    }
}
