/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import java.time.LocalDate;

/**
 *
 * @author lampr
 */
public class Assignments {
    private String title;
    private String description;
    private LocalDate subDateTime;
    private double oralMark;
    private double totalMark;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public double getOralMark() {
        return oralMark;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    public void setOralMark(double oralMark) {
        this.oralMark = oralMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public Assignments() {
    }

    public Assignments(String title, String description, LocalDate subDateTime, double oralMark, double totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignments{" + "title=" + title + ", description=" + description + ", subDateTime=" + subDateTime + ", oralMark=" + oralMark + ", totalMark=" + totalMark + '}';
    }
    
    
    
}
