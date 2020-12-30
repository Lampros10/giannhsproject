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
public class TrainersPerCourse {
    private Courses course;
    private List<Trainers> trainers;

    public Courses getCourse() {
        return course;
    }

    public void setCourse(Courses course) {
        this.course = course;
    }

    public List<Trainers> getTrainers() {
        return trainers;
    }

    public void setTrainers(List<Trainers> trainers) {
        this.trainers = trainers;
    }

    public TrainersPerCourse() {
    }

    public TrainersPerCourse(Courses course, List<Trainers> trainers) {
        this.course = course;
        this.trainers = trainers;
    }

    @Override
    public String toString() {
        return "TrainersPerCourse{" + "course=" + course + ", trainers=" + trainers + '}';
    }

    
    
    
    
}
