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
public class StudentsPerCourse {
    private Courses course;
    private List<Students> Students;

    public Courses getCourse() {
        return course;
    }

    public List<Students> getStudents() {
        return Students;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public void setStudents(List<Students> Students) {
        this.Students = Students;
    }

    public StudentsPerCourse() {
    }

    public StudentsPerCourse(Courses course, List<Students> Students) {
        this.course = course;
        this.Students = Students;
    }

    @Override
    public String toString() {
        return "StudentsPerCourse{" + "course=" + course + ", Students=" + Students + '}';
    }
    
    
    
}
