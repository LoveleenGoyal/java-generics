package com.bridgelabz.universityCourse;

public class UniversityManagement {
    public static void main(String[] args) {
        Course<ExamCourse> mathCourse = new Course<>(new ExamCourse("Mathematics"), "Mathematics Department");
        Course<AssignmentCourse> literatureCourse = new Course<>(new AssignmentCourse("English Literature"), "Humanities Department");
        Course<ResearchCourse> physicsResearch = new Course<>(new ResearchCourse("Quantum Physics"), "Physics Department");

        CourseManager manager = new CourseManager();
        manager.addCourse(mathCourse);
        manager.addCourse(literatureCourse);
        manager.addCourse(physicsResearch);

        System.out.println("Available Courses:");
        manager.displayCourses();

        // Finding a course
        System.out.println("\nFinding Mathematics Course:");
        System.out.println(manager.findCourseByName("Mathematics"));

        // Removing a course
        System.out.println("\nRemoving English Literature Course...");
        manager.removeCourse("English Literature");

        System.out.println("\nCourses after removal:");
        manager.displayCourses();
    }

