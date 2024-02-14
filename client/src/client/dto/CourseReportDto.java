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
public class CourseReportDto {
    public String successRate; 
    public String numOfStudents;

    public CourseReportDto(String successRate, String numOfStudents) {
        this.successRate = successRate;
        this.numOfStudents = numOfStudents;
    }

    public String getSuccessRate() {
        return successRate;
    }

    public void setSuccessRate(String successRate) {
        this.successRate = successRate;
    }

    public String getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(String numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
}
