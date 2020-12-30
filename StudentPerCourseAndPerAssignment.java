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
public class StudentPerCourseAndPerAssignment {
    private StudentsPerCourse studentsPerCourse;
    private List<Assignments> assignments;

    public StudentsPerCourse getStudentsPerCourse() {
        return studentsPerCourse;
    }

    public void setStudentsPerCourse(StudentsPerCourse studentsPerCourse) {
        this.studentsPerCourse = studentsPerCourse;
    }

    public List<Assignments> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignments> assignments) {
        this.assignments = assignments;
    }

    public StudentPerCourseAndPerAssignment() {
    }

    public StudentPerCourseAndPerAssignment(StudentsPerCourse studentsPerCourse, List<Assignments> assignments) {
        this.studentsPerCourse = studentsPerCourse;
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "StudentPerCourseAndPerAssignment{" + "studentsPerCourse=" + studentsPerCourse + ", assignments=" + assignments + '}';
    }
    
    
    
}
