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
public class HomeChartDto {
    public String date;
    public String avgGrade;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(String avgGrade) {
        this.avgGrade = avgGrade;
    }

    public HomeChartDto(String date, String avgGrade) {
        this.date = date;
        this.avgGrade = avgGrade;
    }
}
