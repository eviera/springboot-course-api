package net.eviera.pruebas.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourceRepository courceRepository;

    public CourseService() {

    }

    public List<Course> getAllCourses(String topicId) {
        return courceRepository.findByTopicId(topicId);
    }

    public Course getCourse(String id) {
        return courceRepository.findOne(id);
    }

    public void addCourse(Course course) {
        courceRepository.save(course);
    }

    public void updateCourse(Course course) {
        courceRepository.save(course);
    }

    public void deleteCourse(String id) {
        courceRepository.delete(id);
    }
}
