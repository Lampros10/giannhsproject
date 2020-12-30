/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import java.util.List;

/**
 *
 * @author lampr
 */
public class CoursesPerStudent {
    private Students student;
    private List <Courses> courses;

    public Students getStudent() {
        return student;
    }

    public void setStudent(Students student) {
        this.student = student;
    }

    public List <Courses> getCourses() {
        return courses;
    }

    public void setCourses(List <Courses> courses) {
        this.courses = courses;
    }

    public CoursesPerStudent() {
    }

    public CoursesPerStudent(Students student, List<Courses> courses) {
        this.student = student;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "CoursesPerStudent{" + "student=" + student + ", courses=" + courses + '}';
    }
    
    
    
}
