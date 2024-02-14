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
public class GradesDto {
    public String StudentID;
    public String CourseId;
    public String Grade;
    public String Description;
    public String ENROLLMENT_DATE;

    public GradesDto(String StudentID, String CourseId, String Grade, String Description, String ENROLLMENT_DATE) {
        this.CourseId = CourseId;
        this.StudentID = StudentID;
        this.Grade = Grade;
        this.Description = Description;
        this.ENROLLMENT_DATE = ENROLLMENT_DATE;
    }

    public String getCourseId() {
        return CourseId;
    }

    public void setCourseId(String CourseId) {
        this.CourseId = CourseId;
    }

    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String Grade) {
        this.Grade = Grade;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getENROLLMENT_DATE() {
        return ENROLLMENT_DATE;
    }

    public void setENROLLMENT_DATE(String ENROLLMENT_DATE) {
        this.ENROLLMENT_DATE = ENROLLMENT_DATE;
    }
    
    
}
