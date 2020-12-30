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
public class AssignmentsPerStudent {
    private StudentsPerCourse studentsPerCourse;
    private AssignmentsPerCourse assignmentsPerCourse;

    public StudentsPerCourse getStudentsPerCourse() {
        return studentsPerCourse;
    }

    public AssignmentsPerCourse getAssignmentsPerCourse() {
        return assignmentsPerCourse;
    }

    public void setStudentsPerCourse(StudentsPerCourse studentsPerCourse) {
        this.studentsPerCourse = studentsPerCourse;
    }

    public void setAssignmentsPerCourse(AssignmentsPerCourse assignmentsPerCourse) {
        this.assignmentsPerCourse = assignmentsPerCourse;
    }

    public AssignmentsPerStudent() {
    }

    public AssignmentsPerStudent(StudentsPerCourse studentsPerCourse, AssignmentsPerCourse assignmentsPerCourse) {
        this.studentsPerCourse = studentsPerCourse;
        this.assignmentsPerCourse = assignmentsPerCourse;
    }

    @Override
    public String toString() {
        return "AssignmentsPerStudent{" + "studentsPerCourse=" + studentsPerCourse + ", assignmentsPerCourse=" + assignmentsPerCourse + '}';
    }
    
    
    
}
