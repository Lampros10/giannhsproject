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
public class AssignmentsPerCourse {
    private Courses course;
    private List<Assignments> assignments;

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public List<Assignments> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignments> assignments) {
        this.assignments = assignments;
    }

    public AssignmentsPerCourse() {
    }

    public AssignmentsPerCourse(Courses course, List<Assignments> assignments) {
        this.course = course;
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "AssignmentsPerCourse{" + "course=" + course + ", assignments=" + assignments + '}';
    }

    
    
    
    
}
