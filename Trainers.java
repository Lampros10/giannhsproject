/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

/**
 *
 * @author lampr
 */
public class Trainers {
    private String firstName;
    private String lastName;
    

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

   

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    

    public Trainers() {
    }
    

    public Trainers(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        
    }

    @Override
    public String toString() {
        return "Trainers{" + "firstName=" + firstName + ", lastName=" + lastName + '}';
    }
    
    
    
    
}
