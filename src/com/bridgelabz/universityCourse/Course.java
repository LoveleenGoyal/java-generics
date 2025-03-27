package com.bridgelabz.universityCourse;

public class Course<T extends CourseType> {
    private T courseType;
    private String department;

    public Course(T courseType, String department) {
        this.courseType = courseType;
        this.department = department;
    }

    public T getCourseType() {
        return courseType;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Course: " + courseType + ", Department: " + department;
    }
}
