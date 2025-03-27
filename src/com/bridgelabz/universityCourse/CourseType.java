package com.bridgelabz.universityCourse;

public
abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + courseName;
    }
}

// Specific course types
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
}

