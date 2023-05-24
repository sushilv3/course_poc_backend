package com.sushil.courseservice.service;

import com.sushil.courseservice.entity.Course;

import java.util.List;

public interface CourseServiceImpl {

    public Course saveCourse(Course course);
    public List<Course> getAllCourse();

}
