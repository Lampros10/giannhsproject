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
public class StudentsPerAssignment {
    private Assignments assignment;
    private List<Students> students;

    public Assignments getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignments assignment) {
        this.assignment = assignment;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public StudentsPerAssignment() {
    }

    public StudentsPerAssignment(Assignments assignment, List<Students> students) {
        this.assignment = assignment;
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentsPerAssignment{" + "assignment=" + assignment + ", students=" + students + '}';
    }
    
    
    
}
