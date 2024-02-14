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
public class ReportIntialsDto {
    public String name;
    public String gpa;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public ReportIntialsDto(String name, String gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    
}
