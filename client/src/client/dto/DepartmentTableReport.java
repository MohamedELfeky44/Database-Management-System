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
public class DepartmentTableReport {
    public String CourseName;
    public String avgGpa;

    public DepartmentTableReport(String CourseName, String avgGpa) {
        this.CourseName = CourseName;
        this.avgGpa = avgGpa;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getAvgGpa() {
        return avgGpa;
    }

    public void setAvgGpa(String avgGpa) {
        this.avgGpa = avgGpa;
    }
}
