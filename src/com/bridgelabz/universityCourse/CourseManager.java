package com.bridgelabz.universityCourse;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course<? extends CourseType> course : courses) {
            System.out.println(course);
        }
    }

    public Course<? extends CourseType> findCourseByName(String name) {
        for (Course<? extends CourseType> course : courses) {
            if (course.getCourseType().getCourseName().equalsIgnoreCase(name)) {
                return course;
            }
        }
        return null;
    }

    public void removeCourse(String name) {
        courses.removeIf(course -> course.getCourseType().getCourseName().equalsIgnoreCase(name));
    }

