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
public class DepartmentsDto {
    private String deptId;
    private String deptName;

    public String getDeptId() {
        return deptId;
    }

    public DepartmentsDto(String deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
