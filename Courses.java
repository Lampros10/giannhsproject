/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author lampr
 */
public class Courses {
    private String title; // ex. CB11 Part time Java
    private String type;// Java, C, Javascript
    private String stream;// Part Time, Full Time
    private LocalDate startDate;// 15/07/2020
    private LocalDate endDate;// 31/01/2021

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public String getStream() {
        return stream;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Courses() {
    }

    public Courses(String title, String type, String stream, LocalDate startDate, LocalDate endDate) {
        this.title = title;
        this.type = type;
        this.stream = stream;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Courses{" + "title=" + title + ", type=" + type + ", stream=" + stream + ", startDate=" + startDate + ", endDate=" + endDate + '}';
    }
    
    
    
}
