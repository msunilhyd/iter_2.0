package com.dailycodebuffer.spring.data.jpa.tutorial2.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial2.entity.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial2.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class CourseMaterialRepositoryTest {

    @Autowired
    private CourseMaterialRepository repository;

    @Test
    public void saveCourseMaterial() {

        Course course = Course.builder()
                .title("DSA")
                .credit(6)
                .build();

        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.google.com")
                .course(course)
                .build();

        repository.save(courseMaterial);
    }

    public void printAllCourseMaterials() {
        List<CourseMaterial> courseMaterials =
                repository.findAll();
    }
}