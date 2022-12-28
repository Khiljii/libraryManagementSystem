package com.example.libraryManagementSystem.libraryManagementSystem.dto;

import com.example.libraryManagementSystem.libraryManagementSystem.dao.Library;
import com.example.libraryManagementSystem.libraryManagementSystem.dao.Users;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RequestDto {
    private Long id;
    private Users usersid;
    private Library libraryid;
    private String startDate;
    private String endDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Users getUsersid() {
        return usersid;
    }

    public void setUsersid(Users usersid) {
        this.usersid = usersid;
    }

    public Library getLibraryid() {
        return libraryid;
    }

    public void setLibraryid(Library libraryid) {
        this.libraryid = libraryid;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
