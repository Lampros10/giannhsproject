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
public class Students {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private double touitionFees;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public double getTouitionFees() {
        return touitionFees;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setTouitionFees(double touitionFees) {
        this.touitionFees = touitionFees;
    }

    public Students() {
    }

    public Students(String firstName, String lastName, LocalDate dateOfBirth, double touitionFees) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.touitionFees = touitionFees;
    }

    @Override
    public String toString() {
        return "Students{" + "firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth + ", touitionFees=" + touitionFees + '}';
    }
    
    
    
}
