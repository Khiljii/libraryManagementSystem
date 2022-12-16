package com.example.libraryManagementSystem.libraryManagementSystem.dao;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "lended")
public class Lended {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(columnDefinition = "req_id",referencedColumnName = "id")
    private  Request requestid;

    @ManyToOne
    @JoinColumn(columnDefinition = "user_id",referencedColumnName = "id")
    private  Users usersid;

    @ManyToOne
    @JoinColumn(columnDefinition = "book_id",referencedColumnName = "id")
    private  Library libraryid;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;

    public Lended() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Request getRequestid() {
        return requestid;
    }

    public void setRequestid(Request requestid) {
        this.requestid = requestid;
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
