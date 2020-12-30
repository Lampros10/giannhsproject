/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualproject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import static java.time.DayOfWeek.TUESDAY;
import static java.time.DayOfWeek.MONDAY;
import static java.time.DayOfWeek.WEDNESDAY;
import static java.time.DayOfWeek.THURSDAY;
import static java.time.DayOfWeek.FRIDAY;
import static java.time.DayOfWeek.SUNDAY;
import static java.time.DayOfWeek.SATURDAY;

/**
 *
 * @author lampr
 */
public class IndividualProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        ArrayList<Students> studentsList = new ArrayList<>();
//        ArrayList<Trainers> trainersList = new ArrayList<>();
//        ArrayList<Courses> coursesList = new ArrayList<>();
//        ArrayList<Assignments> assignmentsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to use synthetic data?");
        String answer = sc.next();
        if (answer.equals("yes") || answer.equals("Yes") || answer.equals("YES")) {
            syntheticData();
        } else {
            insertData();
        }
    }
    
    public static void syntheticData() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Students> studentsList = new ArrayList<>();
        ArrayList<LocalDate> subDate1 = new ArrayList<>();
        ArrayList<Trainers> trainersList = new ArrayList<>();
        ArrayList<Courses> coursesList = new ArrayList<>();
        ArrayList<Assignments> assignmentsList = new ArrayList<>();
        ArrayList<StudentsPerCourse> studentsPerCourse = new ArrayList<>();
        ArrayList<TrainersPerCourse> trainersPerCourse = new ArrayList<>();
        ArrayList<AssignmentsPerCourse> assignmentsPerCourse = new ArrayList<>();
        ArrayList<StudentPerCourseAndPerAssignment> studentPerCourseAndPerAssignment = new ArrayList<>();
        ArrayList<CoursesPerStudent> coursesPerStudent = new ArrayList<>();
        ArrayList<StudentsPerAssignment> studentsPerAssignment = new ArrayList<>();
        
        Students student1 = new Students("Lampros", "Tsioris", LocalDate.of(1994, 9, 10), 1500);
        Students student2 = new Students("Andreas", "Nikou", LocalDate.of(1992, 2, 24), 5500);
        Students student3 = new Students("Nikos", "Lamprou", LocalDate.of(1958, 8, 18), 55000);
        Students student4 = new Students("Litsa", "Nikou", LocalDate.of(1961, 3, 17), 15000);
        studentsList.add(student1);
        studentsList.add(student2);
        studentsList.add(student3);
        studentsList.add(student4);

        Trainers trainer1 = new Trainers("George", "Pasparakis");
        Trainers trainer2 = new Trainers("Anastasios", "Lelakis");
        Trainers trainer3 = new Trainers("Spyros", "Mavros");
        trainersList.add(trainer1);
        trainersList.add(trainer2);
        trainersList.add(trainer3);

        Courses java = new Courses("CB11 Part time Java", "Java", "Part Time", LocalDate.of(2020, 6, 15), LocalDate.of(2021, 1, 18));
        Courses sql = new Courses("CB11 Part time SQL", "SQL", "Part Time", LocalDate.of(2020, 9, 1), LocalDate.of(2020, 9, 30));
        Courses javascript = new Courses("CB11 Part time Javascript", "Javascript", "Part Time", LocalDate.of(2020, 10, 1), LocalDate.of(2020, 10, 30));
        coursesList.add(java);
        coursesList.add(sql);
        coursesList.add(javascript);
        
        Assignments project0 = new Assignments("Project0", "Questions with Scanner", LocalDate.of(2020, 7, 1), 90, 80);
        Assignments individualProject = new Assignments("individualProject", "Create a school program", LocalDate.of(2020, 8, 7), 70, 60);
        Assignments teamProject = new Assignments("teamProject", "Create an application", LocalDate.of(2021, 1, 15), 90, 80);
        subDate1.add(LocalDate.of(2020, 7, 1));
        subDate1.add(LocalDate.of(2020, 8, 7));
        subDate1.add(LocalDate.of(2021, 1, 15));
        
        assignmentsList.add(project0);
        assignmentsList.add(individualProject);
        assignmentsList.add(teamProject);

        
        
        StudentsPerCourse studentsPerCourse1 = new StudentsPerCourse(java, studentsList.subList(0, 1));
        StudentsPerCourse studentsPerCourse2 = new StudentsPerCourse(sql, studentsList.subList(2, 3));
        StudentsPerCourse studentsPerCourse3 = new StudentsPerCourse(javascript, studentsList.subList(1, 2));
        studentsPerCourse.add(studentsPerCourse1);
        studentsPerCourse.add(studentsPerCourse2);
        studentsPerCourse.add(studentsPerCourse3);
        
        
        TrainersPerCourse trainersPerCourse1 = new TrainersPerCourse(java, trainersList.subList(0, 2));
        TrainersPerCourse trainersPerCourse2 = new TrainersPerCourse(sql, trainersList.subList(0, 1));
        TrainersPerCourse trainersPerCourse3 = new TrainersPerCourse(javascript, trainersList.subList(1, 2));
        trainersPerCourse.add(trainersPerCourse1);
        trainersPerCourse.add(trainersPerCourse2);
        trainersPerCourse.add(trainersPerCourse3);
        
        
        AssignmentsPerCourse assignmentsPerCourse1 = new AssignmentsPerCourse(java, assignmentsList.subList(0, 2));
        AssignmentsPerCourse assignmentsPerCourse2 = new AssignmentsPerCourse(sql, assignmentsList.subList(0, 1));
        AssignmentsPerCourse assignmentsPerCourse3 = new AssignmentsPerCourse(javascript, assignmentsList.subList(1, 2));
        assignmentsPerCourse.add(assignmentsPerCourse1);
        assignmentsPerCourse.add(assignmentsPerCourse2);
        assignmentsPerCourse.add(assignmentsPerCourse3);
        
        
        
        StudentPerCourseAndPerAssignment studentsPerCourseAndPerAssignment1 = new StudentPerCourseAndPerAssignment(studentsPerCourse1, assignmentsList.subList(0, 2));
        StudentPerCourseAndPerAssignment studentsPerCourseAndPerAssignment2 = new StudentPerCourseAndPerAssignment(studentsPerCourse2, assignmentsList.subList(0, 1));
        StudentPerCourseAndPerAssignment studentsPerCourseAndPerAssignment3 = new StudentPerCourseAndPerAssignment(studentsPerCourse3, assignmentsList.subList(1, 2));
        studentPerCourseAndPerAssignment.add(studentsPerCourseAndPerAssignment1);
        studentPerCourseAndPerAssignment.add(studentsPerCourseAndPerAssignment2);
        studentPerCourseAndPerAssignment.add(studentsPerCourseAndPerAssignment3);
        
        StudentsPerAssignment studentsPerAssignment1 = new StudentsPerAssignment(project0, studentsList.subList(0, 3));
        StudentsPerAssignment studentsPerAssignment2 = new StudentsPerAssignment(individualProject, studentsList.subList(1, 2));
        StudentsPerAssignment studentsPerAssignment3 = new StudentsPerAssignment(teamProject, studentsList.subList(2, 3));
        studentsPerAssignment.add(studentsPerAssignment1);
        studentsPerAssignment.add(studentsPerAssignment2);
        studentsPerAssignment.add(studentsPerAssignment3);
        
        /*
        CoursesPerStudent coursesPerStudent1 = new CoursesPerStudent(student1, coursesList.subList(0, 2));
        CoursesPerStudent coursesPerStudent2 = new CoursesPerStudent(student2, coursesList.subList(0, 1));
        CoursesPerStudent coursesPerStudent3 = new CoursesPerStudent(student3, coursesList.subList(1, 2));
        CoursesPerStudent coursesPerStudent4 = new CoursesPerStudent(student4, coursesList.subList(1, 2));
        coursesPerStudent.add(coursesPerStudent1);
        coursesPerStudent.add(coursesPerStudent2);
        coursesPerStudent.add(coursesPerStudent3);
        coursesPerStudent.add(coursesPerStudent4);
        System.out.println(coursesPerStudent);
        
        
        for (int g = 0 ; g < studentsPerCourse.size(); g++){
            System.out.println(studentsPerCourse.get(g));
            
            if (studentsList.size() >= 2){
                
            }
        }
        */
        System.out.println(studentsList);
        System.out.println(trainersList);
        System.out.println(coursesList);
        System.out.println(assignmentsList);
        System.out.println(studentsPerCourse);
        System.out.println(trainersPerCourse);
        System.out.println(assignmentsPerCourse);
        System.out.print("Students with 2 or more courses: ");
        System.out.print(student2);
        System.out.println(student3);
        
        
        Calendar calen = Calendar.getInstance();
        System.out.println("Give a date in form dd/MM/yyyy : ");
        String caller = sc.nextLine();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate submissionDate3 = LocalDate.parse(caller, formatter1);
            
            String dateToPrint1 = submissionDate3.format(formatter1);
            
            int h;
            
            
            if (submissionDate3.getDayOfWeek() == SATURDAY){
                
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.minusDays(5).compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.minusDays(1).compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }else if (submissionDate3.getDayOfWeek() == SUNDAY){
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.minusDays(6).compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.minusDays(2).compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }else if (submissionDate3.getDayOfWeek() == MONDAY){
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.plusDays(4).compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }else if (submissionDate3.getDayOfWeek() == TUESDAY){
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.minusDays(1).compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.plusDays(3).compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }else if (submissionDate3.getDayOfWeek() == WEDNESDAY){
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.minusDays(2).compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.plusDays(2).compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }else if (submissionDate3.getDayOfWeek() == THURSDAY){
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.minusDays(3).compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.plusDays(1).compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }else if (submissionDate3.getDayOfWeek() == FRIDAY){
                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
                for (h = 0; h < subDate1.size(); h++){
                    if(submissionDate3.minusDays(4).compareTo(subDate1.get(h)) <= 0
                       && submissionDate3.compareTo(subDate1.get(h)) >= 0){
                            System.out.println(assignmentsList.get(h));
                            System.out.println(studentsPerAssignment.get(h));
                    }
                }
            }
    }
    
    
    public static void insertData() { 
        ArrayList<LocalDate> subDate = new ArrayList<>();
        ArrayList<Students> studentsList = new ArrayList<>();
        ArrayList<Students> studentsListPerCourse = new ArrayList<>();
        ArrayList<Students> studentsListPerCourse1 = new ArrayList<>();
        ArrayList<Trainers> trainersListPerCourse = new ArrayList<>();
        ArrayList<Assignments> assignmentsListPerCourse = new ArrayList<>();
        ArrayList<Trainers> trainersList = new ArrayList<>();
        ArrayList<Courses> coursesList = new ArrayList<>();
        ArrayList<Assignments> assignmentsList = new ArrayList<>();
        ArrayList<StudentsPerCourse> studentsPerCourse = new ArrayList<>();
        ArrayList<TrainersPerCourse> trainersPerCourse = new ArrayList<>();
        ArrayList<AssignmentsPerCourse> assignmentsPerCourse = new ArrayList<>();
        ArrayList<StudentPerCourseAndPerAssignment> studentPerCourseAndPerAssignment = new ArrayList<>();
        ArrayList<Students> dublicates = new ArrayList<>();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many students there are?");
        int numberOfStudents = sc.nextInt();
        for(int i = 0; i < numberOfStudents; i++){
            System.out.println("What is student's number " + ( i + 1) + " first name? ");
            String firstName = sc.next();
            System.out.println("What is student's number " + ( i + 1) + " last name? ");
            String lastName = sc.next();
            System.out.println("What is student's number " + ( i + 1) + " date of birth? Give the date of birth in form type dd/MM/yyyy");
            String dateOfBirth = sc.next();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateOfBirth1 = LocalDate.parse(dateOfBirth,formatter1);
            
            String dateToPrint1 = dateOfBirth1.format(formatter1);
            
            System.out.println("What is student's number " + ( i + 1) + " tuition fees? ");
            double tuitionFees = sc.nextDouble();
            Students student = new Students (firstName, lastName, dateOfBirth1, tuitionFees);
            studentsList.add(student);
            
        }
            System.out.println(studentsList);
        System.out.println("How many trainers there are? ");
        int numberOfTrainers = sc.nextInt();
        for(int i = 0; i < numberOfTrainers; i++){
            System.out.println("What is trainer's number " + ( i + 1) + " first name? ");
            String firstName = sc.next();
            System.out.println("What is trainer's number " + ( i + 1) + " last name? ");
            String lastName = sc.next();
            Trainers trainer = new Trainers(firstName, lastName);
            trainersList.add(trainer);
            

        }
            
//        System.out.println(trainersList.get(0));
//        trainersList.get(0);
//        Trainers john = new Trainers("John", "Jonathan");
//        TrainersStudents connection = new TrainersStudents(trainersList.get(0), studentsList.get(0-3));
//        System.out.println(connection);
        
        

        
        System.out.println("How many courses there are? ");
        int numberOfCourses = sc.nextInt();
        for(int i = 0; i < numberOfCourses; i++){
            System.out.println("What is course's number " + ( i + 1) + " title? ");
            String title = sc.next();
            System.out.println("What is course's number " + ( i + 1) + " type? ");
            String type = sc.next();
            System.out.println("What is course's number " + ( i + 1) + " stream? ");
            String stream = sc.next();
            System.out.println("What is course's number " + ( i + 1) + " start date? ");
            String startDate = sc.next();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate startDate1 = LocalDate.parse(startDate,formatter1);
            
            String dateToPrint1 = startDate1.format(formatter1);
            
            System.out.println("What is course's number " + ( i + 1) + " end date? ");
            String endDate = sc.next();
            DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate endDate1 = LocalDate.parse(endDate,formatter2);
            
            String dateToPrint2 = endDate1.format(formatter2);
            
            Courses courses = new Courses (title, type, stream, startDate1, endDate1);
            coursesList.add(courses);
            
            
        }
            
            
            //System.out.println("How many students has this course? " + coursesList.get(0));
            //int numberOfStudentsInCourse = sc.nextInt();
            Set<Students> s = new HashSet<>();
            
            
            
            int i;
            int j;
            for(i = 0 ; i < coursesList.size() ; i++){
                System.out.println("How many students has this course? " + coursesList.get(i));
                int numberOfStudentsInCourse = sc.nextInt();
                System.out.println("In which position in arraylist with students are the students who participate in " + coursesList.get(i) + ".Give them one by one step by step.");
                for(j = 0; j < numberOfStudentsInCourse; j++){
                    System.out.println("Give the position in arraylist students from 0 - " + (studentsList.size() - 1) + ".Give position student's number " + (j+1));
                    int StudentsPosition = sc.nextInt();
                    studentsListPerCourse.add(studentsList.get(StudentsPosition));
                    s.add(studentsList.get(StudentsPosition));
                    if (s.add(studentsList.get(StudentsPosition)) == false){
                        dublicates.add(studentsList.get(StudentsPosition));
                    }
                }
                
                StudentsPerCourse studentsPerCourseObject = new StudentsPerCourse(coursesList.get(i), studentsList);
                
                studentsPerCourse.add(studentsPerCourseObject);
            }
            
            
            
            int a;
            int b;
            for(a = 0 ; a < coursesList.size() ; a++){
                System.out.println("How many trainers has this course? " + coursesList.get(a));
                int numberOfTrainersInCourse = sc.nextInt();
                System.out.println("In which position in arraylist with trainers are the trainers who participate in " + coursesList.get(a) + ".Give them one by one step by step.");
                for(b = 0; b < numberOfTrainersInCourse; b++){
                    System.out.println("Give the position in arraylist trainers from 0 - " + (trainersList.size() - 1) + ".Give position trainer's number " + (b+1));
                    int TrainersPosition = sc.nextInt();
                    trainersListPerCourse.add(trainersList.get(TrainersPosition));
                }
                
                TrainersPerCourse trainersPerCourseObject = new TrainersPerCourse(coursesList.get(a), trainersList);
                System.out.println(trainersPerCourseObject);
                trainersPerCourse.add(trainersPerCourseObject);
            }
            System.out.println("--------");    
            System.out.println(trainersPerCourse);
            System.out.println("--------");
            
            
//            StudentsPerCourse studentsPerCoursel0 = new StudentsPerCourse(coursesList.get(i), studentsList.get(StudentsPosition);
//            studentsListPerCourse.add(studentsList.get(StudentsPosition));
//            System.out.println("How many students has this course? ");
//            int numberOfStudents = sc.nextInt();
//            for(int i = 0 ; i < numberOfStudents ; i++){
//                System.out.println("Course: " + coursesList[i] + " ");
//            }
        // title description dates marks
        System.out.println("How many assignments there are? ");
        int numberOfAssignments = sc.nextInt();
        for(int k = 0; k < numberOfAssignments; k++){
            System.out.println("What is assignment's number " + ( k + 1) + " title? ");
            String title = sc.next();
            System.out.println("What is assignment's number " + ( k + 1) + " description? ");
            String description = sc.next();
            System.out.println("What is assignment's number " + ( k + 1) + " submission date? ");
            String submissionDate = sc.next();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate submissionDate1 = LocalDate.parse(submissionDate,formatter1);
            subDate.add(submissionDate1);
            
            String dateToPrint1 = submissionDate1.format(formatter1);
            
            System.out.println("What is assignment's number " + ( k + 1) + " oral mark? ");
            int oralMark = sc.nextInt();
            System.out.println("What is assignment's number " + ( k + 1) + " total mark? ");
            int totalMark = sc.nextInt();
            Assignments assignments = new Assignments (title, description, submissionDate1, oralMark, totalMark);
            assignmentsList.add(assignments);
            
            
        }
            
            
            
            int c;
            int d;
            for(c = 0 ; c < coursesList.size() ; c++){
                System.out.println("How many assignments has this course? " + assignmentsList.get(c));
                int numberOfAssignmentsInCourse = sc.nextInt();
                System.out.println("In which position in arraylist with assignments are the students who participate in " + coursesList.get(c) + ".Give them one by one step by step.");
                for(d = 0; d < numberOfAssignmentsInCourse; d++){
                    System.out.println("Give the position in arraylist assignments from 0 - " + (assignmentsList.size() - 1) + ".Give position assignment's number " + (d+1));
                    int AssignmentsPosition = sc.nextInt();
                    assignmentsListPerCourse.add(assignmentsList.get(AssignmentsPosition));
                }
                
                AssignmentsPerCourse assignmentsPerCourseObject = new AssignmentsPerCourse(coursesList.get(c), assignmentsList);
                
                assignmentsPerCourse.add(assignmentsPerCourseObject);
            }
            
            
            
            
            int k;
            int f;
            for(k = 0 ; k < studentsPerCourse.size() ; k++){
                System.out.println("How many assignments has this student, in this course? " + assignmentsPerCourse.get(k));
                int numberOfAssignmentsInCourseInAssignment = sc.nextInt();
                System.out.println("In which position in arraylist with assignments are the students per course who participate in " + studentsPerCourse.get(k) + ".Give them one by one step by step.");
                for(f = 0; f < numberOfAssignmentsInCourseInAssignment; f++){
                    System.out.println("Give the position in arraylist assignments from 0 - " + (assignmentsList.size() - 1) + ".Give position assignment's number " + (f+1));
                    int AssignmentsPosition = sc.nextInt();
                    assignmentsListPerCourse.add(assignmentsList.get(AssignmentsPosition));
                }
                
                StudentPerCourseAndPerAssignment studentPerCourseAndPerAssignmentObject = new StudentPerCourseAndPerAssignment(studentsPerCourse.get(k), assignmentsList);
                
                studentPerCourseAndPerAssignment.add(studentPerCourseAndPerAssignmentObject);
            }
            
            System.out.println(studentsList);
            System.out.println(trainersList);
            System.out.println(coursesList);
            System.out.println(assignmentsList);
            System.out.println(studentsListPerCourse);
            System.out.println(trainersListPerCourse);
            System.out.println(assignmentsListPerCourse);
            System.out.println(studentPerCourseAndPerAssignment);
            System.out.println("Students with more than one courses: "+dublicates);
            
            
            // Για να τυπώνει τους μαθητές εαν υπάρχουν εργασίες που πρέπει να υποβληθούν από Δευτέρα έως Παρασκευή της δοθείσας εβδομάδας
            try{
            Calendar cal = Calendar.getInstance();
            System.out.println("Give Date");
            String cal1 = sc.nextLine();
            DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate submissionDate3 = LocalDate.parse(cal1, formatter1);
            System.out.println("dateFromString1: " + cal1);
            String dateToPrint1 = submissionDate3.format(formatter1);
            System.out.println("dateToPrint1: " + dateToPrint1);
            }
            catch (Exception e) {
                System.out.println("Something wrong");
            }
//            Calendar cal = Calendar.getInstance();
//            System.out.println("Give Date in form dd/MM/yyyy ");
//            String caller = sc.nextLine();
//            DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//            LocalDate submissionDate3 = LocalDate.parse(caller, formatter4);
//            
//            String dateToPrint1 = submissionDate3.format(formatter4);
            
//            int h;
//            System.out.println(cal.get(Calendar.DAY_OF_WEEK));
//            
//            if (submissionDate3.getDayOfWeek() == SATURDAY){
//                
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.minusDays(5).compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.minusDays(1).compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else if (submissionDate3.getDayOfWeek() == SUNDAY){
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.minusDays(6).compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.minusDays(2).compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else if (submissionDate3.getDayOfWeek() == MONDAY){
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.plusDays(4).compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else if (submissionDate3.getDayOfWeek() == TUESDAY){
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.minusDays(1).compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.plusDays(3).compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else if (submissionDate3.getDayOfWeek() == WEDNESDAY){
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.minusDays(2).compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.plusDays(2).compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else if (submissionDate3.getDayOfWeek() == THURSDAY){
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.minusDays(3).compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.plusDays(1).compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else if(submissionDate3.getDayOfWeek() == FRIDAY){
//                System.out.println("From: " + submissionDate3.minusDays(5) + " to: " + submissionDate3.minusDays(1));
//                for (h = 0; h < subDate.size(); h++){
//                    if(submissionDate3.minusDays(4).compareTo(subDate.get(h)) <= 0
//                       && submissionDate3.compareTo(subDate.get(h)) >= 0){
//                            System.out.println(assignmentsList.get(h));
//                            System.out.println(studentsPerCourse.get(h));
//                    }
//                }
//            }else {
//                System.out.println("You didnt get valid date");
//            }    
            
    }
    
    

    


    
    
}
        
    




