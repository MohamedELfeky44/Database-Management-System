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
public class CourseDto {
    public String id;
    public String name;
    public String level;
    public String numOfHours;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getNumOfHours() {
        return numOfHours;
    }

    public void setNumOfHours(String numOfHours) {
        this.numOfHours = numOfHours;
    }

    public CourseDto(String id, String name, String level, String numOfHours) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.numOfHours = numOfHours;
    }
}
